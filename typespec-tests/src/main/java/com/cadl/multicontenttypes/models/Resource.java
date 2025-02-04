// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.multicontenttypes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Resource model. */
@Immutable
public final class Resource {
    /*
     * The id property.
     */
    @Generated
    @JsonProperty(value = "id", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name property.
     */
    @Generated
    @JsonProperty(value = "name", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /** Creates an instance of Resource class. */
    @Generated
    public Resource() {}

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
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
