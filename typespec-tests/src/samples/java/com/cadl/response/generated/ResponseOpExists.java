// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.response.generated;

import com.azure.core.util.Configuration;
import com.cadl.response.ResponseClient;
import com.cadl.response.ResponseClientBuilder;

public class ResponseOpExists {
    public static void main(String[] args) {
        ResponseClient responseClient =
                new ResponseClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT"))
                        .buildClient();
        // BEGIN:com.cadl.response.generated.exists.responseopexists
        boolean response = responseClient.exists();
        // END:com.cadl.response.generated.exists.responseopexists
    }
}
