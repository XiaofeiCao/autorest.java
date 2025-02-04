// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.


package com.azure.autorest.util;

import com.azure.autorest.extension.base.plugin.NewPlugin;
import com.azure.autorest.extension.base.plugin.PluginLogger;
import com.azure.autorest.model.clientmodel.ClassType;
import com.azure.autorest.model.clientmodel.GenericType;
import com.azure.autorest.model.clientmodel.IType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import reactor.core.publisher.Mono;

import java.util.Arrays;

public class ReturnTypeDescriptionAssembler {
    private final PluginLogger logger;

    public ReturnTypeDescriptionAssembler(NewPlugin host) {
        logger = new PluginLogger(host, ReturnTypeDescriptionAssembler.class);
    }

    /**
     * Assemble description for return types.
     * @param description   parsed swagger description of the returnType, either from operation description, or schema itself
     * @param returnType    actual returnType that needs documentation
     * @param baseType      baseType of the returnType
     * @return  assembled description
     */
    public String assemble(String description, IType returnType, IType baseType) {
        if (returnType instanceof GenericType) {
            description = assembleForGeneric(description, (GenericType) returnType, baseType);
        }
        return description;
    }

    private String assembleForGeneric(String description, GenericType returnType, IType baseType) {
        String assembledDesc = description;
        if (isGenericTypeClassSubclassOf(returnType, Mono.class)) {
            assembledDesc = assembleForMono(description, returnType, baseType);
        } else if (isGenericTypeClassSubclassOf(returnType, Response.class)) {
            assembledDesc = assembleForResponse(description, returnType, baseType);
        } else if (isGenericTypeClassSubclassOf(returnType, PagedIterable.class, PagedFlux.class)) {
            assembledDesc = assembleForPagination(description, returnType, baseType);
        } else if (isGenericTypeClassSubclassOf(returnType, SyncPoller.class, PollerFlux.class)) {
            assembledDesc = assembleForPoller(description, returnType, baseType);
        }
        return assembledDesc;
    }

    /*
    Mono<Void> - A {@link Mono} that completes when a successful response is received
    Mono<Response<?>> - "Response return type description" on successful completion of {@link Mono}
    Mono<T> - "something" on successful completion of {@link Mono} (something here is the description in the operation)
    Mono<OtherType> - the response body on successful completion of {@link Mono}
     */
    private String assembleForMono(String description, GenericType returnType, IType baseType) {
        String assembledDesc;
        if (isGenericTypeClassSubclassOf(returnType.getTypeArguments()[0], Response.class)) { // Mono<Response<?>>
            assembledDesc = String.format(
                    "%s on successful completion of {@link Mono}",
                    assembleForResponse(description, (GenericType) returnType.getTypeArguments()[0], baseType)
            );
        } else {
            if (description == null) {
                if (ClassType.Void == baseType.asNullable()) { // Mono<Void>
                    assembledDesc = String.format("A {@link %s} that completes when a successful response is received", returnType.getName());
                } else { // Mono<OtherType>
                    assembledDesc = String.format("the response body on successful completion of {@link %s}", returnType.getName());
                }
            } else { // Mono<T>
                assembledDesc = String.format("%s on successful completion of {@link %s}", description, returnType.getName());
            }
        }
        return assembledDesc;
    }

    /*
    Response<Void> - the {@link Response}
    Response<T> - "something" along with {@link Response}
    Response<OtherType> - the response body along with {@link Response}
     */
    private String assembleForResponse(String description, GenericType returnType, IType baseType) {
        String assembledDesc;
        if (description == null) {
            if (ClassType.Void == baseType.asNullable()) { // Response<Void>
                assembledDesc = String.format("the {@link %s}", returnType.getName());
            } else { // Response<OtherType>
                assembledDesc = String.format("the response body along with {@link %s}", returnType.getName());
            }
        } else { // Response<T>
            assembledDesc = String.format("%s along with {@link %s}", description, returnType.getName());
        }
        return assembledDesc;
    }

    /*
    PagedIterable<T> - "something" as paginated response with {@link PagedIterable}
    PagedIterable<OtherType> - the paginated response with {@link PagedIterable}
     */
    private String assembleForPagination(String description, GenericType returnType, IType baseType) {
        String assembledDesc;
        if (description == null) {
            assembledDesc = String.format("the paginated response with {@link %s}", returnType.getName());
        } else { // Response<T>
            assembledDesc = String.format("%s as paginated response with {@link %s}", description, returnType.getName());
        }
        return assembledDesc;
    }

    /*
    SyncPoller<S, T> - the {@link SyncPoller} for polling of "something"
    SyncPoller<S, OtherType> - the {@link SyncPoller} for polling of long-running operation
     */
    private String assembleForPoller(String description, GenericType returnType, IType baseType) {
        String assembledDesc;
        if (description == null) {
            assembledDesc = String.format("the {@link %s} for polling of long-running operation", returnType.getName());
        } else { // Response<T>
            assembledDesc = String.format("the {@link %2$s} for polling of %1$s", description, returnType.getName());
        }
        return assembledDesc;
    }

    private boolean isGenericTypeClassSubclassOf(IType type, Class<?>... parentClasses) {
        if (!(type instanceof GenericType)) return false;
        Class<?> genericClass = getGenericClass((GenericType) type);
        return genericClass != null && Arrays.stream(parentClasses).anyMatch(p -> p.isAssignableFrom(genericClass));
    }

    private Class<?> getGenericClass(GenericType type) {
        String className = String.format("%s.%s", type.getPackage(), type.getName());
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            logger.warn(String.format("class %s not found!", className), e);
            return null;
        }
    }

}
