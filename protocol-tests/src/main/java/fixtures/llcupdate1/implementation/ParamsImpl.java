// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.llcupdate1.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Head;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Params. */
public final class ParamsImpl {
    /** The proxy service used to perform REST calls. */
    private final ParamsService service;

    /** The service client containing this operation class. */
    private final DpgClientImpl client;

    /**
     * Initializes an instance of ParamsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ParamsImpl(DpgClientImpl client) {
        this.service = RestProxy.create(ParamsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DpgClientParams to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DpgClientParams")
    private interface ParamsService {
        @Head("/serviceDriven/parameters")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> headNoParams(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/serviceDriven/parameters")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> getRequired(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/serviceDriven/parameters")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> putRequiredOptional(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/serviceDriven/parameters")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> postParameters(
                @HostParam("$host") String host,
                @BodyParam("image/jpeg") BinaryData parameter,
                RequestOptions requestOptions,
                Context context);

        @Delete("/serviceDriven/parameters")
        @ExpectedResponses({204})
        Mono<Response<Void>> deleteParameters(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/serviceDriven/moreParameters")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> getOptional(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/serviceDriven/newPath")
        @ExpectedResponses({200})
        Mono<Response<BinaryData>> getNewOperation(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);
    }

    /**
     * Head request, no params. Initially has no query parameters. After evolution, a new optional query parameter is
     * added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> headNoParamsWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.headNoParams(this.client.getHost(), requestOptions, context));
    }

    /**
     * Head request, no params. Initially has no query parameters. After evolution, a new optional query parameter is
     * added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> headNoParamsWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.headNoParams(this.client.getHost(), requestOptions, context);
    }

    /**
     * Head request, no params. Initially has no query parameters. After evolution, a new optional query parameter is
     * added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> headNoParamsWithResponse(RequestOptions requestOptions) {
        return headNoParamsWithResponseAsync(requestOptions).block();
    }

    /**
     * Get true Boolean value on path. Initially only has one required Query Parameter. After evolution, a new optional
     * query parameter is added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>parameter</td><td>String</td><td>Yes</td><td>I am a required parameter</td></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return true Boolean value on path. Initially only has one required Query Parameter along with {@link Response}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getRequiredWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getRequired(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get true Boolean value on path. Initially only has one required Query Parameter. After evolution, a new optional
     * query parameter is added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>parameter</td><td>String</td><td>Yes</td><td>I am a required parameter</td></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return true Boolean value on path. Initially only has one required Query Parameter along with {@link Response}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getRequiredWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getRequired(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get true Boolean value on path. Initially only has one required Query Parameter. After evolution, a new optional
     * query parameter is added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>parameter</td><td>String</td><td>Yes</td><td>I am a required parameter</td></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return true Boolean value on path. Initially only has one required Query Parameter along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getRequiredWithResponse(RequestOptions requestOptions) {
        return getRequiredWithResponseAsync(requestOptions).block();
    }

    /**
     * Initially has one required query parameter and one optional query parameter. After evolution, a new optional
     * query parameter is added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>requiredParam</td><td>String</td><td>Yes</td><td>I am a required parameter</td></tr>
     *     <tr><td>optionalParam</td><td>String</td><td>No</td><td>I am an optional parameter</td></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> putRequiredOptionalWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putRequiredOptional(this.client.getHost(), requestOptions, context));
    }

    /**
     * Initially has one required query parameter and one optional query parameter. After evolution, a new optional
     * query parameter is added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>requiredParam</td><td>String</td><td>Yes</td><td>I am a required parameter</td></tr>
     *     <tr><td>optionalParam</td><td>String</td><td>No</td><td>I am an optional parameter</td></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> putRequiredOptionalWithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.putRequiredOptional(this.client.getHost(), requestOptions, context);
    }

    /**
     * Initially has one required query parameter and one optional query parameter. After evolution, a new optional
     * query parameter is added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>requiredParam</td><td>String</td><td>Yes</td><td>I am a required parameter</td></tr>
     *     <tr><td>optionalParam</td><td>String</td><td>No</td><td>I am an optional parameter</td></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> putRequiredOptionalWithResponse(RequestOptions requestOptions) {
        return putRequiredOptionalWithResponseAsync(requestOptions).block();
    }

    /**
     * POST a JSON or a JPEG.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>Content-Length</td><td>long</td><td>Yes</td><td>The contentLength parameter</td></tr>
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> postParametersWithResponseAsync(
            BinaryData parameter, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.postParameters(this.client.getHost(), parameter, requestOptions, context));
    }

    /**
     * POST a JSON or a JPEG.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>Content-Length</td><td>long</td><td>Yes</td><td>The contentLength parameter</td></tr>
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> postParametersWithResponseAsync(
            BinaryData parameter, RequestOptions requestOptions, Context context) {
        return service.postParameters(this.client.getHost(), parameter, requestOptions, context);
    }

    /**
     * POST a JSON or a JPEG.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>Content-Length</td><td>long</td><td>Yes</td><td>The contentLength parameter</td></tr>
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> postParametersWithResponse(BinaryData parameter, RequestOptions requestOptions) {
        return postParametersWithResponseAsync(parameter, requestOptions).block();
    }

    /**
     * Delete something. Initially the path exists but there is no delete method. After evolution this is a new method
     * in a known path.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteParametersWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.deleteParameters(this.client.getHost(), requestOptions, context));
    }

    /**
     * Delete something. Initially the path exists but there is no delete method. After evolution this is a new method
     * in a known path.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteParametersWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.deleteParameters(this.client.getHost(), requestOptions, context);
    }

    /**
     * Delete something. Initially the path exists but there is no delete method. After evolution this is a new method
     * in a known path.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteParametersWithResponse(RequestOptions requestOptions) {
        return deleteParametersWithResponseAsync(requestOptions).block();
    }

    /**
     * Get true Boolean value on path. Initially has one optional query parameter. After evolution, a new optional query
     * parameter is added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>optionalParam</td><td>String</td><td>No</td><td>I am an optional parameter</td></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return true Boolean value on path. Initially has one optional query parameter along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getOptionalWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getOptional(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get true Boolean value on path. Initially has one optional query parameter. After evolution, a new optional query
     * parameter is added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>optionalParam</td><td>String</td><td>No</td><td>I am an optional parameter</td></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return true Boolean value on path. Initially has one optional query parameter along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getOptionalWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getOptional(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get true Boolean value on path. Initially has one optional query parameter. After evolution, a new optional query
     * parameter is added.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>optionalParam</td><td>String</td><td>No</td><td>I am an optional parameter</td></tr>
     *     <tr><td>new_parameter</td><td>String</td><td>No</td><td>I'm a new input optional parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return true Boolean value on path. Initially has one optional query parameter along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getOptionalWithResponse(RequestOptions requestOptions) {
        return getOptionalWithResponseAsync(requestOptions).block();
    }

    /**
     * I'm a new operation. Initiallty neither path or method exist for this operation. After evolution, this is a new
     * method in a new path.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getNewOperationWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getNewOperation(this.client.getHost(), requestOptions, context));
    }

    /**
     * I'm a new operation. Initiallty neither path or method exist for this operation. After evolution, this is a new
     * method in a new path.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getNewOperationWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getNewOperation(this.client.getHost(), requestOptions, context);
    }

    /**
     * I'm a new operation. Initiallty neither path or method exist for this operation. After evolution, this is a new
     * method in a new path.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * Object
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @return any object along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getNewOperationWithResponse(RequestOptions requestOptions) {
        return getNewOperationWithResponseAsync(requestOptions).block();
    }

    /**
     * Sends the {@code httpRequest}.
     *
     * @param httpRequest The HTTP request to send.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> sendRequestAsync(HttpRequest httpRequest) {
        return FluxUtil.withContext(
                context ->
                        this.client
                                .getHttpPipeline()
                                .send(httpRequest, context)
                                .flatMap(
                                        response ->
                                                BinaryData.fromFlux(response.getBody())
                                                        .map(
                                                                body ->
                                                                        new SimpleResponse<>(
                                                                                response.getRequest(),
                                                                                response.getStatusCode(),
                                                                                response.getHeaders(),
                                                                                body))));
    }

    /**
     * Sends the {@code httpRequest}.
     *
     * @param httpRequest The HTTP request to send.
     * @param context The context to associate with this operation.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> sendRequest(HttpRequest httpRequest, Context context) {
        return this.sendRequestAsync(httpRequest)
                .contextWrite(c -> c.putAll(FluxUtil.toReactorContext(context).readOnly()))
                .block();
    }
}
