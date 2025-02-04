// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import fixtures.bodycomplex.implementation.PolymorphismsImpl;
import fixtures.bodycomplex.implementation.models.DotFish;
import fixtures.bodycomplex.implementation.models.DotFishMarket;
import fixtures.bodycomplex.implementation.models.ErrorException;
import fixtures.bodycomplex.implementation.models.Fish;
import fixtures.bodycomplex.implementation.models.Salmon;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous AutoRestComplexTestService type. */
@ServiceClient(builder = AutoRestComplexTestServiceBuilder.class, isAsync = true)
public final class PolymorphismAsyncClient {
    @Generated private final PolymorphismsImpl serviceClient;

    /**
     * Initializes an instance of PolymorphismAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    PolymorphismAsyncClient(PolymorphismsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get complex types that are polymorphic.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that are polymorphic along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Fish>> getValidWithResponse() {
        return this.serviceClient.getValidWithResponseAsync();
    }

    /**
     * Get complex types that are polymorphic.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that are polymorphic on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Fish> getValid() {
        return this.serviceClient.getValidAsync();
    }

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this: { 'fishtype':'Salmon', 'location':'alaska',
     *     'iswild':true, 'species':'king', 'length':1.0, 'siblings':[ { 'fishtype':'Shark', 'age':6, 'birthday':
     *     '2012-01-05T01:00:00Z', 'length':20.0, 'species':'predator', }, { 'fishtype':'Sawshark', 'age':105,
     *     'birthday': '1900-01-05T01:00:00Z', 'length':10.0, 'picture': new Buffer([255, 255, 255, 255,
     *     254]).toString('base64'), 'species':'dangerous', }, { 'fishtype': 'goblin', 'age': 1, 'birthday':
     *     '2015-08-08T00:00:00Z', 'length': 30.0, 'species': 'scary', 'jawsize': 5 } ] };.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidWithResponse(Fish complexBody) {
        return this.serviceClient.putValidWithResponseAsync(complexBody);
    }

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this: { 'fishtype':'Salmon', 'location':'alaska',
     *     'iswild':true, 'species':'king', 'length':1.0, 'siblings':[ { 'fishtype':'Shark', 'age':6, 'birthday':
     *     '2012-01-05T01:00:00Z', 'length':20.0, 'species':'predator', }, { 'fishtype':'Sawshark', 'age':105,
     *     'birthday': '1900-01-05T01:00:00Z', 'length':10.0, 'picture': new Buffer([255, 255, 255, 255,
     *     254]).toString('base64'), 'species':'dangerous', }, { 'fishtype': 'goblin', 'age': 1, 'birthday':
     *     '2015-08-08T00:00:00Z', 'length': 30.0, 'species': 'scary', 'jawsize': 5 } ] };.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putValid(Fish complexBody) {
        return this.serviceClient.putValidAsync(complexBody);
    }

    /**
     * Get complex types that are polymorphic, JSON key contains a dot.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that are polymorphic, JSON key contains a dot along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DotFish>> getDotSyntaxWithResponse() {
        return this.serviceClient.getDotSyntaxWithResponseAsync();
    }

    /**
     * Get complex types that are polymorphic, JSON key contains a dot.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that are polymorphic, JSON key contains a dot on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DotFish> getDotSyntax() {
        return this.serviceClient.getDotSyntaxAsync();
    }

    /**
     * Get complex object composing a polymorphic scalar property and array property with polymorphic element type, with
     * discriminator specified. Deserialization must NOT fail and use the discriminator type specified on the wire.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex object composing a polymorphic scalar property and array property with polymorphic element type,
     *     with discriminator specified along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DotFishMarket>> getComposedWithDiscriminatorWithResponse() {
        return this.serviceClient.getComposedWithDiscriminatorWithResponseAsync();
    }

    /**
     * Get complex object composing a polymorphic scalar property and array property with polymorphic element type, with
     * discriminator specified. Deserialization must NOT fail and use the discriminator type specified on the wire.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex object composing a polymorphic scalar property and array property with polymorphic element type,
     *     with discriminator specified on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DotFishMarket> getComposedWithDiscriminator() {
        return this.serviceClient.getComposedWithDiscriminatorAsync();
    }

    /**
     * Get complex object composing a polymorphic scalar property and array property with polymorphic element type,
     * without discriminator specified on wire. Deserialization must NOT fail and use the explicit type of the property.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex object composing a polymorphic scalar property and array property with polymorphic element type,
     *     without discriminator specified on wire along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DotFishMarket>> getComposedWithoutDiscriminatorWithResponse() {
        return this.serviceClient.getComposedWithoutDiscriminatorWithResponseAsync();
    }

    /**
     * Get complex object composing a polymorphic scalar property and array property with polymorphic element type,
     * without discriminator specified on wire. Deserialization must NOT fail and use the explicit type of the property.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex object composing a polymorphic scalar property and array property with polymorphic element type,
     *     without discriminator specified on wire on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DotFishMarket> getComposedWithoutDiscriminator() {
        return this.serviceClient.getComposedWithoutDiscriminatorAsync();
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties
     *     along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Salmon>> getComplicatedWithResponse() {
        return this.serviceClient.getComplicatedWithResponseAsync();
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties
     *     on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Salmon> getComplicated() {
        return this.serviceClient.getComplicatedAsync();
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param complexBody The complexBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putComplicatedWithResponse(Salmon complexBody) {
        return this.serviceClient.putComplicatedWithResponseAsync(complexBody);
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * @param complexBody The complexBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putComplicated(Salmon complexBody) {
        return this.serviceClient.putComplicatedAsync(complexBody);
    }

    /**
     * Put complex types that are polymorphic, omitting the discriminator.
     *
     * @param complexBody The complexBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Salmon>> putMissingDiscriminatorWithResponse(Salmon complexBody) {
        return this.serviceClient.putMissingDiscriminatorWithResponseAsync(complexBody);
    }

    /**
     * Put complex types that are polymorphic, omitting the discriminator.
     *
     * @param complexBody The complexBody parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Salmon> putMissingDiscriminator(Salmon complexBody) {
        return this.serviceClient.putMissingDiscriminatorAsync(complexBody);
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be
     * allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to
     *     be sent: { "fishtype": "sawshark", "species": "snaggle toothed", "length": 18.5, "age": 2, "birthday":
     *     "2013-06-01T01:00:00Z", "location": "alaska", "picture": base64(FF FF FF FF FE), "siblings": [ { "fishtype":
     *     "shark", "species": "predator", "birthday": "2012-01-05T01:00:00Z", "length": 20, "age": 6 }, { "fishtype":
     *     "sawshark", "species": "dangerous", "picture": base64(FF FF FF FF FE), "length": 10, "age": 105 } ] }.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidMissingRequiredWithResponse(Fish complexBody) {
        return this.serviceClient.putValidMissingRequiredWithResponseAsync(complexBody);
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be
     * allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to
     *     be sent: { "fishtype": "sawshark", "species": "snaggle toothed", "length": 18.5, "age": 2, "birthday":
     *     "2013-06-01T01:00:00Z", "location": "alaska", "picture": base64(FF FF FF FF FE), "siblings": [ { "fishtype":
     *     "shark", "species": "predator", "birthday": "2012-01-05T01:00:00Z", "length": 20, "age": 6 }, { "fishtype":
     *     "sawshark", "species": "dangerous", "picture": base64(FF FF FF FF FE), "length": 10, "age": 105 } ] }.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putValidMissingRequired(Fish complexBody) {
        return this.serviceClient.putValidMissingRequiredAsync(complexBody);
    }
}
