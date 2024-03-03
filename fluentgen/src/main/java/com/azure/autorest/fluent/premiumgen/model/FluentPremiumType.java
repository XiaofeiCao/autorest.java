// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen.model;

import com.azure.autorest.fluent.model.clientmodel.FluentManager;
import com.azure.autorest.model.clientmodel.ClassType;
import com.azure.autorest.model.clientmodel.ClientModel;
import com.azure.autorest.model.clientmodel.GenericType;
import com.azure.autorest.model.clientmodel.IType;

public class FluentPremiumType {

    public static ClassType supportsDeletingById() {
        return new ClassType.Builder()
                .packageName("com.azure.resourcemanager.resources.fluentcore.collection")
                .name("SupportsDeletingById")
                .build();
    }

    public static GenericType supportsGettingById(IType resourceModelInterfaceType) {
        return new GenericType("com.azure.resourcemanager.resources.fluentcore.arm.collection", "SupportsGettingById", resourceModelInterfaceType);
    }

    public static GenericType groupableResourcesImpl(ClassType interfaceType, ClientModel innerModel, ClassType implementationType, FluentManager fluentManager) {
        return new GenericType("com.azure.resourcemanager.resources.fluentcore.arm.models.implementation",
                "GroupableResourceImpl",
                interfaceType,
                innerModel.getType(),
                implementationType,
                fluentManager.getType());
    }
}
