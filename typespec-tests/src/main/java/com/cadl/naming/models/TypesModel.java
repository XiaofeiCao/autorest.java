// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.naming.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * summary of Types
 *
 * <p>description of Types.
 */
public enum TypesModel {
    /** Enum value Blob. */
    BLOB("Blob"),

    /** Enum value File. */
    FILE("File");

    /** The actual serialized value for a TypesModel instance. */
    private final String value;

    TypesModel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TypesModel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TypesModel object, or null if unable to parse.
     */
    @JsonCreator
    public static TypesModel fromString(String value) {
        if (value == null) {
            return null;
        }
        TypesModel[] items = TypesModel.values();
        for (TypesModel item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
