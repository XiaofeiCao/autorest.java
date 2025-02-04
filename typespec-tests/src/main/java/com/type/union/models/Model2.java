// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.union.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The second one of the unioned model type. */
@Immutable
public final class Model2 extends BaseModel {
    /*
     * The prop2 property.
     */
    @Generated
    @JsonProperty(value = "prop2", required = true)
    private int prop2;

    /**
     * Creates an instance of Model2 class.
     *
     * @param name the name value to set.
     * @param prop2 the prop2 value to set.
     */
    @Generated
    @JsonCreator
    public Model2(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "prop2", required = true) int prop2) {
        super(name);
        this.prop2 = prop2;
    }

    /**
     * Get the prop2 property: The prop2 property.
     *
     * @return the prop2 value.
     */
    @Generated
    public int getProp2() {
        return this.prop2;
    }
}
