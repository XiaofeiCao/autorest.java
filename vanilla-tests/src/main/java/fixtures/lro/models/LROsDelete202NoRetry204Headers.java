// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.lro.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LROsDelete202NoRetry204Headers model. */
@Fluent
public final class LROsDelete202NoRetry204Headers {
    /*
     * The Retry-After property.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /*
     * The Location property.
     */
    @JsonProperty(value = "Location")
    private String location;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of LROsDelete202NoRetry204Headers class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public LROsDelete202NoRetry204Headers(HttpHeaders rawHeaders) {
        String retryAfter = rawHeaders.getValue("Retry-After");
        if (retryAfter != null) {
            this.retryAfter = Integer.parseInt(retryAfter);
        }
        this.location = rawHeaders.getValue("Location");
    }

    /**
     * Get the retryAfter property: The Retry-After property.
     *
     * @return the retryAfter value.
     */
    public Integer getRetryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the retryAfter property: The Retry-After property.
     *
     * @param retryAfter the retryAfter value to set.
     * @return the LROsDelete202NoRetry204Headers object itself.
     */
    public LROsDelete202NoRetry204Headers setRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

    /**
     * Get the location property: The Location property.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     *
     * @param location the location value to set.
     * @return the LROsDelete202NoRetry204Headers object itself.
     */
    public LROsDelete202NoRetry204Headers setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
