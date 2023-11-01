// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.projection.projectedname.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ClientProjectedNameModel model.
 */
@Immutable
public final class ClientProjectedNameModel {
    /*
     * Pass in true
     */
    @Generated
    @JsonProperty(value = "defaultName")
    private boolean clientName;

    /**
     * Creates an instance of ClientProjectedNameModel class.
     * 
     * @param clientName the clientName value to set.
     */
    @Generated
    @JsonCreator
    public ClientProjectedNameModel(@JsonProperty(value = "defaultName") boolean clientName) {
        this.clientName = clientName;
    }

    /**
     * Get the clientName property: Pass in true.
     * 
     * @return the clientName value.
     */
    @Generated
    public boolean isClientName() {
        return this.clientName;
    }
}
