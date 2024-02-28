package com.azure.autorest.fluent.premiumgen;

import com.azure.autorest.fluent.model.clientmodel.FluentResourceCollection;
import com.azure.autorest.fluent.model.clientmodel.FluentResourceModel;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.model.javamodel.JavaInterface;
import com.azure.autorest.template.IJavaTemplate;

import java.util.function.Consumer;

public class FluentPremiumResourceModelInterfaceTemplate implements IJavaTemplate<FluentResourceModel, JavaFile> {
    private static final FluentPremiumResourceModelInterfaceTemplate INSTANCE = new FluentPremiumResourceModelInterfaceTemplate();

    public static FluentPremiumResourceModelInterfaceTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    public void write(FluentResourceModel model, JavaFile javaFile) {
        javaFile.publicInterface(model.getInterfaceType().getName(), new Consumer<JavaInterface>() {
            @Override
            public void accept(JavaInterface javaInterface) {
            }
        });
    }
}
