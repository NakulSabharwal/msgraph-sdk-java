// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequest;
import com.microsoft.graph.requests.extensions.PlannerBucketRequest;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskWithReferenceRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Bucket Request Builder.
 */
public class BasePlannerBucketRequestBuilder extends BaseRequestBuilder implements IBasePlannerBucketRequestBuilder {

    /**
     * The request builder for the PlannerBucket
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BasePlannerBucketRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IPlannerBucketRequest instance
     */
    public IPlannerBucketRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPlannerBucketRequest instance
     */
    public IPlannerBucketRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new PlannerBucketRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPlannerTaskCollectionWithReferencesRequestBuilder tasks() {
        return new PlannerTaskCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("tasks"), getClient(), null);
    }

    public IPlannerTaskWithReferenceRequestBuilder tasks(final String id) {
        return new PlannerTaskWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("tasks") + "/" + id, getClient(), null);
    }
}

