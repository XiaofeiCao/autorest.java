// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.property.optional.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Model with int literal property.
 */
@Fluent
public final class IntLiteralProperty implements JsonSerializable<IntLiteralProperty> {
    /*
     * Property
     */
    @Generated
    private IntLiteralPropertyProperty1 property;

    /**
     * Creates an instance of IntLiteralProperty class.
     */
    @Generated
    public IntLiteralProperty() {
    }

    /**
     * Get the property property: Property.
     * 
     * @return the property value.
     */
    @Generated
    public IntLiteralPropertyProperty1 getProperty() {
        return this.property;
    }

    /**
     * Set the property property: Property.
     * 
     * @param property the property value to set.
     * @return the IntLiteralProperty object itself.
     */
    @Generated
    public IntLiteralProperty setProperty(IntLiteralPropertyProperty1 property) {
        this.property = property;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("property", this.property == null ? null : this.property.toInt());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntLiteralProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntLiteralProperty if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IntLiteralProperty.
     */
    @Generated
    public static IntLiteralProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntLiteralProperty deserializedIntLiteralProperty = new IntLiteralProperty();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("property".equals(fieldName)) {
                    deserializedIntLiteralProperty.property = IntLiteralPropertyProperty1.fromInt(reader.getInt());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIntLiteralProperty;
        });
    }
}
