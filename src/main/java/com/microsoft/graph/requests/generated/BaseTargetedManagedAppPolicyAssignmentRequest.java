// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppPolicyAssignmentRequest;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentRequest;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Targeted Managed App Policy Assignment Request.
 */
public class BaseTargetedManagedAppPolicyAssignmentRequest extends BaseRequest implements IBaseTargetedManagedAppPolicyAssignmentRequest {

    /**
     * The request for the TargetedManagedAppPolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseTargetedManagedAppPolicyAssignmentRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<TargetedManagedAppPolicyAssignment> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the TargetedManagedAppPolicyAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<TargetedManagedAppPolicyAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TargetedManagedAppPolicyAssignment from the service
     *
     * @return the TargetedManagedAppPolicyAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TargetedManagedAppPolicyAssignment get() throws ClientException {
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
     * Patches this TargetedManagedAppPolicyAssignment with a source
     *
     * @param sourceTargetedManagedAppPolicyAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TargetedManagedAppPolicyAssignment sourceTargetedManagedAppPolicyAssignment, final ICallback<TargetedManagedAppPolicyAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceTargetedManagedAppPolicyAssignment);
    }

    /**
     * Patches this TargetedManagedAppPolicyAssignment with a source
     *
     * @param sourceTargetedManagedAppPolicyAssignment the source object with updates
     * @return the updated TargetedManagedAppPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TargetedManagedAppPolicyAssignment patch(final TargetedManagedAppPolicyAssignment sourceTargetedManagedAppPolicyAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceTargetedManagedAppPolicyAssignment);
    }

    /**
     * Creates a TargetedManagedAppPolicyAssignment with a new object
     *
     * @param newTargetedManagedAppPolicyAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TargetedManagedAppPolicyAssignment newTargetedManagedAppPolicyAssignment, final ICallback<TargetedManagedAppPolicyAssignment> callback) {
        send(HttpMethod.POST, callback, newTargetedManagedAppPolicyAssignment);
    }

    /**
     * Creates a TargetedManagedAppPolicyAssignment with a new object
     *
     * @param newTargetedManagedAppPolicyAssignment the new object to create
     * @return the created TargetedManagedAppPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TargetedManagedAppPolicyAssignment post(final TargetedManagedAppPolicyAssignment newTargetedManagedAppPolicyAssignment) throws ClientException {
        return send(HttpMethod.POST, newTargetedManagedAppPolicyAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITargetedManagedAppPolicyAssignmentRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (TargetedManagedAppPolicyAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITargetedManagedAppPolicyAssignmentRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (TargetedManagedAppPolicyAssignmentRequest)this;
     }

}

