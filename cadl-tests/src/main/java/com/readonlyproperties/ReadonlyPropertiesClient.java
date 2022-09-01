// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.readonlyproperties;

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
import com.readonlyproperties.models.OutputModel;
import com.readonlyproperties.models.RoundTripModel;

/** Initializes a new instance of the synchronous ReadonlyPropertiesClient type. */
@ServiceClient(builder = ReadonlyPropertiesClientBuilder.class)
public final class ReadonlyPropertiesClient {
    @Generated private final ReadonlyPropertiesAsyncClient client;

    /**
     * Initializes an instance of ReadonlyPropertiesClient class.
     *
     * @param client the async client.
     */
    @Generated
    ReadonlyPropertiesClient(ReadonlyPropertiesAsyncClient client) {
        this.client = client;
    }

    /**
     * The getOptionalPropertyModel operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredReadonlyString: String (Required)
     *     requiredReadonlyInt: long (Required)
     *     optionalReadonlyString: String (Optional)
     *     optionalReadonlyInt: Long (Optional)
     *     requiredReadonlyModel (Required): {
     *         requiredString: String (Required)
     *     }
     *     optionalReadonlyModel (Optional): (recursive schema, see optionalReadonlyModel above)
     *     requiredReadonlyStringList (Required): [
     *         String (Required)
     *     ]
     *     requiredReadonlyIntList (Required): [
     *         long (Required)
     *     ]
     *     optionalReadonlyStringList (Optional): [
     *         String (Optional)
     *     ]
     *     optionalReadonlyIntList (Optional): [
     *         long (Optional)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return output model with readonly properties along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getOptionalPropertyModelWithResponse(RequestOptions requestOptions) {
        return this.client.getOptionalPropertyModelWithResponse(requestOptions).block();
    }

    /**
     * The setOptionalPropertyModel operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredReadonlyString: String (Required)
     *     requiredReadonlyInt: long (Required)
     *     optionalReadonlyString: String (Optional)
     *     optionalReadonlyInt: Long (Optional)
     *     requiredReadonlyModel (Required): {
     *         requiredString: String (Required)
     *     }
     *     optionalReadonlyModel (Optional): (recursive schema, see optionalReadonlyModel above)
     *     requiredReadonlyStringList (Required): [
     *         String (Required)
     *     ]
     *     requiredReadonlyIntList (Required): [
     *         long (Required)
     *     ]
     *     optionalReadonlyStringList (Optional): [
     *         String (Optional)
     *     ]
     *     optionalReadonlyIntList (Optional): [
     *         long (Optional)
     *     ]
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredReadonlyString: String (Required)
     *     requiredReadonlyInt: long (Required)
     *     optionalReadonlyString: String (Optional)
     *     optionalReadonlyInt: Long (Optional)
     *     requiredReadonlyModel (Required): {
     *         requiredString: String (Required)
     *     }
     *     optionalReadonlyModel (Optional): (recursive schema, see optionalReadonlyModel above)
     *     requiredReadonlyStringList (Required): [
     *         String (Required)
     *     ]
     *     requiredReadonlyIntList (Required): [
     *         long (Required)
     *     ]
     *     optionalReadonlyStringList (Optional): [
     *         String (Optional)
     *     ]
     *     optionalReadonlyIntList (Optional): [
     *         long (Optional)
     *     ]
     * }
     * }</pre>
     *
     * @param input Round-trip model with readonly properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return round-trip model with readonly properties along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> setOptionalPropertyModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.client.setOptionalPropertyModelWithResponse(input, requestOptions).block();
    }

    /**
     * The getOptionalPropertyModel operation.
     *
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output model with readonly properties.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OutputModel getOptionalPropertyModel() {
        // Generated convenience method for getOptionalPropertyModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getOptionalPropertyModelWithResponse(requestOptions).getValue().toObject(OutputModel.class);
    }

    /**
     * The setOptionalPropertyModel operation.
     *
     * @param input Round-trip model with readonly properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return round-trip model with readonly properties.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoundTripModel setOptionalPropertyModel(RoundTripModel input) {
        // Generated convenience method for setOptionalPropertyModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return setOptionalPropertyModelWithResponse(BinaryData.fromObject(input), requestOptions)
                .getValue()
                .toObject(RoundTripModel.class);
    }
}
