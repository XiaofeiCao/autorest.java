// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.property.valuetypes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Model with extensible enum properties. */
@Immutable
public final class ExtensibleEnumProperty {
    /*
     * Property
     */
    @Generated
    @JsonProperty(value = "property", required = true)
    private InnerEnum property;

    /**
     * Creates an instance of ExtensibleEnumProperty class.
     *
     * @param property the property value to set.
     */
    @Generated
    @JsonCreator
    public ExtensibleEnumProperty(@JsonProperty(value = "property", required = true) InnerEnum property) {
        this.property = property;
    }

    /**
     * Get the property property: Property.
     *
     * @return the property value.
     */
    @Generated
    public InnerEnum getProperty() {
        return this.property;
    }
}
