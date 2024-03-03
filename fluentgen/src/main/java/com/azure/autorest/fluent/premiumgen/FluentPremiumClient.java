// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.premiumgen;

import com.azure.autorest.fluent.model.FluentPremiumResourceCollection;
import com.azure.autorest.fluent.model.clientmodel.FluentClient;
import com.azure.autorest.fluent.model.clientmodel.FluentResourceModel;
import com.azure.autorest.fluent.model.clientmodel.FluentStatic;
import com.azure.autorest.fluent.model.clientmodel.fluentmodel.create.ResourceCreate;
import com.azure.autorest.fluent.premiumgen.mapper.FluentPremiumResourceCollectionMapper;
import com.azure.autorest.fluent.premiumgen.mapper.FluentPremiumResourceModelMapper;
import com.azure.autorest.fluent.premiumgen.model.FluentPremiumResourceModel;
import com.azure.autorest.fluent.util.FluentJavaSettings;
import com.azure.core.util.CoreUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FluentPremiumClient {
    private final FluentClient fluentClient;
    private final List<FluentPremiumResourceModel> resourceModels = new ArrayList<>();
    private final List<FluentPremiumResourceCollection> resourceCollections = new ArrayList<>();

    public FluentPremiumClient(FluentClient fluentClient) {
        this.fluentClient = fluentClient;
        FluentJavaSettings fluentJavaSettings = FluentStatic.getFluentJavaSettings();
        Set<String> modelsForPremium = fluentJavaSettings.getModelsForPremium();
        // filter out models/collections to generate
        if (!CoreUtils.isNullOrEmpty(modelsForPremium)) {
            List<ResourceCreate> resourceCreates = fluentClient.getResourceModels().stream()
                    .filter(model -> modelsForPremium.contains(model.getName()))
                    .map(FluentResourceModel::getResourceCreate)
                    .collect(Collectors.toList());
            for (ResourceCreate resourceCreate : resourceCreates) {
                // premium model/implementation template
                resourceModels.add(FluentPremiumResourceModelMapper.getInstance().map(resourceCreate.getResourceModel()));
                // premium collection/implementation template
                resourceCollections.add(FluentPremiumResourceCollectionMapper.getInstance().map(resourceCreate.getResourceCollection()));
            }
        }
    }

    public List<FluentPremiumResourceModel> getResourceModels() {
        return resourceModels;
    }

    public List<FluentPremiumResourceCollection> getResourceCollections() {
        return resourceCollections;
    }
}
