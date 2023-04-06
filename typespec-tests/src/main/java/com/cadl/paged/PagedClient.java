// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.paged;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.cadl.paged.implementation.PagedClientImpl;
import com.cadl.paged.models.Resource;

/** Initializes a new instance of the synchronous PagedClient type. */
@ServiceClient(builder = PagedClientBuilder.class)
public final class PagedClient {
    @Generated private final PagedClientImpl serviceClient;

    /**
     * Initializes an instance of PagedClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    PagedClient(PagedClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The list operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     name: String (Required)
     *     type: String (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of Resource items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(RequestOptions requestOptions) {
        return this.serviceClient.list(requestOptions);
    }

    /**
     * The list operation.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged collection of Resource items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Resource> list() {
        // Generated convenience method for list
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.list(requestOptions).mapPage(value -> value.toObject(Resource.class));
    }
}
