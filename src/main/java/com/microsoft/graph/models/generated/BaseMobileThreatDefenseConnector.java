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
import com.microsoft.graph.models.generated.MobileThreatPartnerTenantState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mobile Threat Defense Connector.
 */
public class BaseMobileThreatDefenseConnector extends Entity implements IJsonBackedObject {


    /**
     * The Last Heartbeat Date Time.
     * 
     */
    @SerializedName("lastHeartbeatDateTime")
    @Expose
    public java.util.Calendar lastHeartbeatDateTime;

    /**
     * The Partner State.
     * 
     */
    @SerializedName("partnerState")
    @Expose
    public MobileThreatPartnerTenantState partnerState;

    /**
     * The Android Enabled.
     * 
     */
    @SerializedName("androidEnabled")
    @Expose
    public Boolean androidEnabled;

    /**
     * The Android Device Blocked On Missing Partner Data.
     * 
     */
    @SerializedName("androidDeviceBlockedOnMissingPartnerData")
    @Expose
    public Boolean androidDeviceBlockedOnMissingPartnerData;

    /**
     * The Ios Device Blocked On Missing Partner Data.
     * 
     */
    @SerializedName("iosDeviceBlockedOnMissingPartnerData")
    @Expose
    public Boolean iosDeviceBlockedOnMissingPartnerData;

    /**
     * The Partner Unsupported Os Version Blocked.
     * 
     */
    @SerializedName("partnerUnsupportedOsVersionBlocked")
    @Expose
    public Boolean partnerUnsupportedOsVersionBlocked;

    /**
     * The Ios Enabled.
     * 
     */
    @SerializedName("iosEnabled")
    @Expose
    public Boolean iosEnabled;

    /**
     * The Partner Unresponsiveness Threshold In Days.
     * 
     */
    @SerializedName("partnerUnresponsivenessThresholdInDays")
    @Expose
    public Integer partnerUnresponsivenessThresholdInDays;


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

    }
}
