// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen.mapper;

import com.azure.autorest.fluent.model.clientmodel.FluentResourceModel;
import com.azure.autorest.fluent.premiumgen.model.FluentPremiumResourceModel;
import com.azure.autorest.mapper.IMapper;

public class FluentPremiumResourceModelMapper implements IMapper<FluentResourceModel, FluentPremiumResourceModel> {
    private static final FluentPremiumResourceModelMapper INSTANCE = new FluentPremiumResourceModelMapper();
    public static FluentPremiumResourceModelMapper getInstance() {
        return INSTANCE;
    }

    @Override
    public FluentPremiumResourceModel map(FluentResourceModel model) {
        return new FluentPremiumResourceModel(model);
    }
}
