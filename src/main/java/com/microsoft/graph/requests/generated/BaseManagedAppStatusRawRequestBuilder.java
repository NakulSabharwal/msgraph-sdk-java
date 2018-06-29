// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedAppStatusRawRequest;
import com.microsoft.graph.requests.extensions.ManagedAppStatusRawRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed App Status Raw Request Builder.
 */
public class BaseManagedAppStatusRawRequestBuilder extends BaseRequestBuilder implements IBaseManagedAppStatusRawRequestBuilder {

    /**
     * The request builder for the ManagedAppStatusRaw
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedAppStatusRawRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagedAppStatusRawRequest instance
     */
    public IManagedAppStatusRawRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IManagedAppStatusRawRequest instance
     */
    public IManagedAppStatusRawRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ManagedAppStatusRawRequest(getRequestUrl(), getClient(), requestOptions);
    }

}

