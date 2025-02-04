// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import fixtures.bodycomplex.implementation.PrimitivesImpl;
import fixtures.bodycomplex.implementation.models.BooleanWrapper;
import fixtures.bodycomplex.implementation.models.ByteWrapper;
import fixtures.bodycomplex.implementation.models.DateWrapper;
import fixtures.bodycomplex.implementation.models.DatetimeWrapper;
import fixtures.bodycomplex.implementation.models.Datetimerfc1123Wrapper;
import fixtures.bodycomplex.implementation.models.DoubleWrapper;
import fixtures.bodycomplex.implementation.models.DurationWrapper;
import fixtures.bodycomplex.implementation.models.ErrorException;
import fixtures.bodycomplex.implementation.models.FloatWrapper;
import fixtures.bodycomplex.implementation.models.IntWrapper;
import fixtures.bodycomplex.implementation.models.LongWrapper;
import fixtures.bodycomplex.implementation.models.StringWrapper;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous AutoRestComplexTestService type. */
@ServiceClient(builder = AutoRestComplexTestServiceBuilder.class, isAsync = true)
public final class PrimitiveAsyncClient {
    @Generated private final PrimitivesImpl serviceClient;

    /**
     * Initializes an instance of PrimitiveAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    PrimitiveAsyncClient(PrimitivesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get complex types with integer properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with integer properties along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IntWrapper>> getIntWithResponse() {
        return this.serviceClient.getIntWithResponseAsync();
    }

    /**
     * Get complex types with integer properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with integer properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IntWrapper> getInt() {
        return this.serviceClient.getIntAsync();
    }

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putIntWithResponse(IntWrapper complexBody) {
        return this.serviceClient.putIntWithResponseAsync(complexBody);
    }

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putInt(IntWrapper complexBody) {
        return this.serviceClient.putIntAsync(complexBody);
    }

    /**
     * Get complex types with long properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with long properties along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LongWrapper>> getLongWithResponse() {
        return this.serviceClient.getLongWithResponseAsync();
    }

    /**
     * Get complex types with long properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with long properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LongWrapper> getLong() {
        return this.serviceClient.getLongAsync();
    }

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putLongWithResponse(LongWrapper complexBody) {
        return this.serviceClient.putLongWithResponseAsync(complexBody);
    }

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putLong(LongWrapper complexBody) {
        return this.serviceClient.putLongAsync(complexBody);
    }

    /**
     * Get complex types with float properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with float properties along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<FloatWrapper>> getFloatWithResponse() {
        return this.serviceClient.getFloatWithResponseAsync();
    }

    /**
     * Get complex types with float properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with float properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FloatWrapper> getFloat() {
        return this.serviceClient.getFloatAsync();
    }

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putFloatWithResponse(FloatWrapper complexBody) {
        return this.serviceClient.putFloatWithResponseAsync(complexBody);
    }

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putFloat(FloatWrapper complexBody) {
        return this.serviceClient.putFloatAsync(complexBody);
    }

    /**
     * Get complex types with double properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with double properties along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DoubleWrapper>> getDoubleWithResponse() {
        return this.serviceClient.getDoubleWithResponseAsync();
    }

    /**
     * Get complex types with double properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with double properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DoubleWrapper> getDouble() {
        return this.serviceClient.getDoubleAsync();
    }

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDoubleWithResponse(DoubleWrapper complexBody) {
        return this.serviceClient.putDoubleWithResponseAsync(complexBody);
    }

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putDouble(DoubleWrapper complexBody) {
        return this.serviceClient.putDoubleAsync(complexBody);
    }

    /**
     * Get complex types with bool properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with bool properties along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BooleanWrapper>> getBoolWithResponse() {
        return this.serviceClient.getBoolWithResponseAsync();
    }

    /**
     * Get complex types with bool properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with bool properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BooleanWrapper> getBool() {
        return this.serviceClient.getBoolAsync();
    }

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putBoolWithResponse(BooleanWrapper complexBody) {
        return this.serviceClient.putBoolWithResponseAsync(complexBody);
    }

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putBool(BooleanWrapper complexBody) {
        return this.serviceClient.putBoolAsync(complexBody);
    }

    /**
     * Get complex types with string properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with string properties along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<StringWrapper>> getStringWithResponse() {
        return this.serviceClient.getStringWithResponseAsync();
    }

    /**
     * Get complex types with string properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with string properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StringWrapper> getString() {
        return this.serviceClient.getStringAsync();
    }

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putStringWithResponse(StringWrapper complexBody) {
        return this.serviceClient.putStringWithResponseAsync(complexBody);
    }

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putString(StringWrapper complexBody) {
        return this.serviceClient.putStringAsync(complexBody);
    }

    /**
     * Get complex types with date properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with date properties along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DateWrapper>> getDateWithResponse() {
        return this.serviceClient.getDateWithResponseAsync();
    }

    /**
     * Get complex types with date properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with date properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DateWrapper> getDate() {
        return this.serviceClient.getDateAsync();
    }

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDateWithResponse(DateWrapper complexBody) {
        return this.serviceClient.putDateWithResponseAsync(complexBody);
    }

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putDate(DateWrapper complexBody) {
        return this.serviceClient.putDateAsync(complexBody);
    }

    /**
     * Get complex types with datetime properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with datetime properties along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatetimeWrapper>> getDateTimeWithResponse() {
        return this.serviceClient.getDateTimeWithResponseAsync();
    }

    /**
     * Get complex types with datetime properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with datetime properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatetimeWrapper> getDateTime() {
        return this.serviceClient.getDateTimeAsync();
    }

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDateTimeWithResponse(DatetimeWrapper complexBody) {
        return this.serviceClient.putDateTimeWithResponseAsync(complexBody);
    }

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putDateTime(DatetimeWrapper complexBody) {
        return this.serviceClient.putDateTimeAsync(complexBody);
    }

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with datetimeRfc1123 properties along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Datetimerfc1123Wrapper>> getDateTimeRfc1123WithResponse() {
        return this.serviceClient.getDateTimeRfc1123WithResponseAsync();
    }

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with datetimeRfc1123 properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Datetimerfc1123Wrapper> getDateTimeRfc1123() {
        return this.serviceClient.getDateTimeRfc1123Async();
    }

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDateTimeRfc1123WithResponse(Datetimerfc1123Wrapper complexBody) {
        return this.serviceClient.putDateTimeRfc1123WithResponseAsync(complexBody);
    }

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putDateTimeRfc1123(Datetimerfc1123Wrapper complexBody) {
        return this.serviceClient.putDateTimeRfc1123Async(complexBody);
    }

    /**
     * Get complex types with duration properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with duration properties along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DurationWrapper>> getDurationWithResponse() {
        return this.serviceClient.getDurationWithResponseAsync();
    }

    /**
     * Get complex types with duration properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with duration properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DurationWrapper> getDuration() {
        return this.serviceClient.getDurationAsync();
    }

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDurationWithResponse(DurationWrapper complexBody) {
        return this.serviceClient.putDurationWithResponseAsync(complexBody);
    }

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putDuration(DurationWrapper complexBody) {
        return this.serviceClient.putDurationAsync(complexBody);
    }

    /**
     * Get complex types with byte properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with byte properties along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ByteWrapper>> getByteWithResponse() {
        return this.serviceClient.getByteWithResponseAsync();
    }

    /**
     * Get complex types with byte properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types with byte properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ByteWrapper> getByte() {
        return this.serviceClient.getByteAsync();
    }

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putByteWithResponse(ByteWrapper complexBody) {
        return this.serviceClient.putByteWithResponseAsync(complexBody);
    }

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putByte(ByteWrapper complexBody) {
        return this.serviceClient.putByteAsync(complexBody);
    }
}
