// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserializationimmutableoutput.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The DatetimeWrapper model.
 */
@Fluent
public final class DatetimeWrapper implements JsonSerializable<DatetimeWrapper> {
    /*
     * The field property.
     */
    private OffsetDateTime field;

    /*
     * The now property.
     */
    private OffsetDateTime now;

    /**
     * Creates an instance of DatetimeWrapper class.
     */
    public DatetimeWrapper() {
    }

    /**
     * Get the field property: The field property.
     * 
     * @return the field value.
     */
    public OffsetDateTime getField() {
        return this.field;
    }

    /**
     * Set the field property: The field property.
     * 
     * @param field the field value to set.
     * @return the DatetimeWrapper object itself.
     */
    public DatetimeWrapper setField(OffsetDateTime field) {
        this.field = field;
        return this;
    }

    /**
     * Get the now property: The now property.
     * 
     * @return the now value.
     */
    public OffsetDateTime getNow() {
        return this.now;
    }

    /**
     * Set the now property: The now property.
     * 
     * @param now the now value to set.
     * @return the DatetimeWrapper object itself.
     */
    public DatetimeWrapper setNow(OffsetDateTime now) {
        this.now = now;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("field",
            this.field == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.field));
        jsonWriter.writeStringField("now",
            this.now == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.now));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatetimeWrapper from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatetimeWrapper if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DatetimeWrapper.
     */
    public static DatetimeWrapper fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatetimeWrapper deserializedDatetimeWrapper = new DatetimeWrapper();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("field".equals(fieldName)) {
                    deserializedDatetimeWrapper.field
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("now".equals(fieldName)) {
                    deserializedDatetimeWrapper.now
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatetimeWrapper;
        });
    }
}
