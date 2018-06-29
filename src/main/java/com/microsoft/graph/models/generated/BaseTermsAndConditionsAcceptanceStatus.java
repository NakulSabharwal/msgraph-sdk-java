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
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Terms And Conditions Acceptance Status.
 */
public class BaseTermsAndConditionsAcceptanceStatus extends Entity implements IJsonBackedObject {


    /**
     * The User Display Name.
     * 
     */
    @SerializedName("userDisplayName")
    @Expose
    public String userDisplayName;

    /**
     * The Accepted Version.
     * 
     */
    @SerializedName("acceptedVersion")
    @Expose
    public Integer acceptedVersion;

    /**
     * The Accepted Date Time.
     * 
     */
    @SerializedName("acceptedDateTime")
    @Expose
    public java.util.Calendar acceptedDateTime;

    /**
     * The Terms And Conditions.
     * 
     */
    @SerializedName("termsAndConditions")
    @Expose
    public TermsAndConditions termsAndConditions;


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
