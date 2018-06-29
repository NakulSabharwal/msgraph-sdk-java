// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Task Collection Page.
 */
public class BasePlannerTaskCollectionPage extends BaseCollectionPage<PlannerTask, IPlannerTaskCollectionRequestBuilder> implements IBasePlannerTaskCollectionPage {

    /**
     * A collection page for PlannerTask
     *
     * @param response the serialized BasePlannerTaskCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BasePlannerTaskCollectionPage(final BasePlannerTaskCollectionResponse response, final IPlannerTaskCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
