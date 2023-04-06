// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.specialwords;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.specialwords.implementation.OperationsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous SpecialWordsClient type. */
@ServiceClient(builder = SpecialWordsClientBuilder.class, isAsync = true)
public final class OperationAsyncClient {
    @Generated private final OperationsImpl serviceClient;

    /**
     * Initializes an instance of OperationAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    OperationAsyncClient(OperationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The forMethod operation.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> forMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.forMethodWithResponseAsync(requestOptions);
    }
}
