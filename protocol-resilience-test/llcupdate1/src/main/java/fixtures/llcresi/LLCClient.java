// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.llcresi;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import fixtures.llcresi.implementation.ParamsImpl;

/** Initializes a new instance of the synchronous LLCClient type. */
@ServiceClient(builder = LLCClientBuilder.class)
public final class LLCClient {
    private final ParamsImpl serviceClient;

    /**
     * Initializes an instance of Params client.
     *
     * @param serviceClient the service client implementation.
     */
    LLCClient(ParamsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get true Boolean value on path.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>parameter</td><td>String</td><td>Yes</td><td>I am a required parameter</td></tr>
     *     <tr><td>newParameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return true Boolean value on path.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getRequiredWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getRequiredWithResponse(requestOptions, context);
    }

    /**
     * POST a JSON or a JPEG.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>contentLength</td><td>long</td><td>Yes</td><td>The contentLength parameter</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * Flux<ByteBuffer>
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param parameter I am a body parameter with a new content type. My only valid JSON entry is { url:
     *     "http://example.org/myimage.jpeg" }.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> postParametersWithResponse(
            BinaryData parameter, RequestOptions requestOptions, Context context) {
        return this.serviceClient.postParametersWithResponse(parameter, requestOptions, context);
    }

    /**
     * Delete something.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteParametersWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.deleteParametersWithResponse(requestOptions, context);
    }

    /**
     * I'm a new operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getNewOperationWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getNewOperationWithResponse(requestOptions, context);
    }
}
