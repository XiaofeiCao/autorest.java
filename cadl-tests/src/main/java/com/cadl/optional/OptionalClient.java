// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.optional;

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

/** Initializes a new instance of the synchronous OptionalClient type. */
@ServiceClient(builder = OptionalClientBuilder.class)
public final class OptionalClient {
    @Generated private final OptionalAsyncClient client;

    /**
     * Initializes an instance of OptionalClient class.
     *
     * @param client the async client.
     */
    @Generated
    OptionalClient(OptionalAsyncClient client) {
        this.client = client;
    }

    /**
     * The read operation.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>booleanNullable</td><td>Boolean</td><td>No</td><td>The booleanNullable parameter</td></tr>
     *     <tr><td>string</td><td>String</td><td>No</td><td>The string parameter</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>request-header-optional</td><td>String</td><td>No</td><td>The requestHeaderOptional parameter</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     boolean: Boolean (Optional)
     *     booleanNullable: Boolean (Optional)
     *     booleanRequired: boolean (Required)
     *     booleanRequiredNullable: Boolean (Required)
     *     string: String (Optional)
     *     bytes: byte[] (Optional)
     *     int: Long (Optional)
     *     long: Long (Optional)
     *     float: Double (Optional)
     *     double: Double (Optional)
     *     duration: Duration (Optional)
     *     dateTime: OffsetDateTime (Optional)
     *     stringList (Optional): [
     *         String (Optional)
     *     ]
     *     bytesDict (Optional): {
     *         String: byte[] (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param requestHeaderRequired The requestHeaderRequired parameter.
     * @param booleanRequired The booleanRequired parameter.
     * @param booleanRequiredNullable The booleanRequiredNullable parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> readWithResponse(
            String requestHeaderRequired,
            boolean booleanRequired,
            Boolean booleanRequiredNullable,
            RequestOptions requestOptions) {
        return this.client
                .readWithResponse(requestHeaderRequired, booleanRequired, booleanRequiredNullable, requestOptions)
                .block();
    }

    /**
     * The list operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *      (Required){
     *         boolean: Boolean (Optional)
     *         booleanNullable: Boolean (Optional)
     *         booleanRequired: Boolean (Optional)
     *         booleanRequiredNullable: Boolean (Optional)
     *         string: String (Optional)
     *         bytes: byte[] (Optional)
     *         int: Long (Optional)
     *         long: Long (Optional)
     *         float: Double (Optional)
     *         double: Double (Optional)
     *         duration: Duration (Optional)
     *         dateTime: OffsetDateTime (Optional)
     *         stringList (Optional): [
     *             String (Optional)
     *         ]
     *         bytesDict (Optional): {
     *             String: byte[] (Optional)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listWithResponse(RequestOptions requestOptions) {
        return this.client.listWithResponse(requestOptions).block();
    }
}
