// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.model.inheritance.notdiscriminated.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.type.model.inheritance.notdiscriminated.NotDiscriminatedClient;
import com.type.model.inheritance.notdiscriminated.NotDiscriminatedClientBuilder;

class NotDiscriminatedClientTestBase extends TestProxyTestBase {
    protected NotDiscriminatedClient notDiscriminatedClient;

    @Override
    protected void beforeTest() {
        NotDiscriminatedClientBuilder notDiscriminatedClientbuilder =
                new NotDiscriminatedClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            notDiscriminatedClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            notDiscriminatedClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        notDiscriminatedClient = notDiscriminatedClientbuilder.buildClient();
    }
}
