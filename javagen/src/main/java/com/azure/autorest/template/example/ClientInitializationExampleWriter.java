// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.template.example;

import com.azure.autorest.extension.base.model.codemodel.Scheme;
import com.azure.autorest.model.clientmodel.AsyncSyncClient;
import com.azure.autorest.model.clientmodel.ClassType;
import com.azure.autorest.model.clientmodel.ClientMethod;
import com.azure.autorest.model.clientmodel.ProxyMethodExample;
import com.azure.autorest.model.clientmodel.ProxyMethodParameter;
import com.azure.autorest.model.clientmodel.ServiceClient;
import com.azure.autorest.model.clientmodel.ServiceClientProperty;
import com.azure.autorest.model.javamodel.JavaBlock;
import com.azure.autorest.util.CodeNamer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

/** Client initialization example writer for DPG methods. */
public class ClientInitializationExampleWriter {
    private final Set<String> imports = new HashSet<>();
    private final Consumer<JavaBlock> clientInitializationWriter;
    private final String clientVarName;

    public ClientInitializationExampleWriter(
            AsyncSyncClient syncClient,
            ClientMethod method,
            ProxyMethodExample proxyMethodExample,
            ServiceClient serviceClient){
        syncClient.addImportsTo(imports, false);
        syncClient.getClientBuilder().addImportsTo(imports, false);
        clientVarName = CodeNamer.toCamelCase(syncClient.getClassName());
        final String builderName = syncClient.getClientBuilder().getClassName();

        // credential
        imports.add("com.azure.identity.DefaultAzureCredentialBuilder");
        ClassType.AzureKeyCredential.addImportsTo(imports, false);
        ClassType.Configuration.addImportsTo(imports, false);

        // client initialization
        List<String> clientParameterLines = new ArrayList<>();
        Set<ServiceClientProperty> processedServiceClientProperties = new HashSet<>();

        // proxy method parameters which value comes from client
        method.getProxyMethod().getAllParameters()
                .stream()
                .filter(ProxyMethodParameter::isFromClient)
                .forEach(p -> {
                    for (Map.Entry<String, ProxyMethodExample.ParameterValue> entry : proxyMethodExample.getParameters().entrySet()) {
                        String parameterName = entry.getKey();
                        ProxyMethodExample.ParameterValue parameterValue = entry.getValue();
                        if (parameterName.equalsIgnoreCase(p.getName())) {
                            String clientValue = p.getClientType()
                                    .defaultValueExpression(parameterValue.getObjectValue().toString());
                            serviceClient.getProperties().stream().filter(p1 -> Objects.equals(p.getName(), p1.getName())).findFirst().ifPresent(serviceClientProperty -> {
                                processedServiceClientProperties.add(serviceClientProperty);

                                clientParameterLines.add(
                                        String.format(".%1$s(%2$s)", serviceClientProperty.getAccessorMethodSuffix(), clientValue));
                            });
                        }
                    }
                });

        // required service client properties
        serviceClient.getProperties().stream().filter(ServiceClientProperty::isRequired).filter(p -> !processedServiceClientProperties.contains(p)).forEach(serviceClientProperty -> {
            String defaultValueExpression = serviceClientProperty.getDefaultValueExpression();
            if (defaultValueExpression == null) {
                defaultValueExpression = String.format("Configuration.getGlobalConfiguration().get(\"%1$s\")",
                        serviceClientProperty.getName().toUpperCase(Locale.ROOT));
            }

            clientParameterLines.add(
                    String.format(".%1$s(%2$s)", serviceClientProperty.getAccessorMethodSuffix(), defaultValueExpression));
        });
        String clientParameterExpr = String.join("", clientParameterLines);

        // credentials
        String credentialExpr;
        if (serviceClient.getSecurityInfo() != null && serviceClient.getSecurityInfo().getSecurityTypes() != null) {
            if (serviceClient.getSecurityInfo().getSecurityTypes().contains(Scheme.SecuritySchemeType.OAUTH2)) {
                credentialExpr = ".credential(new DefaultAzureCredentialBuilder().build())";
            } else if (serviceClient.getSecurityInfo().getSecurityTypes().contains(Scheme.SecuritySchemeType.KEY)) {
                credentialExpr = ".credential(new AzureKeyCredential(Configuration.getGlobalConfiguration().get(\"API_KEY\")))";
            } else {
                credentialExpr = "";
            }
        } else {
            credentialExpr = "";
        }

        this.clientInitializationWriter = methodBlock -> {
            // client
            String clientInit = "%1$s %2$s = new %3$s()" +
                    "%4$s" +  // credentials
                    "%5$s" +  // client properties
                    ".%6$s();";
            methodBlock.line(
                    String.format(clientInit,
                            syncClient.getClassName(), clientVarName,
                            builderName,
                            credentialExpr,
                            clientParameterExpr,
                            syncClient.getClientBuilder().getBuilderMethodNameForSyncClient(syncClient)));
        };
    }

    public Set<String> getImports() {
        return new HashSet<>(this.imports);
    }

    public void write(JavaBlock methodBlock) {
        this.clientInitializationWriter.accept(methodBlock);
    }

    public String getClientVarName() {
        return clientVarName;
    }
}
