// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen.template;

import com.azure.autorest.fluent.model.FluentPremiumResourceCollection;
import com.azure.autorest.model.clientmodel.IType;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.template.IJavaTemplate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FluentPremiumResourceCollectionInterfaceTemplate implements IJavaTemplate<FluentPremiumResourceCollection, JavaFile> {
    private static final FluentPremiumResourceCollectionInterfaceTemplate INSTANCE = new FluentPremiumResourceCollectionInterfaceTemplate();

    public static FluentPremiumResourceCollectionInterfaceTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    public void write(FluentPremiumResourceCollection collection, JavaFile javaFile) {
        Set<String> imports = new HashSet<>();
        collection.addImportsTo(imports, false);
        javaFile.declareImport(imports);
        // parent interface
        List<String> supportedInterfaces = collection.getSupportedInterfaces()
                .stream().map(IType::toString).collect(Collectors.toList());
        String parentDeclaration = !supportedInterfaces.isEmpty() ? String.format(" extends %1$s", String.join(", ", supportedInterfaces)) : "";

        // method signature
        javaFile.publicInterface(String.format("%1$s%2$s", collection.getInterfaceType().getName(), parentDeclaration), interfaceBlock -> {
        });
    }
}
