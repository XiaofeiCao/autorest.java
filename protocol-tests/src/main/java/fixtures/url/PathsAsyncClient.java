// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.url;

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
import fixtures.url.implementation.PathsImpl;
import java.time.OffsetDateTime;
import java.util.List;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous AutoRestUrlTestServiceClient type. */
@ServiceClient(builder = PathsClientBuilder.class, isAsync = true)
public final class PathsAsyncClient {
    @Generated private final PathsImpl serviceClient;

    /**
     * Initializes an instance of PathsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    PathsAsyncClient(PathsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get true Boolean value on path.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return true Boolean value on path along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getBooleanTrueWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getBooleanTrueWithResponseAsync(requestOptions);
    }

    /**
     * Get false Boolean value on path.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return false Boolean value on path along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getBooleanFalseWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getBooleanFalseWithResponseAsync(requestOptions);
    }

    /**
     * Get '1000000' integer value.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '1000000' integer value along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getIntOneMillionWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getIntOneMillionWithResponseAsync(requestOptions);
    }

    /**
     * Get '-1000000' integer value.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '-1000000' integer value along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getIntNegativeOneMillionWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getIntNegativeOneMillionWithResponseAsync(requestOptions);
    }

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '10000000000' 64 bit integer value along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getTenBillionWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getTenBillionWithResponseAsync(requestOptions);
    }

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '-10000000000' 64 bit integer value along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getNegativeTenBillionWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getNegativeTenBillionWithResponseAsync(requestOptions);
    }

    /**
     * Get '1.034E+20' numeric value.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '1.034E+20' numeric value along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> floatScientificPositiveWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.floatScientificPositiveWithResponseAsync(requestOptions);
    }

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '-1.034E-20' numeric value along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> floatScientificNegativeWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.floatScientificNegativeWithResponseAsync(requestOptions);
    }

    /**
     * Get '9999999.999' numeric value.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '9999999.999' numeric value along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> doubleDecimalPositiveWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.doubleDecimalPositiveWithResponseAsync(requestOptions);
    }

    /**
     * Get '-9999999.999' numeric value.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '-9999999.999' numeric value along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> doubleDecimalNegativeWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.doubleDecimalNegativeWithResponseAsync(requestOptions);
    }

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stringUnicodeWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.stringUnicodeWithResponseAsync(requestOptions);
    }

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return 'begin!*'();:@ &amp;=+$,/?#[]end along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stringUrlEncodedWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.stringUrlEncodedWithResponseAsync(requestOptions);
    }

    /**
     * Get 'begin!*'();:@&amp;=+$,end
     *
     * <p>https://tools.ietf.org/html/rfc3986#appendix-A 'path' accept any 'pchar' not encoded.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stringUrlNonEncodedWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.stringUrlNonEncodedWithResponseAsync(requestOptions);
    }

    /**
     * Get ''.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '' along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stringEmptyWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.stringEmptyWithResponseAsync(requestOptions);
    }

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return null (should throw) along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stringNullWithResponse(String stringPath, RequestOptions requestOptions) {
        return this.serviceClient.stringNullWithResponseAsync(stringPath, requestOptions);
    }

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Allowed values: "red color", "green color", "blue color".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return using uri with 'green color' in path parameter along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> enumValidWithResponse(String enumPath, RequestOptions requestOptions) {
        return this.serviceClient.enumValidWithResponseAsync(enumPath, requestOptions);
    }

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Allowed values: "red color", "green color", "blue color".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return null (should throw on the client before the request is sent on wire) along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> enumNullWithResponse(String enumPath, RequestOptions requestOptions) {
        return this.serviceClient.enumNullWithResponseAsync(enumPath, requestOptions);
    }

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> byteMultiByteWithResponse(byte[] bytePath, RequestOptions requestOptions) {
        return this.serviceClient.byteMultiByteWithResponseAsync(bytePath, requestOptions);
    }

    /**
     * Get '' as byte array.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '' as byte array along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> byteEmptyWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.byteEmptyWithResponseAsync(requestOptions);
    }

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw).
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return null as byte array (should throw) along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> byteNullWithResponse(byte[] bytePath, RequestOptions requestOptions) {
        return this.serviceClient.byteNullWithResponseAsync(bytePath, requestOptions);
    }

    /**
     * Get '2012-01-01' as date.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '2012-01-01' as date along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> dateValidWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.dateValidWithResponseAsync(requestOptions);
    }

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw).
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return null as date - this should throw or be unusable on the client side, depending on date representation
     *     along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> dateNullWithResponse(String datePath, RequestOptions requestOptions) {
        return this.serviceClient.dateNullWithResponseAsync(datePath, requestOptions);
    }

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return '2012-01-01T01:01:01Z' as date-time along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> dateTimeValidWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.dateTimeValidWithResponseAsync(requestOptions);
    }

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return null as date-time, should be disallowed or throw depending on representation of date-time along with
     *     {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> dateTimeNullWithResponse(OffsetDateTime dateTimePath, RequestOptions requestOptions) {
        return this.serviceClient.dateTimeNullWithResponseAsync(dateTimePath, requestOptions);
    }

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return 'lorem' encoded value as 'bG9yZW0' (base64url) along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> base64UrlWithResponse(byte[] base64UrlPath, RequestOptions requestOptions) {
        return this.serviceClient.base64UrlWithResponseAsync(base64UrlPath, requestOptions);
    }

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the
     *     csv-array format.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array
     *     format along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> arrayCsvInPathWithResponse(List<String> arrayPath, RequestOptions requestOptions) {
        return this.serviceClient.arrayCsvInPathWithResponseAsync(arrayPath, requestOptions);
    }

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the date 2016-04-13 encoded value as '1460505600' (Unix time) along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> unixTimeUrlWithResponse(long unixTimeUrlPath, RequestOptions requestOptions) {
        return this.serviceClient.unixTimeUrlWithResponseAsync(unixTimeUrlPath, requestOptions);
    }
}
