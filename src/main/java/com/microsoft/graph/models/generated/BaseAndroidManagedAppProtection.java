// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.models.extensions.ManagedAppPolicyDeploymentSummary;
import com.microsoft.graph.models.extensions.TargetedManagedAppProtection;
import com.microsoft.graph.requests.generated.BaseManagedMobileAppCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Android Managed App Protection.
 */
public class BaseAndroidManagedAppProtection extends TargetedManagedAppProtection implements IJsonBackedObject {


    /**
     * The Screen Capture Blocked.
     * 
     */
    @SerializedName("screenCaptureBlocked")
    @Expose
    public Boolean screenCaptureBlocked;

    /**
     * The Disable App Encryption If Device Encryption Is Enabled.
     * 
     */
    @SerializedName("disableAppEncryptionIfDeviceEncryptionIsEnabled")
    @Expose
    public Boolean disableAppEncryptionIfDeviceEncryptionIsEnabled;

    /**
     * The Encrypt App Data.
     * 
     */
    @SerializedName("encryptAppData")
    @Expose
    public Boolean encryptAppData;

    /**
     * The Deployed App Count.
     * 
     */
    @SerializedName("deployedAppCount")
    @Expose
    public Integer deployedAppCount;

    /**
     * The Minimum Required Patch Version.
     * 
     */
    @SerializedName("minimumRequiredPatchVersion")
    @Expose
    public String minimumRequiredPatchVersion;

    /**
     * The Minimum Warning Patch Version.
     * 
     */
    @SerializedName("minimumWarningPatchVersion")
    @Expose
    public String minimumWarningPatchVersion;

    /**
     * The Apps.
     * 
     */
    public ManagedMobileAppCollectionPage apps;

    /**
     * The Deployment Summary.
     * 
     */
    @SerializedName("deploymentSummary")
    @Expose
    public ManagedAppPolicyDeploymentSummary deploymentSummary;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("apps")) {
            final BaseManagedMobileAppCollectionResponse response = new BaseManagedMobileAppCollectionResponse();
            if (json.has("apps@odata.nextLink")) {
                response.nextLink = json.get("apps@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("apps").toString(), JsonObject[].class);
            final ManagedMobileApp[] array = new ManagedMobileApp[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedMobileApp.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            apps = new ManagedMobileAppCollectionPage(response, null);
        }
    }
}
