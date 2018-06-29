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
import com.microsoft.graph.models.generated.RequiredPasswordType;
import com.microsoft.graph.models.generated.DeviceThreatProtectionLevel;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mac OSCompliance Policy.
 */
public class BaseMacOSCompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Password Required.
     * 
     */
    @SerializedName("passwordRequired")
    @Expose
    public Boolean passwordRequired;

    /**
     * The Password Block Simple.
     * 
     */
    @SerializedName("passwordBlockSimple")
    @Expose
    public Boolean passwordBlockSimple;

    /**
     * The Password Expiration Days.
     * 
     */
    @SerializedName("passwordExpirationDays")
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Length.
     * 
     */
    @SerializedName("passwordMinimumLength")
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Lock.
     * 
     */
    @SerializedName("passwordMinutesOfInactivityBeforeLock")
    @Expose
    public Integer passwordMinutesOfInactivityBeforeLock;

    /**
     * The Password Previous Password Block Count.
     * 
     */
    @SerializedName("passwordPreviousPasswordBlockCount")
    @Expose
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Minimum Character Set Count.
     * 
     */
    @SerializedName("passwordMinimumCharacterSetCount")
    @Expose
    public Integer passwordMinimumCharacterSetCount;

    /**
     * The Password Required Type.
     * 
     */
    @SerializedName("passwordRequiredType")
    @Expose
    public RequiredPasswordType passwordRequiredType;

    /**
     * The Os Minimum Version.
     * 
     */
    @SerializedName("osMinimumVersion")
    @Expose
    public String osMinimumVersion;

    /**
     * The Os Maximum Version.
     * 
     */
    @SerializedName("osMaximumVersion")
    @Expose
    public String osMaximumVersion;

    /**
     * The System Integrity Protection Enabled.
     * 
     */
    @SerializedName("systemIntegrityProtectionEnabled")
    @Expose
    public Boolean systemIntegrityProtectionEnabled;

    /**
     * The Device Threat Protection Enabled.
     * 
     */
    @SerializedName("deviceThreatProtectionEnabled")
    @Expose
    public Boolean deviceThreatProtectionEnabled;

    /**
     * The Device Threat Protection Required Security Level.
     * 
     */
    @SerializedName("deviceThreatProtectionRequiredSecurityLevel")
    @Expose
    public DeviceThreatProtectionLevel deviceThreatProtectionRequiredSecurityLevel;

    /**
     * The Storage Require Encryption.
     * 
     */
    @SerializedName("storageRequireEncryption")
    @Expose
    public Boolean storageRequireEncryption;


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
