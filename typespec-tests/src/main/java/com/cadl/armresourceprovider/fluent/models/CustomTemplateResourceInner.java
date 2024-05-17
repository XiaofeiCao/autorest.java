// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.cadl.armresourceprovider.models.Dog;
import com.cadl.armresourceprovider.models.ManagedServiceIdentity;
import com.cadl.armresourceprovider.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Concrete tracked resource types can be created by aliasing this type using a specific property type.
 */
@Fluent
public final class CustomTemplateResourceInner extends Resource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties")
    private CustomTemplateResourceProperties innerProperties;

    /*
     * Managed identity.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of CustomTemplateResourceInner class.
     */
    public CustomTemplateResourceInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private CustomTemplateResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: Managed identity.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identity.
     * 
     * @param identity the identity value to set.
     * @return the CustomTemplateResourceInner object itself.
     */
    public CustomTemplateResourceInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomTemplateResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomTemplateResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the dog property: The dog property.
     * 
     * @return the dog value.
     */
    public Dog dog() {
        return this.innerProperties() == null ? null : this.innerProperties().dog();
    }

    /**
     * Set the dog property: The dog property.
     * 
     * @param dog the dog value to set.
     * @return the CustomTemplateResourceInner object itself.
     */
    public CustomTemplateResourceInner withDog(Dog dog) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomTemplateResourceProperties();
        }
        this.innerProperties().withDog(dog);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
