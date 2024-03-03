// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen;

import com.azure.autorest.extension.base.plugin.NewPlugin;
import com.azure.autorest.fluent.model.FluentPremiumResourceCollection;
import com.azure.autorest.fluent.premiumgen.model.FluentPremiumResourceModel;
import com.azure.autorest.fluent.premiumgen.template.FluentPremiumResourceCollectionImplementationTemplate;
import com.azure.autorest.fluent.premiumgen.template.FluentPremiumResourceCollectionInterfaceTemplate;
import com.azure.autorest.fluent.premiumgen.template.FluentPremiumResourceModelImplementationTemplate;
import com.azure.autorest.fluent.premiumgen.template.FluentPremiumResourceModelInterfaceTemplate;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.model.javamodel.JavaPackage;

public class FluentPremiumJavaPackage extends JavaPackage {
    public FluentPremiumJavaPackage(NewPlugin host) {
        super(host);
    }

    public void addFluentResourceModel(FluentPremiumResourceModel model) {
        JavaFile javaFile = getJavaFileFactory().createSourceFile(
                model.getInterfaceType().getPackage(),
                model.getInterfaceType().getName());
        FluentPremiumResourceModelInterfaceTemplate.getInstance().write(model, javaFile);
        addJavaFile(javaFile);

        javaFile = getJavaFileFactory().createSourceFile(
                model.getImplementationType().getPackage(),
                model.getImplementationType().getName());
        FluentPremiumResourceModelImplementationTemplate.getInstance().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public void addFluentResourceCollection(FluentPremiumResourceCollection collection) {
        JavaFile javaFile = getJavaFileFactory().createSourceFile(
                collection.getInterfaceType().getPackage(),
                collection.getInterfaceType().getName());
        FluentPremiumResourceCollectionInterfaceTemplate.getInstance().write(collection, javaFile);
        addJavaFile(javaFile);

        javaFile = getJavaFileFactory().createSourceFile(
                collection.getImplementationType().getPackage(),
                collection.getImplementationType().getName());
        FluentPremiumResourceCollectionImplementationTemplate.getInstance().write(collection, javaFile);
        addJavaFile(javaFile);
    }
}
