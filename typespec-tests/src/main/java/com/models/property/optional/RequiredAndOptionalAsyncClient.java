// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.models.property.optional;

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
import com.azure.core.util.BinaryData;
import com.models.property.optional.implementation.RequiredAndOptionalsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous OptionalClient type. */
@ServiceClient(builder = OptionalClientBuilder.class, isAsync = true)
public final class RequiredAndOptionalAsyncClient {
    @Generated private final RequiredAndOptionalsImpl serviceClient;

    /**
     * Initializes an instance of RequiredAndOptionalAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    RequiredAndOptionalAsyncClient(RequiredAndOptionalsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get models that will return all properties in the model.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     optionalProperty: String (Optional)
     *     requiredProperty: int (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return models that will return all properties in the model along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getAllWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getAllWithResponseAsync(requestOptions);
    }

    /**
     * Get models that will return only the required properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     optionalProperty: String (Optional)
     *     requiredProperty: int (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return models that will return only the required properties along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getRequiredOnlyWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getRequiredOnlyWithResponseAsync(requestOptions);
    }

    /**
     * Put a body with all properties present.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     optionalProperty: String (Optional)
     *     requiredProperty: int (Required)
     * }
     * }</pre>
     *
     * @param body Model with required and optional properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putAllWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.putAllWithResponseAsync(body, requestOptions);
    }

    /**
     * Put a body with only required properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     optionalProperty: String (Optional)
     *     requiredProperty: int (Required)
     * }
     * }</pre>
     *
     * @param body Model with required and optional properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putRequiredOnlyWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.putRequiredOnlyWithResponseAsync(body, requestOptions);
    }
}
