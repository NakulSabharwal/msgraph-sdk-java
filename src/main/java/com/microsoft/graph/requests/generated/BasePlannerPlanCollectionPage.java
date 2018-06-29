// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Plan Collection Page.
 */
public class BasePlannerPlanCollectionPage extends BaseCollectionPage<PlannerPlan, IPlannerPlanCollectionRequestBuilder> implements IBasePlannerPlanCollectionPage {

    /**
     * A collection page for PlannerPlan
     *
     * @param response the serialized BasePlannerPlanCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BasePlannerPlanCollectionPage(final BasePlannerPlanCollectionResponse response, final IPlannerPlanCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
