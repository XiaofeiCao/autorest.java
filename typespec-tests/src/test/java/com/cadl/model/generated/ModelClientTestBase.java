// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.model.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.util.Configuration;
import com.cadl.model.ModelClient;
import com.cadl.model.ModelClientBuilder;

class ModelClientTestBase extends TestProxyTestBase {
    protected ModelClient modelClient;

    @Override
    protected void beforeTest() {
        ModelClientBuilder modelClientbuilder =
                new ModelClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            modelClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            modelClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        modelClient = modelClientbuilder.buildClient();
    }
}
