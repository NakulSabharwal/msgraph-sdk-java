// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Management Troubleshooting Event Collection Page.
 */
public class BaseDeviceManagementTroubleshootingEventCollectionPage extends BaseCollectionPage<DeviceManagementTroubleshootingEvent, IDeviceManagementTroubleshootingEventCollectionRequestBuilder> implements IBaseDeviceManagementTroubleshootingEventCollectionPage {

    /**
     * A collection page for DeviceManagementTroubleshootingEvent
     *
     * @param response the serialized BaseDeviceManagementTroubleshootingEventCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseDeviceManagementTroubleshootingEventCollectionPage(final BaseDeviceManagementTroubleshootingEventCollectionResponse response, final IDeviceManagementTroubleshootingEventCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
