// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com._specs_.azure.core.basic.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** UserOrder for testing list with expand. */
@Immutable
public final class UserOrder {
    /*
     * The user's id.
     */
    @Generated
    @JsonProperty(value = "id", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int id;

    /*
     * The user's id.
     */
    @Generated
    @JsonProperty(value = "userId", required = true)
    private int userId;

    /*
     * The user's order detail
     */
    @Generated
    @JsonProperty(value = "detail", required = true)
    private String detail;

    /**
     * Creates an instance of UserOrder class.
     *
     * @param userId the userId value to set.
     * @param detail the detail value to set.
     */
    @Generated
    @JsonCreator
    public UserOrder(
            @JsonProperty(value = "userId", required = true) int userId,
            @JsonProperty(value = "detail", required = true) String detail) {
        this.userId = userId;
        this.detail = detail;
    }

    /**
     * Get the id property: The user's id.
     *
     * @return the id value.
     */
    @Generated
    public int getId() {
        return this.id;
    }

    /**
     * Get the userId property: The user's id.
     *
     * @return the userId value.
     */
    @Generated
    public int getUserId() {
        return this.userId;
    }

    /**
     * Get the detail property: The user's order detail.
     *
     * @return the detail value.
     */
    @Generated
    public String getDetail() {
        return this.detail;
    }
}
