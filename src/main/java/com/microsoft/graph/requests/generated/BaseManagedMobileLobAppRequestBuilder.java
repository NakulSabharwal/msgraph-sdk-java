// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedMobileLobAppRequest;
import com.microsoft.graph.requests.extensions.ManagedMobileLobAppRequest;
import com.microsoft.graph.requests.extensions.IMobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Mobile Lob App Request Builder.
 */
public class BaseManagedMobileLobAppRequestBuilder extends BaseRequestBuilder implements IBaseManagedMobileLobAppRequestBuilder {

    /**
     * The request builder for the ManagedMobileLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedMobileLobAppRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagedMobileLobAppRequest instance
     */
    public IManagedMobileLobAppRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IManagedMobileLobAppRequest instance
     */
    public IManagedMobileLobAppRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ManagedMobileLobAppRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMobileAppContentCollectionRequestBuilder contentVersions() {
        return new MobileAppContentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contentVersions"), getClient(), null);
    }

    public IMobileAppContentRequestBuilder contentVersions(final String id) {
        return new MobileAppContentRequestBuilder(getRequestUrlWithAdditionalSegment("contentVersions") + "/" + id, getClient(), null);
    }
}

