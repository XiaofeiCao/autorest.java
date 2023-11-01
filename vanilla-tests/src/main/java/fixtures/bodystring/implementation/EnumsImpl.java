// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodystring.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import fixtures.bodystring.Enums;
import fixtures.bodystring.models.Colors;
import fixtures.bodystring.models.ErrorException;
import fixtures.bodystring.models.RefColorConstant;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Enums.
 */
public final class EnumsImpl implements Enums {
    /**
     * The proxy service used to perform REST calls.
     */
    private final EnumsService service;

    /**
     * The service client containing this operation class.
     */
    private final AutoRestSwaggerBATServiceImpl client;

    /**
     * Initializes an instance of EnumsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    EnumsImpl(AutoRestSwaggerBATServiceImpl client) {
        this.service = RestProxy.create(EnumsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestSwaggerBATServiceEnums to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestSwaggerBATSe")
    public interface EnumsService {
        @Get("/string/enum/notExpandable")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Colors>> getNotExpandable(@HostParam("$host") String host, @HeaderParam("Accept") String accept,
            Context context);

        @Put("/string/enum/notExpandable")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> putNotExpandable(@HostParam("$host") String host,
            @BodyParam("application/json") Colors stringBody, @HeaderParam("Accept") String accept, Context context);

        @Get("/string/enum/Referenced")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Colors>> getReferenced(@HostParam("$host") String host, @HeaderParam("Accept") String accept,
            Context context);

        @Put("/string/enum/Referenced")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> putReferenced(@HostParam("$host") String host,
            @BodyParam("application/json") Colors enumStringBody, @HeaderParam("Accept") String accept,
            Context context);

        @Get("/string/enum/ReferencedConstant")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<RefColorConstant>> getReferencedConstant(@HostParam("$host") String host,
            @HeaderParam("Accept") String accept, Context context);

        @Put("/string/enum/ReferencedConstant")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> putReferencedConstant(@HostParam("$host") String host,
            @BodyParam("application/json") RefColorConstant enumStringBody, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color' along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Colors>> getNotExpandableWithResponseAsync() {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getNotExpandable(this.client.getHost(), accept, context));
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color' along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Colors>> getNotExpandableWithResponseAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getNotExpandable(this.client.getHost(), accept, context);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color' on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Colors> getNotExpandableAsync() {
        return getNotExpandableWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color' on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Colors> getNotExpandableAsync(Context context) {
        return getNotExpandableWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color' along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Colors> getNotExpandableWithResponse(Context context) {
        return getNotExpandableWithResponseAsync(context).block();
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Colors getNotExpandable() {
        return getNotExpandableWithResponse(Context.NONE).getValue();
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param stringBody string body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putNotExpandableWithResponseAsync(Colors stringBody) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (stringBody == null) {
            return Mono.error(new IllegalArgumentException("Parameter stringBody is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.putNotExpandable(this.client.getHost(), stringBody, accept, context));
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param stringBody string body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putNotExpandableWithResponseAsync(Colors stringBody, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (stringBody == null) {
            return Mono.error(new IllegalArgumentException("Parameter stringBody is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.putNotExpandable(this.client.getHost(), stringBody, accept, context);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param stringBody string body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putNotExpandableAsync(Colors stringBody) {
        return putNotExpandableWithResponseAsync(stringBody).flatMap(ignored -> Mono.empty());
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param stringBody string body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putNotExpandableAsync(Colors stringBody, Context context) {
        return putNotExpandableWithResponseAsync(stringBody, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param stringBody string body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putNotExpandableWithResponse(Colors stringBody, Context context) {
        return putNotExpandableWithResponseAsync(stringBody, context).block();
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param stringBody string body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putNotExpandable(Colors stringBody) {
        putNotExpandableWithResponse(stringBody, Context.NONE);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color' along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Colors>> getReferencedWithResponseAsync() {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getReferenced(this.client.getHost(), accept, context));
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color' along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Colors>> getReferencedWithResponseAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getReferenced(this.client.getHost(), accept, context);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color' on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Colors> getReferencedAsync() {
        return getReferencedWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color' on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Colors> getReferencedAsync(Context context) {
        return getReferencedWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color' along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Colors> getReferencedWithResponse(Context context) {
        return getReferencedWithResponseAsync(context).block();
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Colors getReferenced() {
        return getReferencedWithResponse(Context.NONE).getValue();
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param enumStringBody enum string body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putReferencedWithResponseAsync(Colors enumStringBody) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (enumStringBody == null) {
            return Mono.error(new IllegalArgumentException("Parameter enumStringBody is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.putReferenced(this.client.getHost(), enumStringBody, accept, context));
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param enumStringBody enum string body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putReferencedWithResponseAsync(Colors enumStringBody, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (enumStringBody == null) {
            return Mono.error(new IllegalArgumentException("Parameter enumStringBody is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.putReferenced(this.client.getHost(), enumStringBody, accept, context);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param enumStringBody enum string body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putReferencedAsync(Colors enumStringBody) {
        return putReferencedWithResponseAsync(enumStringBody).flatMap(ignored -> Mono.empty());
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param enumStringBody enum string body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putReferencedAsync(Colors enumStringBody, Context context) {
        return putReferencedWithResponseAsync(enumStringBody, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param enumStringBody enum string body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putReferencedWithResponse(Colors enumStringBody, Context context) {
        return putReferencedWithResponseAsync(enumStringBody, context).block();
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     * 
     * @param enumStringBody enum string body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putReferenced(Colors enumStringBody) {
        putReferencedWithResponse(enumStringBody, Context.NONE);
    }

    /**
     * Get value 'green-color' from the constant.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value 'green-color' from the constant along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RefColorConstant>> getReferencedConstantWithResponseAsync() {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getReferencedConstant(this.client.getHost(), accept, context));
    }

    /**
     * Get value 'green-color' from the constant.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value 'green-color' from the constant along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RefColorConstant>> getReferencedConstantWithResponseAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getReferencedConstant(this.client.getHost(), accept, context);
    }

    /**
     * Get value 'green-color' from the constant.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value 'green-color' from the constant on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RefColorConstant> getReferencedConstantAsync() {
        return getReferencedConstantWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get value 'green-color' from the constant.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value 'green-color' from the constant on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RefColorConstant> getReferencedConstantAsync(Context context) {
        return getReferencedConstantWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get value 'green-color' from the constant.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value 'green-color' from the constant along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RefColorConstant> getReferencedConstantWithResponse(Context context) {
        return getReferencedConstantWithResponseAsync(context).block();
    }

    /**
     * Get value 'green-color' from the constant.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return value 'green-color' from the constant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RefColorConstant getReferencedConstant() {
        return getReferencedConstantWithResponse(Context.NONE).getValue();
    }

    /**
     * Sends value 'green-color' from a constant.
     * 
     * @param enumStringBody enum string body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putReferencedConstantWithResponseAsync(RefColorConstant enumStringBody) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (enumStringBody == null) {
            return Mono.error(new IllegalArgumentException("Parameter enumStringBody is required and cannot be null."));
        } else {
            enumStringBody.validate();
        }
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.putReferencedConstant(this.client.getHost(), enumStringBody, accept, context));
    }

    /**
     * Sends value 'green-color' from a constant.
     * 
     * @param enumStringBody enum string body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putReferencedConstantWithResponseAsync(RefColorConstant enumStringBody,
        Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (enumStringBody == null) {
            return Mono.error(new IllegalArgumentException("Parameter enumStringBody is required and cannot be null."));
        } else {
            enumStringBody.validate();
        }
        final String accept = "application/json";
        return service.putReferencedConstant(this.client.getHost(), enumStringBody, accept, context);
    }

    /**
     * Sends value 'green-color' from a constant.
     * 
     * @param enumStringBody enum string body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putReferencedConstantAsync(RefColorConstant enumStringBody) {
        return putReferencedConstantWithResponseAsync(enumStringBody).flatMap(ignored -> Mono.empty());
    }

    /**
     * Sends value 'green-color' from a constant.
     * 
     * @param enumStringBody enum string body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putReferencedConstantAsync(RefColorConstant enumStringBody, Context context) {
        return putReferencedConstantWithResponseAsync(enumStringBody, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Sends value 'green-color' from a constant.
     * 
     * @param enumStringBody enum string body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putReferencedConstantWithResponse(RefColorConstant enumStringBody, Context context) {
        return putReferencedConstantWithResponseAsync(enumStringBody, context).block();
    }

    /**
     * Sends value 'green-color' from a constant.
     * 
     * @param enumStringBody enum string body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putReferencedConstant(RefColorConstant enumStringBody) {
        putReferencedConstantWithResponse(enumStringBody, Context.NONE);
    }
}
