// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.collectionformat.generated;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.collectionformat.CollectionFormatClient;
import com.collectionformat.CollectionFormatClientBuilder;

class CollectionFormatClientTestBase extends TestBase {
    protected CollectionFormatClient collectionFormatClient;

    @Override
    protected void beforeTest() {
        CollectionFormatClientBuilder collectionFormatClientbuilder =
                new CollectionFormatClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            collectionFormatClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            collectionFormatClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        collectionFormatClient = collectionFormatClientbuilder.buildClient();
    }
}
