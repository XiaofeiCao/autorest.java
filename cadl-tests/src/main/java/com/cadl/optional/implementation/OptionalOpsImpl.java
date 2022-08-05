// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.optional.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.QueryParam;
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

/** An instance of this class provides access to all the operations defined in OptionalOps. */
public final class OptionalOpsImpl {
    /** The proxy service used to perform REST calls. */
    private final OptionalOpsService service;

    /** The service client containing this operation class. */
    private final OptionalClientImpl client;

    /**
     * Initializes an instance of OptionalOpsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OptionalOpsImpl(OptionalClientImpl client) {
        this.service =
                RestProxy.create(OptionalOpsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for OptionalOptionalOps to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "OptionalOptionalOps")
    private interface OptionalOpsService {
        @Get("/optional/read")
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
                @HeaderParam("request-header-required") String requestHeaderRequired,
                @QueryParam("booleanRequired") boolean booleanRequired,
                @QueryParam("booleanRequiredNullable") Boolean booleanRequiredNullable,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("/optional/list")
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
        Mono<Response<BinaryData>> list(
                @HostParam("endpoint") String endpoint,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);
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
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> readWithResponseAsync(
            String requestHeaderRequired,
            boolean booleanRequired,
            Boolean booleanRequiredNullable,
            RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.read(
                                this.client.getEndpoint(),
                                requestHeaderRequired,
                                booleanRequired,
                                booleanRequiredNullable,
                                accept,
                                requestOptions,
                                context));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> readWithResponseAsync(
            String requestHeaderRequired,
            boolean booleanRequired,
            Boolean booleanRequiredNullable,
            RequestOptions requestOptions,
            Context context) {
        final String accept = "application/json";
        return service.read(
                this.client.getEndpoint(),
                requestHeaderRequired,
                booleanRequired,
                booleanRequiredNullable,
                accept,
                requestOptions,
                context);
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> readWithResponse(
            String requestHeaderRequired,
            boolean booleanRequired,
            Boolean booleanRequiredNullable,
            RequestOptions requestOptions) {
        return readWithResponseAsync(requestHeaderRequired, booleanRequired, booleanRequiredNullable, requestOptions)
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
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.list(this.client.getEndpoint(), accept, requestOptions, context));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listWithResponseAsync(RequestOptions requestOptions, Context context) {
        final String accept = "application/json";
        return service.list(this.client.getEndpoint(), accept, requestOptions, context);
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listWithResponse(RequestOptions requestOptions) {
        return listWithResponseAsync(requestOptions).block();
    }
}
