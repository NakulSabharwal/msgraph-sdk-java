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
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.models.extensions.OnenoteSection;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.models.extensions.OnenoteEntityHierarchyModel;
import com.microsoft.graph.requests.generated.BaseOnenoteSectionCollectionResponse;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionPage;
import com.microsoft.graph.requests.generated.BaseSectionGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Section Group.
 */
public class BaseSectionGroup extends OnenoteEntityHierarchyModel implements IJsonBackedObject {


    /**
     * The Sections Url.
     * 
     */
    @SerializedName("sectionsUrl")
    @Expose
    public String sectionsUrl;

    /**
     * The Section Groups Url.
     * 
     */
    @SerializedName("sectionGroupsUrl")
    @Expose
    public String sectionGroupsUrl;

    /**
     * The Parent Notebook.
     * 
     */
    @SerializedName("parentNotebook")
    @Expose
    public Notebook parentNotebook;

    /**
     * The Parent Section Group.
     * 
     */
    @SerializedName("parentSectionGroup")
    @Expose
    public SectionGroup parentSectionGroup;

    /**
     * The Sections.
     * 
     */
    public OnenoteSectionCollectionPage sections;

    /**
     * The Section Groups.
     * 
     */
    public SectionGroupCollectionPage sectionGroups;


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


        if (json.has("sections")) {
            final BaseOnenoteSectionCollectionResponse response = new BaseOnenoteSectionCollectionResponse();
            if (json.has("sections@odata.nextLink")) {
                response.nextLink = json.get("sections@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sections").toString(), JsonObject[].class);
            final OnenoteSection[] array = new OnenoteSection[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnenoteSection.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sections = new OnenoteSectionCollectionPage(response, null);
        }

        if (json.has("sectionGroups")) {
            final BaseSectionGroupCollectionResponse response = new BaseSectionGroupCollectionResponse();
            if (json.has("sectionGroups@odata.nextLink")) {
                response.nextLink = json.get("sectionGroups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sectionGroups").toString(), JsonObject[].class);
            final SectionGroup[] array = new SectionGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SectionGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sectionGroups = new SectionGroupCollectionPage(response, null);
        }
    }
}
