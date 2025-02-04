// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.property.nullable.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.Patch;
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

/** An instance of this class provides access to all the operations defined in CollectionsModels. */
public final class CollectionsModelsImpl {
    /** The proxy service used to perform REST calls. */
    private final CollectionsModelsService service;

    /** The service client containing this operation class. */
    private final NullableClientImpl client;

    /**
     * Initializes an instance of CollectionsModelsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CollectionsModelsImpl(NullableClientImpl client) {
        this.service =
                RestProxy.create(
                        CollectionsModelsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NullableClientCollectionsModels to be used by the proxy service to
     * perform REST calls.
     */
    @Host("http://localhost:3000")
    @ServiceInterface(name = "NullableClientCollec")
    public interface CollectionsModelsService {
        @Get("/type/property/nullable/collections/model/non-null")
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
        Mono<Response<BinaryData>> getNonNull(
                @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/type/property/nullable/collections/model/non-null")
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
        Response<BinaryData> getNonNullSync(
                @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/type/property/nullable/collections/model/null")
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
        Mono<Response<BinaryData>> getNull(
                @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/type/property/nullable/collections/model/null")
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
        Response<BinaryData> getNullSync(
                @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Patch("/type/property/nullable/collections/model/non-null")
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
        Mono<Response<Void>> patchNonNull(
                @HeaderParam("Content-Type") String contentType,
                @HeaderParam("accept") String accept,
                @BodyParam("application/merge-patch+json") BinaryData body,
                RequestOptions requestOptions,
                Context context);

        @Patch("/type/property/nullable/collections/model/non-null")
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
        Response<Void> patchNonNullSync(
                @HeaderParam("Content-Type") String contentType,
                @HeaderParam("accept") String accept,
                @BodyParam("application/merge-patch+json") BinaryData body,
                RequestOptions requestOptions,
                Context context);

        @Patch("/type/property/nullable/collections/model/null")
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
        Mono<Response<Void>> patchNull(
                @HeaderParam("Content-Type") String contentType,
                @HeaderParam("accept") String accept,
                @BodyParam("application/merge-patch+json") BinaryData body,
                RequestOptions requestOptions,
                Context context);

        @Patch("/type/property/nullable/collections/model/null")
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
        Response<Void> patchNullSync(
                @HeaderParam("Content-Type") String contentType,
                @HeaderParam("accept") String accept,
                @BodyParam("application/merge-patch+json") BinaryData body,
                RequestOptions requestOptions,
                Context context);
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
     *          (Required){
     *             property: String (Required)
     *         }
     *     ]
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getNonNullWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getNonNull(accept, requestOptions, context));
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
     *          (Required){
     *             property: String (Required)
     *         }
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getNonNullWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getNonNullSync(accept, requestOptions, Context.NONE);
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
     *          (Required){
     *             property: String (Required)
     *         }
     *     ]
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getNullWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getNull(accept, requestOptions, context));
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
     *          (Required){
     *             property: String (Required)
     *         }
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getNullWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getNullSync(accept, requestOptions, Context.NONE);
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
     *          (Required){
     *             property: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param body Model with collection models properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> patchNonNullWithResponseAsync(BinaryData body, RequestOptions requestOptions) {
        final String contentType = "application/merge-patch+json";
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.patchNonNull(contentType, accept, body, requestOptions, context));
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
     *          (Required){
     *             property: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param body Model with collection models properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> patchNonNullWithResponse(BinaryData body, RequestOptions requestOptions) {
        final String contentType = "application/merge-patch+json";
        final String accept = "application/json";
        return service.patchNonNullSync(contentType, accept, body, requestOptions, Context.NONE);
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
     *          (Required){
     *             property: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param body Model with collection models properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> patchNullWithResponseAsync(BinaryData body, RequestOptions requestOptions) {
        final String contentType = "application/merge-patch+json";
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.patchNull(contentType, accept, body, requestOptions, context));
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
     *          (Required){
     *             property: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param body Model with collection models properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> patchNullWithResponse(BinaryData body, RequestOptions requestOptions) {
        final String contentType = "application/merge-patch+json";
        final String accept = "application/json";
        return service.patchNullSync(contentType, accept, body, requestOptions, Context.NONE);
    }
}
