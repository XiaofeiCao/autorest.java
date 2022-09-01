// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.dpgcustomization.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LroProduct model. */
@Immutable
public final class LroProduct extends Product {
    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", required = true)
    private String provisioningState;

    /**
     * Creates an instance of LroProduct class.
     *
     * @param received the received value to set.
     * @param provisioningState the provisioningState value to set.
     */
    @JsonCreator
    public LroProduct(
            @JsonProperty(value = "received", required = true) ProductReceived received,
            @JsonProperty(value = "provisioningState", required = true) String provisioningState) {
        super(received);
        this.provisioningState = provisioningState;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
}
