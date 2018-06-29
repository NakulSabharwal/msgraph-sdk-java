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
import com.microsoft.graph.models.generated.WindowsArchitecture;
import com.microsoft.graph.models.generated.WindowsDeviceType;
import com.microsoft.graph.models.extensions.WindowsMinimumOperatingSystem;
import com.microsoft.graph.models.extensions.MobileLobApp;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows Universal App X.
 */
public class BaseWindowsUniversalAppX extends MobileLobApp implements IJsonBackedObject {


    /**
     * The Applicable Architectures.
     * 
     */
    @SerializedName("applicableArchitectures")
    @Expose
    public EnumSet<WindowsArchitecture> applicableArchitectures;

    /**
     * The Applicable Device Types.
     * 
     */
    @SerializedName("applicableDeviceTypes")
    @Expose
    public EnumSet<WindowsDeviceType> applicableDeviceTypes;

    /**
     * The Identity Name.
     * 
     */
    @SerializedName("identityName")
    @Expose
    public String identityName;

    /**
     * The Identity Publisher Hash.
     * 
     */
    @SerializedName("identityPublisherHash")
    @Expose
    public String identityPublisherHash;

    /**
     * The Identity Resource Identifier.
     * 
     */
    @SerializedName("identityResourceIdentifier")
    @Expose
    public String identityResourceIdentifier;

    /**
     * The Is Bundle.
     * 
     */
    @SerializedName("isBundle")
    @Expose
    public Boolean isBundle;

    /**
     * The Minimum Supported Operating System.
     * 
     */
    @SerializedName("minimumSupportedOperatingSystem")
    @Expose
    public WindowsMinimumOperatingSystem minimumSupportedOperatingSystem;

    /**
     * The Identity Version.
     * 
     */
    @SerializedName("identityVersion")
    @Expose
    public String identityVersion;


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
