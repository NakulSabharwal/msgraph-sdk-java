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
import com.microsoft.graph.models.generated.IosUpdatesInstallStatus;
import com.microsoft.graph.models.generated.ComplianceStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Update Device Status.
 */
public class BaseIosUpdateDeviceStatus extends Entity implements IJsonBackedObject {


    /**
     * The Install Status.
     * 
     */
    @SerializedName("installStatus")
    @Expose
    public IosUpdatesInstallStatus installStatus;

    /**
     * The Os Version.
     * 
     */
    @SerializedName("osVersion")
    @Expose
    public String osVersion;

    /**
     * The Device Id.
     * 
     */
    @SerializedName("deviceId")
    @Expose
    public String deviceId;

    /**
     * The User Id.
     * 
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The Device Display Name.
     * 
     */
    @SerializedName("deviceDisplayName")
    @Expose
    public String deviceDisplayName;

    /**
     * The User Name.
     * 
     */
    @SerializedName("userName")
    @Expose
    public String userName;

    /**
     * The Device Model.
     * 
     */
    @SerializedName("deviceModel")
    @Expose
    public String deviceModel;

    /**
     * The Compliance Grace Period Expiration Date Time.
     * 
     */
    @SerializedName("complianceGracePeriodExpirationDateTime")
    @Expose
    public java.util.Calendar complianceGracePeriodExpirationDateTime;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public ComplianceStatus status;

    /**
     * The Last Reported Date Time.
     * 
     */
    @SerializedName("lastReportedDateTime")
    @Expose
    public java.util.Calendar lastReportedDateTime;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;


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
