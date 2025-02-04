// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.model.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Resource2 model. */
@Immutable
public final class Resource2 {
    /*
     * The name property.
     */
    @Generated
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The data2 property.
     */
    @Generated
    @JsonProperty(value = "data2", required = true)
    private InputOutputData2 data2;

    /**
     * Creates an instance of Resource2 class.
     *
     * @param name the name value to set.
     * @param data2 the data2 value to set.
     */
    @Generated
    @JsonCreator
    public Resource2(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "data2", required = true) InputOutputData2 data2) {
        this.name = name;
        this.data2 = data2;
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the data2 property: The data2 property.
     *
     * @return the data2 value.
     */
    @Generated
    public InputOutputData2 getData2() {
        return this.data2;
    }
}
