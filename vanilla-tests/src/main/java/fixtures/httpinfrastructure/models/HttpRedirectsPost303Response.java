// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.httpinfrastructure.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the post303 operation. */
public final class HttpRedirectsPost303Response extends ResponseBase<HttpRedirectsPost303Headers, Void> {
    /**
     * Creates an instance of HttpRedirectsPost303Response.
     *
     * @param request the request which resulted in this HttpRedirectsPost303Response.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public HttpRedirectsPost303Response(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Void value,
            HttpRedirectsPost303Headers headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
