// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.builtin.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BuiltinOps. */
public final class BuiltinOpsImpl {
    /** The proxy service used to perform REST calls. */
    private final BuiltinOpsService service;

    /** The service client containing this operation class. */
    private final BuiltinClientImpl client;

    /**
     * Initializes an instance of BuiltinOpsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BuiltinOpsImpl(BuiltinClientImpl client) {
        this.service =
                RestProxy.create(BuiltinOpsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BuiltinBuiltinOps to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "BuiltinBuiltinOps")
    private interface BuiltinOpsService {
        @Get("/builtin")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> read(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * The read operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     formatString (Required): {
     *         base64Encoded: byte[] (Required)
     *         binary: byte[] (Required)
     *         dateTime: OffsetDateTime (Required)
     *         dateTimeRfc1123: OffsetDateTime (Required)
     *         password: String (Required)
     *     }
     *     boolean: boolean (Required)
     *     string: String (Required)
     *     bytes: byte[] (Required)
     *     int: int (Required)
     *     safeint: long (Required)
     *     long: long (Required)
     *     float: double (Required)
     *     double: double (Required)
     *     duration: Duration (Required)
     *     dateTime: OffsetDateTime (Required)
     *     stringList (Required): [
     *         String (Required)
     *     ]
     *     bytesDict (Required): {
     *         String: byte[] (Required)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> readWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.read(this.client.getEndpoint(), accept, requestOptions, context));
    }

    /**
     * The read operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     formatString (Required): {
     *         base64Encoded: byte[] (Required)
     *         binary: byte[] (Required)
     *         dateTime: OffsetDateTime (Required)
     *         dateTimeRfc1123: OffsetDateTime (Required)
     *         password: String (Required)
     *     }
     *     boolean: boolean (Required)
     *     string: String (Required)
     *     bytes: byte[] (Required)
     *     int: int (Required)
     *     safeint: long (Required)
     *     long: long (Required)
     *     float: double (Required)
     *     double: double (Required)
     *     duration: Duration (Required)
     *     dateTime: OffsetDateTime (Required)
     *     stringList (Required): [
     *         String (Required)
     *     ]
     *     bytesDict (Required): {
     *         String: byte[] (Required)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> readWithResponse(RequestOptions requestOptions) {
        return readWithResponseAsync(requestOptions).block();
    }
}
