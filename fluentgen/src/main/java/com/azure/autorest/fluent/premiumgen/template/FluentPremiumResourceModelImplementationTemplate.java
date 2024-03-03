// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen.template;

import com.azure.autorest.fluent.premiumgen.model.FluentPremiumResourceModel;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.template.IJavaTemplate;

import java.util.HashSet;
import java.util.Set;

public class FluentPremiumResourceModelImplementationTemplate implements IJavaTemplate<FluentPremiumResourceModel, JavaFile> {
    private static final FluentPremiumResourceModelImplementationTemplate INSTANCE = new FluentPremiumResourceModelImplementationTemplate();

    public static FluentPremiumResourceModelImplementationTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    public void write(FluentPremiumResourceModel model, JavaFile javaFile) {
        Set<String> imports = new HashSet<>();
        model.getInterfaceType().addImportsTo(imports, false);

        javaFile.declareImport(imports);
        javaFile.publicFinalClass(String.format("%1$s implements %2$s", model.getImplementationType().getName(), model.getInterfaceType().getName()), classBlock -> {

        });
    }
}
