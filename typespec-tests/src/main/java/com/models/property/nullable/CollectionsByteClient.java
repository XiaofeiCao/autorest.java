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
import com.models.property.nullable.implementation.CollectionsBytesImpl;

/** Initializes a new instance of the synchronous NullableClient type. */
@ServiceClient(builder = NullableClientBuilder.class)
public final class CollectionsByteClient {
    @Generated private final CollectionsBytesImpl serviceClient;

    /**
     * Initializes an instance of CollectionsByteClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    CollectionsByteClient(CollectionsBytesImpl serviceClient) {
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
     *     nullableProperty (Required): [
     *         byte[] (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return models that will return all properties in the model along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getNonNullWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getNonNullWithResponse(requestOptions);
    }

    /**
     * Get models that will return the default object.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredProperty: String (Required)
     *     nullableProperty (Required): [
     *         byte[] (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return models that will return the default object along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getNullWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getNullWithResponse(requestOptions);
    }

    /**
     * Put a body with all properties present.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredProperty: String (Required)
     *     nullableProperty (Required): [
     *         byte[] (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param body Model with collection bytes properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> patchNonNullWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.patchNonNullWithResponse(body, requestOptions);
    }

    /**
     * Put a body with default properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredProperty: String (Required)
     *     nullableProperty (Required): [
     *         byte[] (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param body Model with collection bytes properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> patchNullWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.patchNullWithResponse(body, requestOptions);
    }
}
