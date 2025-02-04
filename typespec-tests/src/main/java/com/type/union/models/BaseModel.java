// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.union.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This is a base model. */
@Immutable
public class BaseModel {
    /*
     * The name property.
     */
    @Generated
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Creates an instance of BaseModel class.
     *
     * @param name the name value to set.
     */
    @Generated
    @JsonCreator
    public BaseModel(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
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
}
