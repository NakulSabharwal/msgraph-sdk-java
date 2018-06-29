// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryRequest;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryRequest;
import com.microsoft.graph.requests.extensions.IDeviceComplianceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceSettingStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance Policy Setting State Summary Request Builder.
 */
public class BaseDeviceCompliancePolicySettingStateSummaryRequestBuilder extends BaseRequestBuilder implements IBaseDeviceCompliancePolicySettingStateSummaryRequestBuilder {

    /**
     * The request builder for the DeviceCompliancePolicySettingStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceCompliancePolicySettingStateSummaryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceCompliancePolicySettingStateSummaryRequest instance
     */
    public IDeviceCompliancePolicySettingStateSummaryRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceCompliancePolicySettingStateSummaryRequest instance
     */
    public IDeviceCompliancePolicySettingStateSummaryRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DeviceCompliancePolicySettingStateSummaryRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceComplianceSettingStateCollectionRequestBuilder deviceComplianceSettingStates() {
        return new DeviceComplianceSettingStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceComplianceSettingStates"), getClient(), null);
    }

    public IDeviceComplianceSettingStateRequestBuilder deviceComplianceSettingStates(final String id) {
        return new DeviceComplianceSettingStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceComplianceSettingStates") + "/" + id, getClient(), null);
    }
}

