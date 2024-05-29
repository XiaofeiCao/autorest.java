package com.arm.models.resources;

import com.azure.arm.models.resources.ResourcesManager;
import com.azure.arm.models.resources.models.NestedProxyResource;
import com.azure.arm.models.resources.models.NestedProxyResourceProperties;
import com.azure.arm.models.resources.models.NestedProxyResourceUpdateProperties;
import com.azure.arm.models.resources.models.TopLevelTrackedResource;
import com.azure.arm.models.resources.models.TopLevelTrackedResourceProperties;
import com.azure.arm.models.resources.models.TopLevelTrackedResourceUpdateProperties;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class ArmResourcesTests {
    @Test
    public void test() {
        AzureEnvironment AZURE = new AzureEnvironment(new HashMap<String, String>() {{
            this.put("resourceManagerEndpointUrl", "http://localhost:3000");
            this.put("managementEndpointUrl", "http://localhost:3000");
        }});
        ResourcesManager resourcesManager =
                ResourcesManager
//                        .authenticate(
//                                new TokenCredential() {
//                                    @Override
//                                    public Mono<AccessToken> getToken(TokenRequestContext tokenRequestContext) {
//                                        return Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX));
//                                    }
//                                },
                        .authenticate(
                                new HttpPipelineBuilder().build(),
                                new AzureProfile("", "00000000-0000-0000-0000-000000000000", AZURE));
        String resourceGroup = "test-rg";
        String resourceName = "top";
        TopLevelTrackedResource topLevelArmResource = resourcesManager.topLevelTrackedResources()
                .define(resourceName)
                .withRegion(Region.US_EAST)
                .withExistingResourceGroup(resourceGroup)
                .withProperties(new TopLevelTrackedResourceProperties().withDescription("valid"))
                .create();
        Assertions.assertNotNull(topLevelArmResource);
        topLevelArmResource = resourcesManager.topLevelTrackedResources().getById(topLevelArmResource.id());
        Assertions.assertNotNull(topLevelArmResource);

        Assertions.assertTrue(resourcesManager.topLevelTrackedResources().listByResourceGroup(resourceGroup).stream().findAny().isPresent());
        Assertions.assertTrue(resourcesManager.topLevelTrackedResources().list().stream().findAny().isPresent());

        topLevelArmResource.update()
            .withProperties(new TopLevelTrackedResourceUpdateProperties().withDescription("valid2"))
            .apply();

        resourcesManager.topLevelTrackedResources().deleteById(topLevelArmResource.id());

        NestedProxyResource nestedProxyResource = resourcesManager.nestedProxyResources().define("nested")
            .withExistingTopLevelTrackedResource(resourceGroup, resourceName)
            .withProperties(new NestedProxyResourceProperties().withDescription("valid"))
            .create();

        resourcesManager.nestedProxyResources().getById(nestedProxyResource.id());
        nestedProxyResource.update()
            .withProperties(new NestedProxyResourceUpdateProperties().withDescription("valid2"))
            .apply();

        resourcesManager.nestedProxyResources().deleteById(nestedProxyResource.id());
    }
}
