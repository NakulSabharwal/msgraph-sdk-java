// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.models.extensions.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Find BBody.
 */
public class BaseWorkbookFunctionsFindBBody {

    /**
     * The find Text.
     * 
     */
    @SerializedName("findText")
    @Expose
    public com.google.gson.JsonElement findText;

    /**
     * The within Text.
     * 
     */
    @SerializedName("withinText")
    @Expose
    public com.google.gson.JsonElement withinText;

    /**
     * The start Num.
     * 
     */
    @SerializedName("startNum")
    @Expose
    public com.google.gson.JsonElement startNum;


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
