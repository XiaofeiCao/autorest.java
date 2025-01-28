// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package payload.multipart;

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
import java.util.stream.Collectors;
import payload.multipart.implementation.FormDataHttpPartsImpl;
import payload.multipart.implementation.MultipartFormDataHelper;
import payload.multipart.models.ComplexHttpPartsModelRequest;
import payload.multipart.models.FileRequiredMetaData;

/**
 * Initializes a new instance of the synchronous MultiPartClient type.
 */
@ServiceClient(builder = MultiPartClientBuilder.class)
public final class FormDataHttpPartsClient {
    @Generated
    private final FormDataHttpPartsImpl serviceClient;

    /**
     * Initializes an instance of FormDataHttpPartsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    FormDataHttpPartsClient(FormDataHttpPartsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Test content-type: multipart/form-data for mixed scenarios.
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> jsonArrayAndFileArrayWithResponse(BinaryData body, RequestOptions requestOptions) {
        // Operation 'jsonArrayAndFileArray' is of content-type 'multipart/form-data'. Protocol API is not usable and
        // hence not generated.
        return this.serviceClient.jsonArrayAndFileArrayWithResponse(body, requestOptions);
    }

    /**
     * Test content-type: multipart/form-data for mixed scenarios.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void jsonArrayAndFileArray(ComplexHttpPartsModelRequest body) {
        // Generated convenience method for jsonArrayAndFileArrayWithResponse
        RequestOptions requestOptions = new RequestOptions();
        jsonArrayAndFileArrayWithResponse(
            new MultipartFormDataHelper(requestOptions).serializeTextField("id", body.getId())
                .serializeJsonField("address", body.getAddress())
                .serializeFileField("profileImage", body.getProfileImage().getContent(),
                    body.getProfileImage().getContentType(), body.getProfileImage().getFilename())
                .serializeJsonField("previousAddresses", body.getPreviousAddresses())
                .serializeFileFields("pictures",
                    body.getPictures().stream().map(FileRequiredMetaData::getContent).collect(Collectors.toList()),
                    body.getPictures().stream().map(FileRequiredMetaData::getContentType).collect(Collectors.toList()),
                    body.getPictures().stream().map(FileRequiredMetaData::getFilename).collect(Collectors.toList()))
                .end()
                .getRequestBody(),
            requestOptions).getValue();
    }
}
