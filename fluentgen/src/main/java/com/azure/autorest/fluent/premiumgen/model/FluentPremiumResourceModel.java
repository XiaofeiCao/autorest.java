// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen.model;

import com.azure.autorest.fluent.model.clientmodel.FluentResourceModel;
import com.azure.autorest.model.clientmodel.ClassType;

public class FluentPremiumResourceModel {
    private final FluentResourceModel resourceModel;

    public FluentPremiumResourceModel(FluentResourceModel resourceModel) {
        this.resourceModel = resourceModel;
    }

    public ClassType getInterfaceType() {
        return resourceModel.getInterfaceType();
    }

    public ClassType getImplementationType() {
        return resourceModel.getImplementationType();
    }
}
