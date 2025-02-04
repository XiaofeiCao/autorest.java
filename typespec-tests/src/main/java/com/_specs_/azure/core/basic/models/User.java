// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com._specs_.azure.core.basic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Details about a user. */
@Fluent
public final class User {
    /*
     * The user's id.
     */
    @Generated
    @JsonProperty(value = "id", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int id;

    /*
     * The user's name.
     */
    @Generated
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The user's order list
     */
    @Generated
    @JsonProperty(value = "orders")
    private List<UserOrder> orders;

    /*
     * The entity tag for this resource.
     */
    @Generated
    @JsonProperty(value = "etag", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Creates an instance of User class.
     *
     * @param name the name value to set.
     */
    @Generated
    @JsonCreator
    public User(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
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
     * Get the name property: The user's name.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the orders property: The user's order list.
     *
     * @return the orders value.
     */
    @Generated
    public List<UserOrder> getOrders() {
        return this.orders;
    }

    /**
     * Set the orders property: The user's order list.
     *
     * @param orders the orders value to set.
     * @return the User object itself.
     */
    @Generated
    public User setOrders(List<UserOrder> orders) {
        this.orders = orders;
        return this;
    }

    /**
     * Get the etag property: The entity tag for this resource.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }
}
