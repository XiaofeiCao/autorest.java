// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.model.empty;

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
import com.azure.core.util.FluxUtil;
import com.type.model.empty.implementation.EmptyClientImpl;
import com.type.model.empty.models.EmptyInput;
import com.type.model.empty.models.EmptyInputOutput;
import com.type.model.empty.models.EmptyOutput;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous EmptyClient type. */
@ServiceClient(builder = EmptyClientBuilder.class, isAsync = true)
public final class EmptyAsyncClient {
    @Generated private final EmptyClientImpl serviceClient;

    /**
     * Initializes an instance of EmptyAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    EmptyAsyncClient(EmptyClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The putEmpty operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     * }
     * }</pre>
     *
     * @param input Empty model used in operation parameters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putEmptyWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.putEmptyWithResponseAsync(input, requestOptions);
    }

    /**
     * The getEmpty operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty model used in operation return type along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getEmptyWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getEmptyWithResponseAsync(requestOptions);
    }

    /**
     * The postRoundTripEmpty operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     * }
     * }</pre>
     *
     * @param body Empty model used in both parameter and return type.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return empty model used in both parameter and return type along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> postRoundTripEmptyWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.postRoundTripEmptyWithResponseAsync(body, requestOptions);
    }

    /**
     * The putEmpty operation.
     *
     * @param input Empty model used in operation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putEmpty(EmptyInput input) {
        // Generated convenience method for putEmptyWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return putEmptyWithResponse(BinaryData.fromObject(input), requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The getEmpty operation.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return empty model used in operation return type on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EmptyOutput> getEmpty() {
        // Generated convenience method for getEmptyWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getEmptyWithResponse(requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(EmptyOutput.class));
    }

    /**
     * The postRoundTripEmpty operation.
     *
     * @param body Empty model used in both parameter and return type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return empty model used in both parameter and return type on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EmptyInputOutput> postRoundTripEmpty(EmptyInputOutput body) {
        // Generated convenience method for postRoundTripEmptyWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return postRoundTripEmptyWithResponse(BinaryData.fromObject(body), requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(EmptyInputOutput.class));
    }
}
