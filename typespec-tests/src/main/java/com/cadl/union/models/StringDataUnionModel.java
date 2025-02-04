// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.union.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonValue;

/** The StringDataUnionModel model. */
@Immutable
public final class StringDataUnionModel extends DataUnionModelBase {
    private final String value;

    /**
     * Creates an instance of StringDataUnionModel class.
     *
     * @param value the value.
     */
    public StringDataUnionModel(String value) {
        this.value = value;
    }

    /**
     * Gets the value.
     *
     * @return the value.
     */
    @JsonValue
    public String getValue() {
        return this.value;
    }
}
