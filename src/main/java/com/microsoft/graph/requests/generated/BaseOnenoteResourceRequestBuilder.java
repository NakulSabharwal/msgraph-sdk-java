// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IOnenoteResourceRequest;
import com.microsoft.graph.requests.extensions.OnenoteResourceRequest;
import com.microsoft.graph.requests.extensions.IOnenoteResourceStreamRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteResourceStreamRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Onenote Resource Request Builder.
 */
public class BaseOnenoteResourceRequestBuilder extends BaseRequestBuilder implements IBaseOnenoteResourceRequestBuilder {

    /**
     * The request builder for the OnenoteResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseOnenoteResourceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IOnenoteResourceRequest instance
     */
    public IOnenoteResourceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOnenoteResourceRequest instance
     */
    public IOnenoteResourceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new OnenoteResourceRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IOnenoteResourceStreamRequestBuilder content() {
        return new OnenoteResourceStreamRequestBuilder(getRequestUrlWithAdditionalSegment("content"), getClient(), null);
    }
}

