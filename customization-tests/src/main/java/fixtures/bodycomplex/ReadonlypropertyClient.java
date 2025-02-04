// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import fixtures.bodycomplex.implementation.ReadonlypropertiesImpl;
import fixtures.bodycomplex.implementation.models.ErrorException;
import fixtures.bodycomplex.implementation.models.ReadonlyObj;

/** Initializes a new instance of the synchronous AutoRestComplexTestService type. */
@ServiceClient(builder = AutoRestComplexTestServiceBuilder.class)
public final class ReadonlypropertyClient {
    @Generated private final ReadonlypropertiesImpl serviceClient;

    /**
     * Initializes an instance of ReadonlypropertyClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ReadonlypropertyClient(ReadonlypropertiesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get complex types that have readonly properties.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that have readonly properties along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReadonlyObj> getValidWithResponse(Context context) {
        return this.serviceClient.getValidWithResponse(context);
    }

    /**
     * Get complex types that have readonly properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that have readonly properties.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReadonlyObj getValid() {
        return this.serviceClient.getValid();
    }

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody The complexBody parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putValidWithResponse(ReadonlyObj complexBody, Context context) {
        return this.serviceClient.putValidWithResponse(complexBody, context);
    }

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody The complexBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putValid(ReadonlyObj complexBody) {
        this.serviceClient.putValid(complexBody);
    }
}
