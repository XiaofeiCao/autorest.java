/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyarray.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.bodyarray.Arrays;
import fixtures.bodyarray.AutoRestSwaggerBATArrayService;

/**
 * Initializes a new instance of the AutoRestSwaggerBATArrayService class.
 */
public class AutoRestSwaggerBATArrayServiceImpl extends ServiceClient implements AutoRestSwaggerBATArrayService {
    /**
     * The Arrays object to access its operations.
     */
    private Arrays arrays;

    /**
     * Gets the Arrays object to access its operations.
     *
     * @return the Arrays object.
     */
    public Arrays arrays() {
        return this.arrays;
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATArrayService client.
     */
    public AutoRestSwaggerBATArrayServiceImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATArrayService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestSwaggerBATArrayServiceImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.arrays = new ArraysImpl(this);
    }
}
