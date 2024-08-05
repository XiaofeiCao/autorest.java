// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armstreamstyleserialization.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.cadl.armstreamstyleserialization.fluent.models.OutputOnlyModelInner;
import com.cadl.armstreamstyleserialization.fluent.models.OutputOnlyModelProperties;
import java.io.IOException;

/**
 * The OutputOnlyModelChild model.
 */
@Immutable
public final class OutputOnlyModelChild extends OutputOnlyModelInner {
    /*
     * Discriminator property for OutputOnlyModel.
     */
    private String kind = "child";

    /*
     * The childName property.
     */
    private String childName;

    /*
     * The id property.
     */
    private String id;

    /*
     * The properties property.
     */
    private OutputOnlyModelProperties innerProperties = new OutputOnlyModelProperties();

    /**
     * Creates an instance of OutputOnlyModelChild class.
     */
    private OutputOnlyModelChild() {
    }

    /**
     * Get the kind property: Discriminator property for OutputOnlyModel.
     * 
     * @return the kind value.
     */
    @Override
    public String kind() {
        return this.kind;
    }

    /**
     * Get the childName property: The childName property.
     * 
     * @return the childName value.
     */
    public String childName() {
        return this.childName;
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private OutputOnlyModelProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the title property: The title property.
     * 
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (childName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property childName in model OutputOnlyModelChild"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OutputOnlyModelChild.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeJsonField("properties", innerProperties());
        jsonWriter.writeStringField("childName", this.childName);
        jsonWriter.writeStringField("kind", this.kind);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OutputOnlyModelChild from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OutputOnlyModelChild if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OutputOnlyModelChild.
     */
    public static OutputOnlyModelChild fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OutputOnlyModelChild deserializedOutputOnlyModelChild = new OutputOnlyModelChild();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedOutputOnlyModelChild.withName(reader.getString());
                } else if ("id".equals(fieldName)) {
                    deserializedOutputOnlyModelChild.id = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedOutputOnlyModelChild.innerProperties = OutputOnlyModelProperties.fromJson(reader);
                } else if ("childName".equals(fieldName)) {
                    deserializedOutputOnlyModelChild.childName = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedOutputOnlyModelChild.kind = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOutputOnlyModelChild;
        });
    }
}
