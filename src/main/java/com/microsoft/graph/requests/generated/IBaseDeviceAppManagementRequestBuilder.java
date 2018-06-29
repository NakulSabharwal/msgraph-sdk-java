// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementRequest;
import com.microsoft.graph.requests.extensions.IMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device App Management Request Builder.
 */
public interface IBaseDeviceAppManagementRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceAppManagementRequest instance
     */
    IDeviceAppManagementRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceAppManagementRequest instance
     */
    IDeviceAppManagementRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IMobileAppCollectionRequestBuilder mobileApps();

    IMobileAppRequestBuilder mobileApps(final String id);

    IMobileAppCategoryCollectionRequestBuilder mobileAppCategories();

    IMobileAppCategoryRequestBuilder mobileAppCategories(final String id);

    IManagedDeviceMobileAppConfigurationCollectionRequestBuilder mobileAppConfigurations();

    IManagedDeviceMobileAppConfigurationRequestBuilder mobileAppConfigurations(final String id);

    IManagedAppPolicyCollectionRequestBuilder managedAppPolicies();

    IManagedAppPolicyRequestBuilder managedAppPolicies(final String id);

    IIosManagedAppProtectionCollectionRequestBuilder iosManagedAppProtections();

    IIosManagedAppProtectionRequestBuilder iosManagedAppProtections(final String id);

    IAndroidManagedAppProtectionCollectionRequestBuilder androidManagedAppProtections();

    IAndroidManagedAppProtectionRequestBuilder androidManagedAppProtections(final String id);

    IDefaultManagedAppProtectionCollectionRequestBuilder defaultManagedAppProtections();

    IDefaultManagedAppProtectionRequestBuilder defaultManagedAppProtections(final String id);

    ITargetedManagedAppConfigurationCollectionRequestBuilder targetedManagedAppConfigurations();

    ITargetedManagedAppConfigurationRequestBuilder targetedManagedAppConfigurations(final String id);

    IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder mdmWindowsInformationProtectionPolicies();

    IMdmWindowsInformationProtectionPolicyRequestBuilder mdmWindowsInformationProtectionPolicies(final String id);

    IWindowsInformationProtectionPolicyCollectionRequestBuilder windowsInformationProtectionPolicies();

    IWindowsInformationProtectionPolicyRequestBuilder windowsInformationProtectionPolicies(final String id);

    IManagedAppRegistrationCollectionRequestBuilder managedAppRegistrations();

    IManagedAppRegistrationRequestBuilder managedAppRegistrations(final String id);

    IManagedAppStatusCollectionRequestBuilder managedAppStatuses();

    IManagedAppStatusRequestBuilder managedAppStatuses(final String id);

    IManagedEBookCollectionRequestBuilder managedEBooks();

    IManagedEBookRequestBuilder managedEBooks(final String id);
    IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder syncMicrosoftStoreForBusinessApps();

}
