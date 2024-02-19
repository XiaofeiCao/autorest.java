// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Top Level Arm Resource Properties.
 */
@Fluent
public final class TopLevelArmResourceProperties {
    /*
     * Configuration Endpoints.
     */
    @JsonProperty(value = "configurationEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> configurationEndpoints;

    /*
     * The userName property.
     */
    @JsonProperty(value = "userName", required = true)
    private String username;

    /*
     * The ipRules property.
     */
    @JsonProperty(value = "ipRules", required = true)
    private List<IpRules> ipRules;

    /*
     * The startTimeStamp property.
     */
    @JsonProperty(value = "startTimeStamp", required = true)
    private OffsetDateTime startTimestamp;

    /*
     * The status of the last operation.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of TopLevelArmResourceProperties class.
     */
    public TopLevelArmResourceProperties() {
    }

    /**
     * Get the configurationEndpoints property: Configuration Endpoints.
     * 
     * @return the configurationEndpoints value.
     */
    public List<String> configurationEndpoints() {
        return this.configurationEndpoints;
    }

    /**
     * Get the username property: The userName property.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The userName property.
     * 
     * @param username the username value to set.
     * @return the TopLevelArmResourceProperties object itself.
     */
    public TopLevelArmResourceProperties withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the ipRules property: The ipRules property.
     * 
     * @return the ipRules value.
     */
    public List<IpRules> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: The ipRules property.
     * 
     * @param ipRules the ipRules value to set.
     * @return the TopLevelArmResourceProperties object itself.
     */
    public TopLevelArmResourceProperties withIpRules(List<IpRules> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the startTimestamp property: The startTimeStamp property.
     * 
     * @return the startTimestamp value.
     */
    public OffsetDateTime startTimestamp() {
        return this.startTimestamp;
    }

    /**
     * Set the startTimestamp property: The startTimeStamp property.
     * 
     * @param startTimestamp the startTimestamp value to set.
     * @return the TopLevelArmResourceProperties object itself.
     */
    public TopLevelArmResourceProperties withStartTimestamp(OffsetDateTime startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (username() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property username in model TopLevelArmResourceProperties"));
        }
        if (ipRules() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property ipRules in model TopLevelArmResourceProperties"));
        } else {
            ipRules().forEach(e -> e.validate());
        }
        if (startTimestamp() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property startTimestamp in model TopLevelArmResourceProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TopLevelArmResourceProperties.class);
}
