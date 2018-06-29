// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Plan Collection Reference Request.
 */
public class BasePlannerPlanCollectionReferenceRequest extends BaseCollectionRequest<BasePlannerPlanCollectionResponse, IPlannerPlanCollectionPage> implements IBasePlannerPlanCollectionReferenceRequest {

    /**
     * The request builder for this collection of PlannerPlan
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BasePlannerPlanCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BasePlannerPlanCollectionResponse.class, IPlannerPlanCollectionPage.class);
    }

    public void post(final PlannerPlan newPlannerPlan, final ICallback<PlannerPlan> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/planner/plans/" + newPlannerPlan.id);
        new PlannerPlanWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPlannerPlan, body, callback);
    }

    public PlannerPlan post(final PlannerPlan newPlannerPlan) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/planner/plans/" + newPlannerPlan.id);
        return new PlannerPlanWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getOptions())
                .post(newPlannerPlan, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPlannerPlanCollectionReferenceRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (PlannerPlanCollectionReferenceRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPlannerPlanCollectionReferenceRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (PlannerPlanCollectionReferenceRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPlannerPlanCollectionReferenceRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (PlannerPlanCollectionReferenceRequest)this;
    }
}
