// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armstreamstyleserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.cadl.armstreamstyleserialization.fluent.models.AnotherFishProperties;
import com.cadl.armstreamstyleserialization.fluent.models.FishProperties;
import java.io.IOException;

/**
 * The third level model GoblinShark in polymorphic multiple levels inheritance.
 */
@Fluent
public final class GoblinShark extends Shark {
    /*
     * Discriminator property for Fish.
     */
    private String kind = "shark";

    /*
     * The sharktype property.
     */
    private String sharktype = "goblin";

    /*
     * The properties property.
     */
    private FishProperties innerProperties = new FishProperties();

    /*
     * The anotherProperties property.
     */
    private AnotherFishProperties innerAnotherProperties = new AnotherFishProperties();

    /**
     * Creates an instance of GoblinShark class.
     */
    public GoblinShark() {
    }

    /**
     * Get the kind property: Discriminator property for Fish.
     * 
     * @return the kind value.
     */
    @Override
    public String kind() {
        return this.kind;
    }

    /**
     * Get the sharktype property: The sharktype property.
     * 
     * @return the sharktype value.
     */
    @Override
    public String sharktype() {
        return this.sharktype;
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private FishProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the innerAnotherProperties property: The anotherProperties property.
     * 
     * @return the innerAnotherProperties value.
     */
    private AnotherFishProperties innerAnotherProperties() {
        return this.innerAnotherProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoblinShark withAge(int age) {
        super.withAge(age);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoblinShark withDna(String dna) {
        super.withDna(dna);
        return this;
    }

    /**
     * Get the length property: The length property.
     * 
     * @return the length value.
     */
    public double length() {
        return this.innerProperties() == null ? 0.0 : this.innerProperties().length();
    }

    /**
     * Set the length property: The length property.
     * 
     * @param length the length value to set.
     * @return the GoblinShark object itself.
     */
    public GoblinShark withLength(double length) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FishProperties();
        }
        this.innerProperties().withLength(length);
        return this;
    }

    /**
     * Get the patten property: The patten property.
     * 
     * @return the patten value.
     */
    public String patten() {
        return this.innerProperties() == null ? null : this.innerProperties().patten();
    }

    /**
     * Get the length property: The length property.
     * 
     * @return the length value.
     */
    public double lengthAnotherPropertiesLength() {
        return this.innerAnotherProperties() == null ? 0.0 : this.innerAnotherProperties().length();
    }

    /**
     * Set the length property: The length property.
     * 
     * @param length the length value to set.
     * @return the GoblinShark object itself.
     */
    public GoblinShark withLengthAnotherPropertiesLength(double length) {
        if (this.innerAnotherProperties() == null) {
            this.innerAnotherProperties = new AnotherFishProperties();
        }
        this.innerAnotherProperties().withLength(length);
        return this;
    }

    /**
     * Get the patten property: The patten property.
     * 
     * @return the patten value.
     */
    public String pattenAnotherPropertiesPatten() {
        return this.innerAnotherProperties() == null ? null : this.innerAnotherProperties().patten();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind);
        jsonWriter.writeIntField("age", age());
        jsonWriter.writeStringField("dna", dna());
        jsonWriter.writeJsonField("properties", innerProperties());
        jsonWriter.writeJsonField("anotherProperties", innerAnotherProperties());
        jsonWriter.writeStringField("sharktype", this.sharktype);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GoblinShark from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GoblinShark if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GoblinShark.
     */
    public static GoblinShark fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GoblinShark deserializedGoblinShark = new GoblinShark();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("age".equals(fieldName)) {
                    deserializedGoblinShark.withAge(reader.getInt());
                } else if ("dna".equals(fieldName)) {
                    deserializedGoblinShark.withDna(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedGoblinShark.innerProperties = FishProperties.fromJson(reader);
                } else if ("anotherProperties".equals(fieldName)) {
                    deserializedGoblinShark.innerAnotherProperties = AnotherFishProperties.fromJson(reader);
                } else if ("sharktype".equals(fieldName)) {
                    deserializedGoblinShark.sharktype = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGoblinShark;
        });
    }
}
