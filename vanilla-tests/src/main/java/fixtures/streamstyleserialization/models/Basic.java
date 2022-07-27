// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

/** The Basic model. */
@Fluent
public final class Basic implements JsonSerializable<Basic> {
    /*
     * Basic Id
     */
    private Integer id;

    /*
     * Name property with a very long description that does not fit on a single line and a line break.
     */
    private String name;

    /*
     * The color property.
     */
    private CMYKColors color;

    /**
     * Get the id property: Basic Id.
     *
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: Basic Id.
     *
     * @param id the id value to set.
     * @return the Basic object itself.
     */
    public Basic setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name property with a very long description that does not fit on a single line and a line
     * break.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name property with a very long description that does not fit on a single line and a line
     * break.
     *
     * @param name the name value to set.
     * @return the Basic object itself.
     */
    public Basic setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the color property: The color property.
     *
     * @return the color value.
     */
    public CMYKColors getColor() {
        return this.color;
    }

    /**
     * Set the color property: The color property.
     *
     * @param color the color value to set.
     * @return the Basic object itself.
     */
    public Basic setColor(CMYKColors color) {
        this.color = color;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntegerField("id", this.id, false);
        jsonWriter.writeStringField("name", this.name, false);
        jsonWriter.writeStringField("color", this.color == null ? null : this.color.toString(), false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of Basic from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Basic if the JsonReader was pointing to an instance of it, or null if it was pointing to
     *     JSON null.
     */
    public static Basic fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    Integer id = null;
                    String name = null;
                    CMYKColors color = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("id".equals(fieldName)) {
                            id = reader.getIntegerNullableValue();
                        } else if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                        } else if ("color".equals(fieldName)) {
                            color = CMYKColors.fromString(reader.getStringValue());
                        } else {
                            reader.skipChildren();
                        }
                    }
                    Basic deserializedValue = new Basic();
                    deserializedValue.id = id;
                    deserializedValue.name = name;
                    deserializedValue.color = color;

                    return deserializedValue;
                });
    }
}
