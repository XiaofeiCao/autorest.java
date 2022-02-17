// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.dpgcustomization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/** Defines values for ProductReceived. */
public final class ProductReceived extends ExpandableStringEnum<ProductReceived> {
    /** Static value raw for ProductReceived. */
    public static final ProductReceived RAW = fromString("raw");

    /** Static value model for ProductReceived. */
    public static final ProductReceived MODEL = fromString("model");

    /**
     * Creates or finds a ProductReceived from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProductReceived.
     */
    @JsonCreator
    public static ProductReceived fromString(String name) {
        return fromString(name, ProductReceived.class);
    }

    /** @return known ProductReceived values. */
    public static Collection<ProductReceived> values() {
        return values(ProductReceived.class);
    }
}
