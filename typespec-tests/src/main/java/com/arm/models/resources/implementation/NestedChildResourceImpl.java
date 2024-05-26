// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.arm.models.resources.implementation;

import com.arm.models.resources.fluent.models.NestedChildResourceInner;
import com.arm.models.resources.models.NestedChildResource;
import com.arm.models.resources.models.NestedChildResourceProperties;
import com.arm.models.resources.models.NestedChildResourceUpdate;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import java.util.Collections;
import java.util.Map;

public final class NestedChildResourceImpl
    implements NestedChildResource, NestedChildResource.Definition, NestedChildResource.Update {
    private NestedChildResourceInner innerObject;

    private final com.arm.models.resources.ResourcesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public NestedChildResourceProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public NestedChildResourceInner innerModel() {
        return this.innerObject;
    }

    private com.arm.models.resources.ResourcesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String topLevelArmResourceName;

    private String childResourceName;

    private NestedChildResourceUpdate updateProperties;

    public NestedChildResourceImpl withExistingTopLevelArmResource(String resourceGroupName,
        String topLevelArmResourceName) {
        this.resourceGroupName = resourceGroupName;
        this.topLevelArmResourceName = topLevelArmResourceName;
        return this;
    }

    public NestedChildResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getNestedChildResources()
            .createOrReplace(resourceGroupName, topLevelArmResourceName, childResourceName, this.innerModel(),
                Context.NONE);
        return this;
    }

    public NestedChildResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNestedChildResources()
            .createOrReplace(resourceGroupName, topLevelArmResourceName, childResourceName, this.innerModel(), context);
        return this;
    }

    NestedChildResourceImpl(String name, com.arm.models.resources.ResourcesManager serviceManager) {
        this.innerObject = new NestedChildResourceInner();
        this.serviceManager = serviceManager;
        this.childResourceName = name;
    }

    public NestedChildResourceImpl update() {
        this.updateProperties = new NestedChildResourceUpdate();
        return this;
    }

    public NestedChildResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getNestedChildResources()
            .update(resourceGroupName, topLevelArmResourceName, childResourceName, updateProperties, Context.NONE);
        return this;
    }

    public NestedChildResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNestedChildResources()
            .update(resourceGroupName, topLevelArmResourceName, childResourceName, updateProperties, context);
        return this;
    }

    NestedChildResourceImpl(NestedChildResourceInner innerObject,
        com.arm.models.resources.ResourcesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.topLevelArmResourceName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "topLevelArmResources");
        this.childResourceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "childResources");
    }

    public NestedChildResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getNestedChildResources()
            .getWithResponse(resourceGroupName, topLevelArmResourceName, childResourceName, Context.NONE)
            .getValue();
        return this;
    }

    public NestedChildResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNestedChildResources()
            .getWithResponse(resourceGroupName, topLevelArmResourceName, childResourceName, context)
            .getValue();
        return this;
    }

    public NestedChildResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NestedChildResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NestedChildResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public NestedChildResourceImpl withProperties(NestedChildResourceProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
