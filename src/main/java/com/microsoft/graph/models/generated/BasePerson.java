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
import com.microsoft.graph.models.extensions.ScoredEmailAddress;
import com.microsoft.graph.models.extensions.Phone;
import com.microsoft.graph.models.extensions.Location;
import com.microsoft.graph.models.extensions.Website;
import com.microsoft.graph.models.extensions.PersonType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Person.
 */
public class BasePerson extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Given Name.
     * 
     */
    @SerializedName("givenName")
    @Expose
    public String givenName;

    /**
     * The Surname.
     * 
     */
    @SerializedName("surname")
    @Expose
    public String surname;

    /**
     * The Birthday.
     * 
     */
    @SerializedName("birthday")
    @Expose
    public String birthday;

    /**
     * The Person Notes.
     * 
     */
    @SerializedName("personNotes")
    @Expose
    public String personNotes;

    /**
     * The Is Favorite.
     * 
     */
    @SerializedName("isFavorite")
    @Expose
    public Boolean isFavorite;

    /**
     * The Scored Email Addresses.
     * 
     */
    @SerializedName("scoredEmailAddresses")
    @Expose
    public java.util.List<ScoredEmailAddress> scoredEmailAddresses;

    /**
     * The Phones.
     * 
     */
    @SerializedName("phones")
    @Expose
    public java.util.List<Phone> phones;

    /**
     * The Postal Addresses.
     * 
     */
    @SerializedName("postalAddresses")
    @Expose
    public java.util.List<Location> postalAddresses;

    /**
     * The Websites.
     * 
     */
    @SerializedName("websites")
    @Expose
    public java.util.List<Website> websites;

    /**
     * The Job Title.
     * 
     */
    @SerializedName("jobTitle")
    @Expose
    public String jobTitle;

    /**
     * The Company Name.
     * 
     */
    @SerializedName("companyName")
    @Expose
    public String companyName;

    /**
     * The Yomi Company.
     * 
     */
    @SerializedName("yomiCompany")
    @Expose
    public String yomiCompany;

    /**
     * The Department.
     * 
     */
    @SerializedName("department")
    @Expose
    public String department;

    /**
     * The Office Location.
     * 
     */
    @SerializedName("officeLocation")
    @Expose
    public String officeLocation;

    /**
     * The Profession.
     * 
     */
    @SerializedName("profession")
    @Expose
    public String profession;

    /**
     * The Person Type.
     * 
     */
    @SerializedName("personType")
    @Expose
    public PersonType personType;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Im Address.
     * 
     */
    @SerializedName("imAddress")
    @Expose
    public String imAddress;


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
