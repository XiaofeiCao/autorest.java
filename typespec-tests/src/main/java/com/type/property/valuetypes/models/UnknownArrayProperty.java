// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.property.valuetypes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Model with a property unknown, and the data is an array. */
@Immutable
public final class UnknownArrayProperty {
    /*
     * Property
     */
    @Generated
    @JsonProperty(value = "property", required = true)
    private Object property;

    /**
     * Creates an instance of UnknownArrayProperty class.
     *
     * @param property the property value to set.
     */
    @Generated
    @JsonCreator
    public UnknownArrayProperty(@JsonProperty(value = "property", required = true) Object property) {
        this.property = property;
    }

    /**
     * Get the property property: Property.
     *
     * @return the property value.
     */
    @Generated
    public Object getProperty() {
        return this.property;
    }
}
