// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.resiliency.devdriven;

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
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.resiliency.devdriven.models.Input;
import com.resiliency.devdriven.models.LROProduct;
import com.resiliency.devdriven.models.Mode;
import com.resiliency.devdriven.models.Product;

/** Initializes a new instance of the synchronous ResiliencyDevDrivenClient type. */
@ServiceClient(builder = ResiliencyDevDrivenClientBuilder.class)
public final class ResiliencyDevDrivenClient {
    @Generated private final ResiliencyDevDrivenAsyncClient client;

    /**
     * Initializes an instance of ResiliencyDevDrivenClient class.
     *
     * @param client the async client.
     */
    @Generated
    ResiliencyDevDrivenClient(ResiliencyDevDrivenAsyncClient client) {
        this.client = client;
    }

    /**
     * Get models that you will either return to end users as a raw body, or with a model added during grow up.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     key: String (Required)
     *     received: String(raw/model) (Required)
     * }
     * }</pre>
     *
     * @param mode The mode with which you'll be handling your returned body. 'raw' for just dealing with the raw body,
     *     and 'model' if you are going to convert the raw body to a customized body before returning to users. Allowed
     *     values: "raw", "model".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return models that you will either return to end users as a raw body, or with a model added during grow up along
     *     with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getModelWithResponse(String mode, RequestOptions requestOptions) {
        return this.client.getModelWithResponse(mode, requestOptions).block();
    }

    /**
     * Post either raw response as a model and pass in 'raw' for mode, or grow up your operation to take a model
     * instead, and put in 'model' as mode.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     hello: String (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     key: String (Required)
     *     received: String(raw/model) (Required)
     * }
     * }</pre>
     *
     * @param mode The mode with which you'll be handling your returned body. 'raw' for just dealing with the raw body,
     *     and 'model' if you are going to convert the raw body to a customized body before returning to users. Allowed
     *     values: "raw", "model".
     * @param input Please put {'hello': 'world!'}.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return product resource along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> postModelWithResponse(String mode, BinaryData input, RequestOptions requestOptions) {
        return this.client.postModelWithResponse(mode, input, requestOptions).block();
    }

    /**
     * Get pages that you will either return to users in pages of raw bodies, or pages of models following group.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     key: String (Required)
     *     received: String(raw/model) (Required)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return pages that you will either return to users in pages of raw bodies, or pages of models following group as
     *     paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getPages(RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.getPages(requestOptions));
    }

    /**
     * Long running put request that will either return to end users a final payload of a raw body, or a final payload
     * of a model after the SDK has grown up.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     key: String (Required)
     *     received: String(raw/model) (Required)
     *     provisioningState: String (Required)
     * }
     * }</pre>
     *
     * @param mode The mode with which you'll be handling your returned body. 'raw' for just dealing with the raw body,
     *     and 'model' if you are going to convert the raw body to a customized body before returning to users. Allowed
     *     values: "raw", "model".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return final response from LRO call along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> lroWithResponse(String mode, RequestOptions requestOptions) {
        return this.client.lroWithResponse(mode, requestOptions).block();
    }

    /**
     * Get models that you will either return to end users as a raw body, or with a model added during grow up.
     *
     * @param mode The mode with which you'll be handling your returned body. 'raw' for just dealing with the raw body,
     *     and 'model' if you are going to convert the raw body to a customized body before returning to users.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return models that you will either return to end users as a raw body, or with a model added during grow up.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Product getModel(Mode mode) {
        // Generated convenience method for getModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getModelWithResponse(mode.toString(), requestOptions).getValue().toObject(Product.class);
    }

    /**
     * Post either raw response as a model and pass in 'raw' for mode, or grow up your operation to take a model
     * instead, and put in 'model' as mode.
     *
     * @param mode The mode with which you'll be handling your returned body. 'raw' for just dealing with the raw body,
     *     and 'model' if you are going to convert the raw body to a customized body before returning to users.
     * @param input Please put {'hello': 'world!'}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product resource.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Product postModel(Mode mode, Input input) {
        // Generated convenience method for postModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return postModelWithResponse(mode.toString(), BinaryData.fromObject(input), requestOptions)
                .getValue()
                .toObject(Product.class);
    }

    /**
     * Get pages that you will either return to users in pages of raw bodies, or pages of models following group.
     *
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pages that you will either return to users in pages of raw bodies, or pages of models following group as
     *     paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Product> getPages() {
        // Generated convenience method for getPages
        return new PagedIterable<>(client.getPages());
    }

    /**
     * Long running put request that will either return to end users a final payload of a raw body, or a final payload
     * of a model after the SDK has grown up.
     *
     * @param mode The mode with which you'll be handling your returned body. 'raw' for just dealing with the raw body,
     *     and 'model' if you are going to convert the raw body to a customized body before returning to users.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return final response from LRO call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LROProduct lro(Mode mode) {
        // Generated convenience method for lroWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return lroWithResponse(mode.toString(), requestOptions).getValue().toObject(LROProduct.class);
    }
}
