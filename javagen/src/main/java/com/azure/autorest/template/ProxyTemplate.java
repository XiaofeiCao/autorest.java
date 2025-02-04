// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.template;

import com.azure.autorest.extension.base.model.codemodel.RequestParameterLocation;
import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.model.clientmodel.ClassType;
import com.azure.autorest.model.clientmodel.IType;
import com.azure.autorest.model.clientmodel.Proxy;
import com.azure.autorest.model.clientmodel.ProxyMethod;
import com.azure.autorest.model.clientmodel.ProxyMethodParameter;
import com.azure.autorest.model.javamodel.JavaClass;
import com.azure.autorest.model.javamodel.JavaInterface;
import com.azure.autorest.model.javamodel.JavaVisibility;
import com.azure.autorest.util.CodeNamer;
import com.azure.core.http.ContentType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Writes a Proxy to a JavaClass block.
 */
public class ProxyTemplate implements IJavaTemplate<Proxy, JavaClass> {
    private static final ProxyTemplate INSTANCE = new ProxyTemplate();

    protected ProxyTemplate() {
    }

    public static ProxyTemplate getInstance() {
        return INSTANCE;
    }

    public final void write(Proxy restAPI, JavaClass classBlock) {
        JavaSettings settings = JavaSettings.getInstance();
        if (restAPI != null) {
            classBlock.javadocComment(settings.getMaximumJavadocCommentWidth(), comment ->
            {
                comment.description(String.format("The interface defining all the services for %1$s to be used by the proxy service to perform REST calls.", restAPI.getClientTypeName()));
            });
            classBlock.annotation(String.format("Host(\"%1$s\")", restAPI.getBaseURL()));
            classBlock.annotation(String.format("ServiceInterface(name = \"%1$s\")", serviceInterfaceWithLengthLimit(restAPI.getClientTypeName())));

            JavaVisibility visibility = JavaVisibility.Private;
            if (settings.isServiceInterfaceAsPublic()) {
                visibility = JavaVisibility.Public;
            }

            classBlock.interfaceBlock(visibility, restAPI.getName(), interfaceBlock ->
            {
                for (ProxyMethod restAPIMethod : restAPI.getMethods()) {
                    if (restAPIMethod.getRequestContentType().equals("multipart/form-data") || restAPIMethod.getRequestContentType().equals("application/x-www-form-urlencoded")) {
                        interfaceBlock.lineComment(String.format("@Multipart not supported by %1$s", ClassType.RestProxy.getName()));
                    }

                    writeProxyMethodHeaders(restAPIMethod, interfaceBlock);

                    interfaceBlock.annotation(String.format("%1$s(\"%2$s\")", CodeNamer.toPascalCase(restAPIMethod.getHttpMethod().toString().toLowerCase()), restAPIMethod.getUrlPath()));

                    if (!restAPIMethod.getResponseExpectedStatusCodes().isEmpty()) {
                        interfaceBlock.annotation(String.format("ExpectedResponses({%1$s})", restAPIMethod.getResponseExpectedStatusCodes().stream().map(String::valueOf).collect(Collectors.joining(", "))));
                    }

                    if (!settings.isDataPlaneClient()) {
                        if (restAPIMethod.getReturnValueWireType() != null) {
                            interfaceBlock.annotation(String.format("ReturnValueWireType(%1$s.class)",
                                    restAPIMethod.getReturnValueWireType()));
                        }
                    }

                    if (!settings.isDataPlaneClient() || isExceptionCustomized()) {
                        // write @UnexpectedResponseExceptionType

                        if (restAPIMethod.getUnexpectedResponseExceptionTypes() != null) {
                            writeUnexpectedExceptions(restAPIMethod, interfaceBlock);
                        }

                        if (restAPIMethod.getUnexpectedResponseExceptionType() != null) {
                            writeSingleUnexpectedException(restAPIMethod, interfaceBlock);
                        }
                    }

                    ArrayList<String> parameterDeclarationList = new ArrayList<>();
                    if (restAPIMethod.isResumable()) {
                        interfaceBlock.annotation("ResumeOperation");
                    }

                    for (ProxyMethodParameter parameter : restAPIMethod.getParameters()) {
                        StringBuilder parameterDeclarationBuilder = new StringBuilder();
                        RequestParameterLocation location = parameter.getRequestParameterLocation();

                        switch (location) {
                            case URI:
                            case PATH:
                            case QUERY:
                            case HEADER:
                                parameterDeclarationBuilder.append(String.format("@%1$sParam(", CodeNamer.toPascalCase(location.toString())));
                                if (location == RequestParameterLocation.QUERY && parameter.getAlreadyEncoded() && parameter.getExplode()) {
                                    parameterDeclarationBuilder.append(String.format("value = \"%1$s\", encoded = true, multipleQueryParams = true", parameter.getRequestParameterName()));
                                } else if (location == RequestParameterLocation.QUERY && parameter.getExplode()) {
                                    parameterDeclarationBuilder.append(String.format("value = \"%1$s\", multipleQueryParams = true", parameter.getRequestParameterName()));
                                } else if ((location == RequestParameterLocation.PATH ||
                                            location == RequestParameterLocation.QUERY)
                                        && parameter.getAlreadyEncoded()) {
                                    parameterDeclarationBuilder.append(String.format("value = \"%1$s\", encoded = true", parameter.getRequestParameterName()));
                                } else if (location == RequestParameterLocation.HEADER && parameter.getHeaderCollectionPrefix() != null
                                        && !parameter.getHeaderCollectionPrefix().isEmpty()) {
                                    parameterDeclarationBuilder.append(String.format("\"%1$s\"", parameter.getHeaderCollectionPrefix()));
                                } else {
                                    parameterDeclarationBuilder.append(String.format("\"%1$s\"", parameter.getRequestParameterName()));
                                }
                                parameterDeclarationBuilder.append(") ");

                                break;

                            case BODY:
                                if (ContentType.APPLICATION_X_WWW_FORM_URLENCODED.equals(restAPIMethod.getRequestContentType())) {
                                    parameterDeclarationBuilder.append(String.format("@FormParam(\"%1$s\") ",
                                            parameter.getRequestParameterName()));
                                    break;
                                }
                                parameterDeclarationBuilder.append(String.format("@BodyParam(\"%1$s\") ", restAPIMethod.getRequestContentType()));
                                break;

                           // case FormData:
                           //     parameterDeclarationBuilder.append(String.format("@FormParam(\"%1$s\") ", parameter.getRequestParameterName()));
                           //     break;

                            case NONE:
                                break;

                            default:
                                if (!restAPIMethod.isResumable() && parameter.getWireType() != ClassType.Context) {
                                    throw new IllegalArgumentException("Unrecognized RequestParameterLocation value: " + location);
                                }

                                break;
                        }

                        parameterDeclarationBuilder.append(parameter.getWireType()).append(" ")
                            .append(parameter.getName());
                        parameterDeclarationList.add(parameterDeclarationBuilder.toString());
                    }

                    writeProxyMethodSignature(parameterDeclarationList, restAPIMethod, interfaceBlock);
                }
            });
        }
    }

    protected void writeUnexpectedExceptions(ProxyMethod restAPIMethod, JavaInterface interfaceBlock) {
        for (Map.Entry<ClassType, List<Integer>> exception : restAPIMethod.getUnexpectedResponseExceptionTypes().entrySet()) {
            interfaceBlock.annotation(String.format("UnexpectedResponseExceptionType(value = %1$s.class, code = {%2$s})",
                    exception.getKey(), exception.getValue().stream().map(String::valueOf).collect(Collectors.joining(", "))));
        }
    }

    protected void writeSingleUnexpectedException(ProxyMethod restAPIMethod, JavaInterface interfaceBlock) {
        interfaceBlock.annotation(String.format("UnexpectedResponseExceptionType(%1$s.class)", restAPIMethod.getUnexpectedResponseExceptionType()));
    }

    protected void writeProxyMethodSignature(java.util.ArrayList<String> parameterDeclarationList, ProxyMethod restAPIMethod, JavaInterface interfaceBlock) {
        String parameterDeclarations = String.join(", ", parameterDeclarationList);
        IType restAPIMethodReturnValueClientType = restAPIMethod.getReturnType().getClientType();
        interfaceBlock.publicMethod(String.format("%1$s %2$s(%3$s)", restAPIMethodReturnValueClientType, restAPIMethod.getName(), parameterDeclarations));
    }

    private static String serviceInterfaceWithLengthLimit(String serviceInterfaceName) {
        final int lengthLimit = 20;

        return serviceInterfaceName.length() > lengthLimit
                ? serviceInterfaceName.substring(0, lengthLimit)
                : serviceInterfaceName;
    }

    /**
     * Extension to write Headers annotation for proxy method.
     *
     * @param restAPIMethod proxy method
     * @param interfaceBlock interface block
     */
    protected void writeProxyMethodHeaders(ProxyMethod restAPIMethod, JavaInterface interfaceBlock) {
    }

    private static boolean isExceptionCustomized() {
        JavaSettings settings = JavaSettings.getInstance();
        return settings.getDefaultHttpExceptionType() != null
                || settings.isUseDefaultHttpStatusCodeToExceptionTypeMapping()
                || settings.getHttpStatusCodeToExceptionTypeMapping() != null;
    }
}
