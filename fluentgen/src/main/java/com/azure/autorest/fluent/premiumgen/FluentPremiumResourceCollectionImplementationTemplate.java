package com.azure.autorest.fluent.premiumgen;

import com.azure.autorest.fluent.model.clientmodel.FluentResourceCollection;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.template.IJavaTemplate;

public class FluentPremiumResourceCollectionImplementationTemplate implements IJavaTemplate<FluentResourceCollection, JavaFile> {
    private static final FluentPremiumResourceCollectionImplementationTemplate INSTANCE = new FluentPremiumResourceCollectionImplementationTemplate();
    public static FluentPremiumResourceCollectionImplementationTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    public void write(FluentResourceCollection collection, JavaFile javaFile) {
        javaFile.publicFinalClass(String.format("%1$s implements %2$s", collection.getImplementationType().getName(), collection.getInterfaceType().getName()), classBlock -> {
        });
    }
}
