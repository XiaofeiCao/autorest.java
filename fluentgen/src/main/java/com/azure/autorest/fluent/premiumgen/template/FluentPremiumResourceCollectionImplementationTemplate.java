// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen.template;

import com.azure.autorest.fluent.model.FluentPremiumResourceCollection;
import com.azure.autorest.model.clientmodel.IType;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.template.IJavaTemplate;

import java.util.HashSet;
import java.util.Set;

public class FluentPremiumResourceCollectionImplementationTemplate implements IJavaTemplate<FluentPremiumResourceCollection, JavaFile> {
    private static final FluentPremiumResourceCollectionImplementationTemplate INSTANCE = new FluentPremiumResourceCollectionImplementationTemplate();
    public static FluentPremiumResourceCollectionImplementationTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    public void write(FluentPremiumResourceCollection collection, JavaFile javaFile) {
        Set<String> imports = new HashSet<>();
        collection.getInterfaceType().addImportsTo(imports, false);
        StringBuilder parentDeclaration = new StringBuilder();
        IType parentClass = collection.getParentClass();
        if (parentClass != null) {
            parentClass.addImportsTo(imports, false);
            parentDeclaration.append(String.format(" extends %s", parentClass));
        }
        parentDeclaration.append(String.format(" implements %s", collection.getInterfaceType().getName()));

        javaFile.declareImport(imports);
        javaFile.publicFinalClass(
                String.format(
                        "%1$s%2$s",
                        collection.getImplementationType().getName(),
                        parentDeclaration),
                classBlock -> {

        });
    }
}
