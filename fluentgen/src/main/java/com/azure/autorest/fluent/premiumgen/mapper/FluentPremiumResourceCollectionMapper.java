// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen.mapper;

import com.azure.autorest.fluent.model.FluentPremiumResourceCollection;
import com.azure.autorest.fluent.model.clientmodel.FluentResourceCollection;
import com.azure.autorest.mapper.IMapper;

public class FluentPremiumResourceCollectionMapper implements IMapper<FluentResourceCollection, FluentPremiumResourceCollection> {
    private static final FluentPremiumResourceCollectionMapper INSTANCE = new FluentPremiumResourceCollectionMapper();

    public static FluentPremiumResourceCollectionMapper getInstance() {
        return INSTANCE;
    }
    @Override
    public FluentPremiumResourceCollection map(FluentResourceCollection collection) {
        return new FluentPremiumResourceCollection(collection);
    }
}
