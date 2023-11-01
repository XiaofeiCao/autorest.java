// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.literalservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OptionalLiteralParam.
 */
public enum OptionalLiteralParam {
    /**
     * Enum value optionalLiteralParam.
     */
    OPTIONAL_LITERAL_PARAM("optionalLiteralParam");

    /**
     * The actual serialized value for a OptionalLiteralParam instance.
     */
    private final String value;

    OptionalLiteralParam(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OptionalLiteralParam instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed OptionalLiteralParam object, or null if unable to parse.
     */
    @JsonCreator
    public static OptionalLiteralParam fromString(String value) {
        if (value == null) {
            return null;
        }
        OptionalLiteralParam[] items = OptionalLiteralParam.values();
        for (OptionalLiteralParam item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
