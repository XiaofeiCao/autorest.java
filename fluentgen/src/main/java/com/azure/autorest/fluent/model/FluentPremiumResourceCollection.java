// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.model;

import com.azure.autorest.fluent.model.clientmodel.FluentResourceCollection;
import com.azure.autorest.model.clientmodel.ClassType;

public class FluentPremiumResourceCollection {
    private final FluentResourceCollection resourceCollection;

    public FluentPremiumResourceCollection(FluentResourceCollection resourceCollection) {
        this.resourceCollection = resourceCollection;
    }

    public ClassType getInterfaceType() {
        return resourceCollection.getInterfaceType();
    }

    public ClassType getImplementationType() {
        return resourceCollection.getImplementationType();
    }
}
