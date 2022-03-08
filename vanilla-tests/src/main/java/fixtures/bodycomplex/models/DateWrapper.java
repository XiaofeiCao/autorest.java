// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/** The DateWrapper model. */
@Fluent
public final class DateWrapper {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DateWrapper.class);

    /*
     * The field property.
     */
    @JsonProperty(value = "field")
    private LocalDate field;

    /*
     * The leap property.
     */
    @JsonProperty(value = "leap")
    private LocalDate leap;

    /**
     * Get the field property: The field property.
     *
     * @return the field value.
     */
    public LocalDate getField() {
        return this.field;
    }

    /**
     * Set the field property: The field property.
     *
     * @param field the field value to set.
     * @return the DateWrapper object itself.
     */
    public DateWrapper setField(LocalDate field) {
        this.field = field;
        return this;
    }

    /**
     * Get the leap property: The leap property.
     *
     * @return the leap value.
     */
    public LocalDate getLeap() {
        return this.leap;
    }

    /**
     * Set the leap property: The leap property.
     *
     * @param leap the leap value to set.
     * @return the DateWrapper object itself.
     */
    public DateWrapper setLeap(LocalDate leap) {
        this.leap = leap;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
