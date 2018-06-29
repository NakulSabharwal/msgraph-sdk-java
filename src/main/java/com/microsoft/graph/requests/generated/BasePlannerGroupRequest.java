// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IPlannerGroupRequest;
import com.microsoft.graph.requests.extensions.PlannerGroupRequest;
import com.microsoft.graph.models.extensions.PlannerGroup;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Group Request.
 */
public class BasePlannerGroupRequest extends BaseRequest implements IBasePlannerGroupRequest {

    /**
     * The request for the PlannerGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BasePlannerGroupRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<PlannerGroup> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PlannerGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PlannerGroup> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerGroup from the service
     *
     * @return the PlannerGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this PlannerGroup with a source
     *
     * @param sourcePlannerGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerGroup sourcePlannerGroup, final ICallback<PlannerGroup> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerGroup);
    }

    /**
     * Patches this PlannerGroup with a source
     *
     * @param sourcePlannerGroup the source object with updates
     * @return the updated PlannerGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerGroup patch(final PlannerGroup sourcePlannerGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerGroup);
    }

    /**
     * Creates a PlannerGroup with a new object
     *
     * @param newPlannerGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerGroup newPlannerGroup, final ICallback<PlannerGroup> callback) {
        send(HttpMethod.POST, callback, newPlannerGroup);
    }

    /**
     * Creates a PlannerGroup with a new object
     *
     * @param newPlannerGroup the new object to create
     * @return the created PlannerGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerGroup post(final PlannerGroup newPlannerGroup) throws ClientException {
        return send(HttpMethod.POST, newPlannerGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerGroupRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PlannerGroupRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerGroupRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PlannerGroupRequest)this;
     }

}

