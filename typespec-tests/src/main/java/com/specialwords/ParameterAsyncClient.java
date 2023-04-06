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
import com.specialwords.implementation.ParametersImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous SpecialWordsClient type. */
@ServiceClient(builder = SpecialWordsClientBuilder.class, isAsync = true)
public final class ParameterAsyncClient {
    @Generated private final ParametersImpl serviceClient;

    /**
     * Initializes an instance of ParameterAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ParameterAsyncClient(ParametersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The getWithIf operation.
     *
     * @param ifParameter The ifParameter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getWithIfWithResponse(String ifParameter, RequestOptions requestOptions) {
        return this.serviceClient.getWithIfWithResponseAsync(ifParameter, requestOptions);
    }

    /**
     * The getWithFilter operation.
     *
     * @param filter The filter parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getWithFilterWithResponse(String filter, RequestOptions requestOptions) {
        return this.serviceClient.getWithFilterWithResponseAsync(filter, requestOptions);
    }
}
