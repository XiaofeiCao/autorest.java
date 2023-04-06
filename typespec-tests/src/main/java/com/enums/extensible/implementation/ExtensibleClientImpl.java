// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.enums.extensible.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the ExtensibleClient type. */
public final class ExtensibleClientImpl {
    /** The proxy service used to perform REST calls. */
    private final ExtensibleClientService service;

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** Initializes an instance of ExtensibleClient client. */
    public ExtensibleClientImpl() {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter());
    }

    /**
     * Initializes an instance of ExtensibleClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public ExtensibleClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter());
    }

    /**
     * Initializes an instance of ExtensibleClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     */
    public ExtensibleClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.service = RestProxy.create(ExtensibleClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for ExtensibleClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("http://localhost:3000")
    @ServiceInterface(name = "ExtensibleClient")
    public interface ExtensibleClientService {
        @Get("/enums/extensible/string/known-value")
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
        Mono<Response<String>> getKnownValue(
                @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/enums/extensible/string/known-value")
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
        Response<String> getKnownValueSync(
                @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/enums/extensible/string/unknown-value")
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
        Mono<Response<String>> getUnknownValue(
                @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/enums/extensible/string/unknown-value")
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
        Response<String> getUnknownValueSync(
                @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Put("/enums/extensible/string/known-value")
        @ExpectedResponses({204})
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
        Mono<Response<Void>> putKnownValue(
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData body,
                RequestOptions requestOptions,
                Context context);

        @Put("/enums/extensible/string/known-value")
        @ExpectedResponses({204})
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
        Response<Void> putKnownValueSync(
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData body,
                RequestOptions requestOptions,
                Context context);

        @Put("/enums/extensible/string/unknown-value")
        @ExpectedResponses({204})
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
        Mono<Response<Void>> putUnknownValue(
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData body,
                RequestOptions requestOptions,
                Context context);

        @Put("/enums/extensible/string/unknown-value")
        @ExpectedResponses({204})
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
        Response<Void> putUnknownValueSync(
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData body,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * The getKnownValue operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String(Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday)
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
    public Mono<Response<String>> getKnownValueWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getKnownValue(accept, requestOptions, context));
    }

    /**
     * The getKnownValue operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String(Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday)
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
    public Response<String> getKnownValueWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getKnownValueSync(accept, requestOptions, Context.NONE);
    }

    /**
     * The getUnknownValue operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String(Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday)
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
    public Mono<Response<String>> getUnknownValueWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getUnknownValue(accept, requestOptions, context));
    }

    /**
     * The getUnknownValue operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String(Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday)
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
    public Response<String> getUnknownValueWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getUnknownValueSync(accept, requestOptions, Context.NONE);
    }

    /**
     * The putKnownValue operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * String(Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday)
     * }</pre>
     *
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putKnownValueWithResponseAsync(BinaryData body, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.putKnownValue(accept, body, requestOptions, context));
    }

    /**
     * The putKnownValue operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * String(Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday)
     * }</pre>
     *
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putKnownValueWithResponse(BinaryData body, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.putKnownValueSync(accept, body, requestOptions, Context.NONE);
    }

    /**
     * The putUnknownValue operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * String(Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday)
     * }</pre>
     *
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putUnknownValueWithResponseAsync(BinaryData body, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.putUnknownValue(accept, body, requestOptions, context));
    }

    /**
     * The putUnknownValue operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * String(Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday)
     * }</pre>
     *
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putUnknownValueWithResponse(BinaryData body, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.putUnknownValueSync(accept, body, requestOptions, Context.NONE);
    }
}
