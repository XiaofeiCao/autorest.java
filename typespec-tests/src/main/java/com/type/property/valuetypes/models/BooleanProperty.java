// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.property.valuetypes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Model with a boolean property. */
@Immutable
public final class BooleanProperty {
    /*
     * Property
     */
    @Generated
    @JsonProperty(value = "property", required = true)
    private boolean property;

    /**
     * Creates an instance of BooleanProperty class.
     *
     * @param property the property value to set.
     */
    @Generated
    @JsonCreator
    public BooleanProperty(@JsonProperty(value = "property", required = true) boolean property) {
        this.property = property;
    }

    /**
     * Get the property property: Property.
     *
     * @return the property value.
     */
    @Generated
    public boolean isProperty() {
        return this.property;
    }
}
