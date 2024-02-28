package com.azure.autorest.fluent.premiumgen;

import com.azure.autorest.fluent.model.clientmodel.FluentResourceCollection;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.template.IJavaTemplate;

public class FluentPremiumResourceCollectionInterfaceTemplate implements IJavaTemplate<FluentResourceCollection, JavaFile> {
    private static final FluentPremiumResourceCollectionInterfaceTemplate INSTANCE = new FluentPremiumResourceCollectionInterfaceTemplate();

    public static FluentPremiumResourceCollectionInterfaceTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    public void write(FluentResourceCollection collection, JavaFile javaFile) {
        javaFile.publicInterface(collection.getInterfaceType().getName(), interfaceBlock -> {

        });
    }
}
