// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen;

import com.azure.autorest.fluent.model.clientmodel.FluentResourceModel;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.template.IJavaTemplate;

public class FluentPremiumResourceModelImplementationTemplate implements IJavaTemplate<FluentResourceModel, JavaFile> {
    private static final FluentPremiumResourceModelImplementationTemplate INSTANCE = new FluentPremiumResourceModelImplementationTemplate();

    public static FluentPremiumResourceModelImplementationTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    public void write(FluentResourceModel model, JavaFile javaFile) {

        javaFile.publicFinalClass(String.format("%1$s implements %2$s", model.getImplementationType().getName(), model.getInterfaceType().getName()), classBlock -> {

        });
    }
}
