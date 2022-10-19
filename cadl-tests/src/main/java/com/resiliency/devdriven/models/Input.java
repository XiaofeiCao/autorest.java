// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.resiliency.devdriven.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input to LRO call. */
@Immutable
public final class Input {
    /*
     * property on the input
     */
    @JsonProperty(value = "hello", required = true)
    private String hello;

    /**
     * Creates an instance of Input class.
     *
     * @param hello the hello value to set.
     */
    @JsonCreator
    public Input(@JsonProperty(value = "hello", required = true) String hello) {
        this.hello = hello;
    }

    /**
     * Get the hello property: property on the input.
     *
     * @return the hello value.
     */
    public String getHello() {
        return this.hello;
    }
}
