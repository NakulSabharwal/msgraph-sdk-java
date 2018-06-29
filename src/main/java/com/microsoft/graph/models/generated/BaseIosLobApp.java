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
import com.microsoft.graph.models.extensions.IosDeviceType;
import com.microsoft.graph.models.extensions.IosMinimumOperatingSystem;
import com.microsoft.graph.models.extensions.MobileLobApp;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Lob App.
 */
public class BaseIosLobApp extends MobileLobApp implements IJsonBackedObject {


    /**
     * The Bundle Id.
     * 
     */
    @SerializedName("bundleId")
    @Expose
    public String bundleId;

    /**
     * The Applicable Device Type.
     * 
     */
    @SerializedName("applicableDeviceType")
    @Expose
    public IosDeviceType applicableDeviceType;

    /**
     * The Minimum Supported Operating System.
     * 
     */
    @SerializedName("minimumSupportedOperatingSystem")
    @Expose
    public IosMinimumOperatingSystem minimumSupportedOperatingSystem;

    /**
     * The Expiration Date Time.
     * 
     */
    @SerializedName("expirationDateTime")
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Version Number.
     * 
     */
    @SerializedName("versionNumber")
    @Expose
    public String versionNumber;

    /**
     * The Build Number.
     * 
     */
    @SerializedName("buildNumber")
    @Expose
    public String buildNumber;


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
