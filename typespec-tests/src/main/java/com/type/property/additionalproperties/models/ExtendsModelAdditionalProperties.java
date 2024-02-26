// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.property.additionalproperties.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The model extends from Record&lt;ModelForRecord&gt; type.
 */
@Fluent
public final class ExtendsModelAdditionalProperties implements JsonSerializable<ExtendsModelAdditionalProperties> {
    /*
     * Additional properties
     */
    @Generated
    private Map<String, ModelForRecord> additionalProperties;

    /**
     * Creates an instance of ExtendsModelAdditionalProperties class.
     */
    @Generated
    public ExtendsModelAdditionalProperties() {
    }

    /**
     * Get the additionalProperties property: Additional properties.
     * 
     * @return the additionalProperties value.
     */
    @Generated
    public Map<String, ModelForRecord> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Additional properties.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the ExtendsModelAdditionalProperties object itself.
     */
    @Generated
    public ExtendsModelAdditionalProperties setAdditionalProperties(Map<String, ModelForRecord> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (additionalProperties != null) {
            for (Map.Entry<String, ModelForRecord> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtendsModelAdditionalProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtendsModelAdditionalProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtendsModelAdditionalProperties.
     */
    @Generated
    public static ExtendsModelAdditionalProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtendsModelAdditionalProperties deserializedExtendsModelAdditionalProperties
                = new ExtendsModelAdditionalProperties();
            Map<String, ModelForRecord> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if (additionalProperties == null) {
                    additionalProperties = new LinkedHashMap<>();
                }

                additionalProperties.put(fieldName, ModelForRecord.fromJson(reader));
            }
            deserializedExtendsModelAdditionalProperties.additionalProperties = additionalProperties;

            return deserializedExtendsModelAdditionalProperties;
        });
    }
}
