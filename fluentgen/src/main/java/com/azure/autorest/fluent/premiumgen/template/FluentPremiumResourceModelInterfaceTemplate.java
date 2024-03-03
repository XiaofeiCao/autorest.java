// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen.template;

import com.azure.autorest.fluent.premiumgen.model.FluentPremiumResourceModel;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.model.javamodel.JavaInterface;
import com.azure.autorest.template.IJavaTemplate;

import java.util.function.Consumer;

public class FluentPremiumResourceModelInterfaceTemplate implements IJavaTemplate<FluentPremiumResourceModel, JavaFile> {
    private static final FluentPremiumResourceModelInterfaceTemplate INSTANCE = new FluentPremiumResourceModelInterfaceTemplate();

    public static FluentPremiumResourceModelInterfaceTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    public void write(FluentPremiumResourceModel model, JavaFile javaFile) {
        javaFile.publicInterface(model.getInterfaceType().getName(), new Consumer<JavaInterface>() {
            @Override
            public void accept(JavaInterface javaInterface) {
            }
        });
    }
}
