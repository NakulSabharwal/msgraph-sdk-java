// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IIosVppAppRequest;
import com.microsoft.graph.requests.extensions.IosVppAppRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Vpp App Request Builder.
 */
public class BaseIosVppAppRequestBuilder extends BaseRequestBuilder implements IBaseIosVppAppRequestBuilder {

    /**
     * The request builder for the IosVppApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseIosVppAppRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IIosVppAppRequest instance
     */
    public IIosVppAppRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIosVppAppRequest instance
     */
    public IIosVppAppRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new IosVppAppRequest(getRequestUrl(), getClient(), requestOptions);
    }

}

