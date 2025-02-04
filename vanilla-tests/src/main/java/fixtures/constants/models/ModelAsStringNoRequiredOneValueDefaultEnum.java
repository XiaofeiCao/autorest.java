// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.constants.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ModelAsStringNoRequiredOneValueDefaultEnum. */
public final class ModelAsStringNoRequiredOneValueDefaultEnum
        extends ExpandableStringEnum<ModelAsStringNoRequiredOneValueDefaultEnum> {
    /** Static value value1 for ModelAsStringNoRequiredOneValueDefaultEnum. */
    public static final ModelAsStringNoRequiredOneValueDefaultEnum VALUE1 = fromString("value1");

    /**
     * Creates a new instance of ModelAsStringNoRequiredOneValueDefaultEnum value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ModelAsStringNoRequiredOneValueDefaultEnum() {}

    /**
     * Creates or finds a ModelAsStringNoRequiredOneValueDefaultEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ModelAsStringNoRequiredOneValueDefaultEnum.
     */
    @JsonCreator
    public static ModelAsStringNoRequiredOneValueDefaultEnum fromString(String name) {
        return fromString(name, ModelAsStringNoRequiredOneValueDefaultEnum.class);
    }

    /**
     * Gets known ModelAsStringNoRequiredOneValueDefaultEnum values.
     *
     * @return known ModelAsStringNoRequiredOneValueDefaultEnum values.
     */
    public static Collection<ModelAsStringNoRequiredOneValueDefaultEnum> values() {
        return values(ModelAsStringNoRequiredOneValueDefaultEnum.class);
    }
}
