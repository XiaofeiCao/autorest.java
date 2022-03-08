// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StringWrapper model. */
@Fluent
public final class StringWrapper {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StringWrapper.class);

    /*
     * The field property.
     */
    @JsonProperty(value = "field")
    private String field;

    /*
     * The empty property.
     */
    @JsonProperty(value = "empty")
    private String empty;

    /*
     * The null property.
     */
    @JsonProperty(value = "null")
    private String nullProperty;

    /**
     * Get the field property: The field property.
     *
     * @return the field value.
     */
    public String getField() {
        return this.field;
    }

    /**
     * Set the field property: The field property.
     *
     * @param field the field value to set.
     * @return the StringWrapper object itself.
     */
    public StringWrapper setField(String field) {
        this.field = field;
        return this;
    }

    /**
     * Get the empty property: The empty property.
     *
     * @return the empty value.
     */
    public String getEmpty() {
        return this.empty;
    }

    /**
     * Set the empty property: The empty property.
     *
     * @param empty the empty value to set.
     * @return the StringWrapper object itself.
     */
    public StringWrapper setEmpty(String empty) {
        this.empty = empty;
        return this;
    }

    /**
     * Get the nullProperty property: The null property.
     *
     * @return the nullProperty value.
     */
    public String getNullProperty() {
        return this.nullProperty;
    }

    /**
     * Set the nullProperty property: The null property.
     *
     * @param nullProperty the nullProperty value to set.
     * @return the StringWrapper object itself.
     */
    public StringWrapper setNullProperty(String nullProperty) {
        this.nullProperty = nullProperty;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
