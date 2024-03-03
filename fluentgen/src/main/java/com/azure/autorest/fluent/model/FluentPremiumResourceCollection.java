// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.model;

import com.azure.autorest.fluent.model.clientmodel.FluentResourceCollection;
import com.azure.autorest.fluent.model.clientmodel.FluentStatic;
import com.azure.autorest.fluent.premiumgen.mapper.FluentPremiumResourceModelMapper;
import com.azure.autorest.fluent.premiumgen.model.FluentPremiumResourceModel;
import com.azure.autorest.fluent.premiumgen.model.FluentPremiumType;
import com.azure.autorest.model.clientmodel.ClassType;
import com.azure.autorest.model.clientmodel.IType;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FluentPremiumResourceCollection {
    private final FluentResourceCollection resourceCollection;
    private final FluentPremiumResourceModel resourceModel;

    // (todo xiaofei) here we assume there's only one resource model associated with this resource collection

    public FluentPremiumResourceCollection(FluentResourceCollection resourceCollection) {
        this.resourceCollection = resourceCollection;
        this.resourceModel = FluentPremiumResourceModelMapper
                .getInstance()
                .map(resourceCollection.getResourceCreates().iterator().next().getResourceModel());
    }

    public ClassType getInterfaceType() {
        return resourceCollection.getInterfaceType();
    }

    public FluentPremiumResourceModel getResourceModel() {
        return resourceModel;
    }

    public ClassType getImplementationType() {
        return resourceCollection.getImplementationType();
    }

    public void addImportsTo(Set<String> imports, boolean includeImplementationImports) {
        for (IType supportedInterface : getSupportedInterfaces()) {
            supportedInterface.addImportsTo(imports, false);
        }
    }

    public List<IType> getSupportedInterfaces() {
        return Arrays.asList(FluentPremiumType.supportsDeletingById(), FluentPremiumType.supportsGettingById(resourceModel.getInterfaceType()));
    }

    public IType getParentClass() {
        return FluentPremiumType.groupableResourcesImpl(
                resourceModel.getInterfaceType(),
                resourceModel.getInnerModel(),
                resourceModel.getImplementationType(),
                FluentStatic.getFluentManager());
    }
}
