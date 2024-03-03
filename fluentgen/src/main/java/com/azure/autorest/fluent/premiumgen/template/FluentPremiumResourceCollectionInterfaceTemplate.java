// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen.template;

import com.azure.autorest.fluent.model.FluentPremiumResourceCollection;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.template.IJavaTemplate;

public class FluentPremiumResourceCollectionInterfaceTemplate implements IJavaTemplate<FluentPremiumResourceCollection, JavaFile> {
    private static final FluentPremiumResourceCollectionInterfaceTemplate INSTANCE = new FluentPremiumResourceCollectionInterfaceTemplate();

    public static FluentPremiumResourceCollectionInterfaceTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    public void write(FluentPremiumResourceCollection collection, JavaFile javaFile) {
        javaFile.publicInterface(collection.getInterfaceType().getName(), interfaceBlock -> {

        });
    }
}
