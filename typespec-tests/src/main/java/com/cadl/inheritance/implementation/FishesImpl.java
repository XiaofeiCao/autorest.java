// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.inheritance.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.cadl.inheritance.fluent.FishesClient;
import com.cadl.inheritance.fluent.models.FishInner;
import com.cadl.inheritance.models.Fish;
import com.cadl.inheritance.models.Fishes;

public final class FishesImpl implements Fishes {
    private static final ClientLogger LOGGER = new ClientLogger(FishesImpl.class);

    private final FishesClient innerClient;

    private final com.cadl.inheritance.InheritanceManager serviceManager;

    public FishesImpl(FishesClient innerClient, com.cadl.inheritance.InheritanceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Fish> getModelWithResponse(Context context) {
        Response<FishInner> inner = this.serviceClient().getModelWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FishImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Fish getModel() {
        FishInner inner = this.serviceClient().getModel();
        if (inner != null) {
            return new FishImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private FishesClient serviceClient() {
        return this.innerClient;
    }

    private com.cadl.inheritance.InheritanceManager manager() {
        return this.serviceManager;
    }
}
