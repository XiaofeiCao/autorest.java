// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/** The Cookiecuttershark model. */
@Fluent
public final class Cookiecuttershark extends Shark {
    /*
     * The fishtype property.
     */
    private static final String FISHTYPE = "cookiecuttershark";

    /** Creates an instance of Cookiecuttershark class. */
    public Cookiecuttershark() {}

    /** {@inheritDoc} */
    @Override
    public Cookiecuttershark setAge(Integer age) {
        super.setAge(age);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Cookiecuttershark setBirthday(OffsetDateTime birthday) {
        super.setBirthday(birthday);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Cookiecuttershark setSpecies(String species) {
        super.setSpecies(species);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Cookiecuttershark setLength(float length) {
        super.setLength(length);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Cookiecuttershark setSiblings(List<Fish> siblings) {
        super.setSiblings(siblings);
        return this;
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

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("fishtype", FISHTYPE);
        jsonWriter.writeFloatField("length", getLength());
        jsonWriter.writeStringField("birthday", Objects.toString(getBirthday(), null));
        jsonWriter.writeStringField("species", getSpecies());
        jsonWriter.writeArrayField("siblings", getSiblings(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("age", getAge());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Cookiecuttershark from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Cookiecuttershark if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the Cookiecuttershark.
     */
    public static Cookiecuttershark fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    Cookiecuttershark deserializedCookiecuttershark = new Cookiecuttershark();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("fishtype".equals(fieldName)) {
                            String fishtype = reader.getString();
                            if (!FISHTYPE.equals(fishtype)) {
                                throw new IllegalStateException(
                                        "'fishtype' was expected to be non-null and equal to '"
                                                + FISHTYPE
                                                + "'. The found 'fishtype' was '"
                                                + fishtype
                                                + "'.");
                            }
                        } else if ("length".equals(fieldName)) {
                            deserializedCookiecuttershark.setLength(reader.getFloat());
                        } else if ("birthday".equals(fieldName)) {
                            deserializedCookiecuttershark.setBirthday(
                                    reader.getNullable(
                                            nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                        } else if ("species".equals(fieldName)) {
                            deserializedCookiecuttershark.setSpecies(reader.getString());
                        } else if ("siblings".equals(fieldName)) {
                            List<Fish> siblings = reader.readArray(reader1 -> Fish.fromJson(reader1));
                            deserializedCookiecuttershark.setSiblings(siblings);
                        } else if ("age".equals(fieldName)) {
                            deserializedCookiecuttershark.setAge(reader.getNullable(JsonReader::getInt));
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedCookiecuttershark;
                });
    }
}
