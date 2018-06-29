// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLockerFileRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows Information Protection App Locker File Request Builder.
 */
public class BaseWindowsInformationProtectionAppLockerFileRequestBuilder extends BaseRequestBuilder implements IBaseWindowsInformationProtectionAppLockerFileRequestBuilder {

    /**
     * The request builder for the WindowsInformationProtectionAppLockerFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWindowsInformationProtectionAppLockerFileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWindowsInformationProtectionAppLockerFileRequest instance
     */
    public IWindowsInformationProtectionAppLockerFileRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsInformationProtectionAppLockerFileRequest instance
     */
    public IWindowsInformationProtectionAppLockerFileRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WindowsInformationProtectionAppLockerFileRequest(getRequestUrl(), getClient(), requestOptions);
    }

}

