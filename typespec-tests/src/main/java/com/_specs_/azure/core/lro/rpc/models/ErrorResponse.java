// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com._specs_.azure.core.lro.rpc.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.models.ResponseError;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A response containing error details. */
@Immutable
public final class ErrorResponse {
    /*
     * The error object.
     */
    @Generated
    @JsonProperty(value = "error", required = true)
    private ResponseError error;

    /**
     * Creates an instance of ErrorResponse class.
     *
     * @param error the error value to set.
     */
    @Generated
    @JsonCreator
    private ErrorResponse(@JsonProperty(value = "error", required = true) ResponseError error) {
        this.error = error;
    }

    /**
     * Get the error property: The error object.
     *
     * @return the error value.
     */
    @Generated
    public ResponseError getError() {
        return this.error;
    }
}
