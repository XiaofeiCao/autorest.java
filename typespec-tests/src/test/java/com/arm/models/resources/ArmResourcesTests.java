package com.arm.models.resources;

import com.arm.models.resources.models.TopLevelArmResource;
import com.arm.models.resources.models.TopLevelArmResourceProperties;
import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.cadl.server.HttpbinClientBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.UUID;

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

                                new AzureProfile("", UUID.randomUUID().toString(), AZURE));
        String resourceGroup = "rg-1";
        String resourceName = "resourceName";
        TopLevelArmResource topLevelArmResource = resourcesManager.topLevelArmResources()
                .define(resourceName)
                .withRegion(Region.US_EAST)
                .withExistingResourceGroup(resourceGroup)
                .withProperties(new TopLevelArmResourceProperties().withDescription("myDesc"))
                .create();
        Assertions.assertNotNull(topLevelArmResource);
        topLevelArmResource = resourcesManager.topLevelArmResources().getById(topLevelArmResource.id());
        Assertions.assertNotNull(topLevelArmResource);
    }
}
