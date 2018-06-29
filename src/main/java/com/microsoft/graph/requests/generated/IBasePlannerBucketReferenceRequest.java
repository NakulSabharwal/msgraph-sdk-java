// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

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
 * The interface for the Base Planner Bucket Reference Request.
 */
public interface IBasePlannerBucketReferenceRequest extends IHttpRequest {

    void delete(final ICallback<PlannerBucket> callback);

    PlannerBucket delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBasePlannerBucketReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBasePlannerBucketReferenceRequest expand(final String value);

    /**
     * Puts the PlannerBucket
     *
     * @param srcPlannerBucket the PlannerBucket to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(PlannerBucket srcPlannerBucket, final ICallback<PlannerBucket> callback);

    /**
     * Puts the PlannerBucket
     *
     * @param srcPlannerBucket the PlannerBucket to PUT
     * @return the PlannerBucket
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    PlannerBucket put(PlannerBucket srcPlannerBucket) throws ClientException;
}
