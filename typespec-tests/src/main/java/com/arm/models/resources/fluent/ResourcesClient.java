// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.arm.models.resources.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for ResourcesClient class.
 */
public interface ResourcesClient {
    /**
     * Gets Server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Version parameter.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The ID of the target subscription.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the TopLevelArmResourcesClient object to access its operations.
     * 
     * @return the TopLevelArmResourcesClient object.
     */
    TopLevelArmResourcesClient getTopLevelArmResources();

    /**
     * Gets the NestedChildResourcesClient object to access its operations.
     * 
     * @return the NestedChildResourcesClient object.
     */
    NestedChildResourcesClient getNestedChildResources();
}
