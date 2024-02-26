// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * List Operations response object.
 */
@Fluent
public final class GetOperationsResponse implements JsonSerializable<GetOperationsResponse> {
    /*
     * List of operations.
     */
    private List<OperationSummary> value;

    /*
     * Link to the next page of operations.
     */
    private String nextLink;

    /**
     * Creates an instance of GetOperationsResponse class.
     */
    public GetOperationsResponse() {
    }

    /**
     * Get the value property: List of operations.
     * 
     * @return the value value.
     */
    public List<OperationSummary> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of operations.
     * 
     * @param value the value value to set.
     * @return the GetOperationsResponse object itself.
     */
    public GetOperationsResponse setValue(List<OperationSummary> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next page of operations.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next page of operations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the GetOperationsResponse object itself.
     */
    public GetOperationsResponse setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetOperationsResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetOperationsResponse if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GetOperationsResponse.
     */
    public static GetOperationsResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetOperationsResponse deserializedGetOperationsResponse = new GetOperationsResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<OperationSummary> value = reader.readArray(reader1 -> OperationSummary.fromJson(reader1));
                    deserializedGetOperationsResponse.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedGetOperationsResponse.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGetOperationsResponse;
        });
    }
}
