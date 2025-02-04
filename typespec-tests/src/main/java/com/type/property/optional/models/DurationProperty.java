// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.property.optional.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Model with a duration property. */
@Fluent
public final class DurationProperty {
    /*
     * Property
     */
    @Generated
    @JsonProperty(value = "property")
    private Duration property;

    /** Creates an instance of DurationProperty class. */
    @Generated
    public DurationProperty() {}

    /**
     * Get the property property: Property.
     *
     * @return the property value.
     */
    @Generated
    public Duration getProperty() {
        return this.property;
    }

    /**
     * Set the property property: Property.
     *
     * @param property the property value to set.
     * @return the DurationProperty object itself.
     */
    @Generated
    public DurationProperty setProperty(Duration property) {
        this.property = property;
        return this;
    }
}
