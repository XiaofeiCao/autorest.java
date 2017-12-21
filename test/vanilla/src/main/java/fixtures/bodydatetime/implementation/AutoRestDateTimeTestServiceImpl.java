/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetime.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.bodydatetime.AutoRestDateTimeTestService;
import fixtures.bodydatetime.Datetimes;

/**
 * Initializes a new instance of the AutoRestDateTimeTestService class.
 */
public class AutoRestDateTimeTestServiceImpl extends ServiceClient implements AutoRestDateTimeTestService {
    /**
     * The Datetimes object to access its operations.
     */
    private Datetimes datetimes;

    /**
     * Gets the Datetimes object to access its operations.
     *
     * @return the Datetimes object.
     */
    public Datetimes datetimes() {
        return this.datetimes;
    }

    /**
     * Initializes an instance of AutoRestDateTimeTestService client.
     */
    public AutoRestDateTimeTestServiceImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestDateTimeTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestDateTimeTestServiceImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.datetimes = new DatetimesImpl(this);
    }
}
