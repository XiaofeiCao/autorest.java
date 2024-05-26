// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.arm.models.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The updatable properties of the TopLevelArmResource.
 */
@Fluent
public final class TopLevelArmResourceUpdateProperties {
    /*
     * The description of the resource.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of TopLevelArmResourceUpdateProperties class.
     */
    public TopLevelArmResourceUpdateProperties() {
    }

    /**
     * Get the description property: The description of the resource.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the resource.
     * 
     * @param description the description value to set.
     * @return the TopLevelArmResourceUpdateProperties object itself.
     */
    public TopLevelArmResourceUpdateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
