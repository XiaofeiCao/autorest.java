// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.models.property.nullable;

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
import com.models.property.nullable.implementation.BytesImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous NullableClient type. */
@ServiceClient(builder = NullableClientBuilder.class, isAsync = true)
public final class BytesAsyncClient {
    @Generated private final BytesImpl serviceClient;

    /**
     * Initializes an instance of BytesAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    BytesAsyncClient(BytesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get models that will return all properties in the model.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredProperty: String (Required)
     *     nullableProperty: byte[] (Required)
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
    public Mono<Response<BinaryData>> getNonNullWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getNonNullWithResponseAsync(requestOptions);
    }

    /**
     * Get models that will return the default object.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredProperty: String (Required)
     *     nullableProperty: byte[] (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return models that will return the default object along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getNullWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getNullWithResponseAsync(requestOptions);
    }

    /**
     * Put a body with all properties present.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredProperty: String (Required)
     *     nullableProperty: byte[] (Required)
     * }
     * }</pre>
     *
     * @param body Template type for testing models with nullable property. Pass in the type of the property you are
     *     looking for.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> patchNonNullWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.patchNonNullWithResponseAsync(body, requestOptions);
    }

    /**
     * Put a body with default properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredProperty: String (Required)
     *     nullableProperty: byte[] (Required)
     * }
     * }</pre>
     *
     * @param body Template type for testing models with nullable property. Pass in the type of the property you are
     *     looking for.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> patchNullWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.patchNullWithResponseAsync(body, requestOptions);
    }
}
