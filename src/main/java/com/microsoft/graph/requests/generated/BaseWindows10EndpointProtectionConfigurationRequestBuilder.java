// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWindows10EndpointProtectionConfigurationRequest;
import com.microsoft.graph.requests.extensions.Windows10EndpointProtectionConfigurationRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows10Endpoint Protection Configuration Request Builder.
 */
public class BaseWindows10EndpointProtectionConfigurationRequestBuilder extends BaseRequestBuilder implements IBaseWindows10EndpointProtectionConfigurationRequestBuilder {

    /**
     * The request builder for the Windows10EndpointProtectionConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWindows10EndpointProtectionConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWindows10EndpointProtectionConfigurationRequest instance
     */
    public IWindows10EndpointProtectionConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindows10EndpointProtectionConfigurationRequest instance
     */
    public IWindows10EndpointProtectionConfigurationRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new Windows10EndpointProtectionConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }

}

