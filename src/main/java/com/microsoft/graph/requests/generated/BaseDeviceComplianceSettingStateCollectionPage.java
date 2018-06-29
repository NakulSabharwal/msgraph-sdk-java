// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DeviceComplianceSettingState;
import com.microsoft.graph.requests.extensions.IDeviceComplianceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance Setting State Collection Page.
 */
public class BaseDeviceComplianceSettingStateCollectionPage extends BaseCollectionPage<DeviceComplianceSettingState, IDeviceComplianceSettingStateCollectionRequestBuilder> implements IBaseDeviceComplianceSettingStateCollectionPage {

    /**
     * A collection page for DeviceComplianceSettingState
     *
     * @param response the serialized BaseDeviceComplianceSettingStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseDeviceComplianceSettingStateCollectionPage(final BaseDeviceComplianceSettingStateCollectionResponse response, final IDeviceComplianceSettingStateCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
