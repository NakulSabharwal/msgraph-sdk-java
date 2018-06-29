// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionRequest;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLockerFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLockerFileRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLockerFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLockerFileRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentRequestBuilder;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAssignRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAssignRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows Information Protection Request Builder.
 */
public class BaseWindowsInformationProtectionRequestBuilder extends BaseRequestBuilder implements IBaseWindowsInformationProtectionRequestBuilder {

    /**
     * The request builder for the WindowsInformationProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWindowsInformationProtectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWindowsInformationProtectionRequest instance
     */
    public IWindowsInformationProtectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsInformationProtectionRequest instance
     */
    public IWindowsInformationProtectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WindowsInformationProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder protectedAppLockerFiles() {
        return new WindowsInformationProtectionAppLockerFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("protectedAppLockerFiles"), getClient(), null);
    }

    public IWindowsInformationProtectionAppLockerFileRequestBuilder protectedAppLockerFiles(final String id) {
        return new WindowsInformationProtectionAppLockerFileRequestBuilder(getRequestUrlWithAdditionalSegment("protectedAppLockerFiles") + "/" + id, getClient(), null);
    }
    public IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder exemptAppLockerFiles() {
        return new WindowsInformationProtectionAppLockerFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exemptAppLockerFiles"), getClient(), null);
    }

    public IWindowsInformationProtectionAppLockerFileRequestBuilder exemptAppLockerFiles(final String id) {
        return new WindowsInformationProtectionAppLockerFileRequestBuilder(getRequestUrlWithAdditionalSegment("exemptAppLockerFiles") + "/" + id, getClient(), null);
    }
    public ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments() {
        return new TargetedManagedAppPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public ITargetedManagedAppPolicyAssignmentRequestBuilder assignments(final String id) {
        return new TargetedManagedAppPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    public IWindowsInformationProtectionAssignRequestBuilder assign(final java.util.List<TargetedManagedAppPolicyAssignment> assignments) {
        return new WindowsInformationProtectionAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }
}

