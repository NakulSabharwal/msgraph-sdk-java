// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyRequest;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyTargetAppsRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Managed App Policy Request Builder.
 */
public interface IBaseManagedAppPolicyRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IManagedAppPolicyRequest instance
     */
    IManagedAppPolicyRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IManagedAppPolicyRequest instance
     */
    IManagedAppPolicyRequest buildRequest(final java.util.List<? extends Option> requestOptions);
    IManagedAppPolicyTargetAppsRequestBuilder targetApps(final java.util.List<ManagedMobileApp> apps);

}
