// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IRoleAssignmentRequest;
import com.microsoft.graph.requests.extensions.RoleAssignmentRequest;
import com.microsoft.graph.models.extensions.RoleAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Role Assignment Request.
 */
public class BaseRoleAssignmentRequest extends BaseRequest implements IBaseRoleAssignmentRequest {

    /**
     * The request for the RoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseRoleAssignmentRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends RoleAssignment> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the RoleAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<RoleAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the RoleAssignment from the service
     *
     * @return the RoleAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RoleAssignment get() throws ClientException {
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
     * Patches this RoleAssignment with a source
     *
     * @param sourceRoleAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final RoleAssignment sourceRoleAssignment, final ICallback<RoleAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceRoleAssignment);
    }

    /**
     * Patches this RoleAssignment with a source
     *
     * @param sourceRoleAssignment the source object with updates
     * @return the updated RoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RoleAssignment patch(final RoleAssignment sourceRoleAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceRoleAssignment);
    }

    /**
     * Creates a RoleAssignment with a new object
     *
     * @param newRoleAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final RoleAssignment newRoleAssignment, final ICallback<RoleAssignment> callback) {
        send(HttpMethod.POST, callback, newRoleAssignment);
    }

    /**
     * Creates a RoleAssignment with a new object
     *
     * @param newRoleAssignment the new object to create
     * @return the created RoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RoleAssignment post(final RoleAssignment newRoleAssignment) throws ClientException {
        return send(HttpMethod.POST, newRoleAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IRoleAssignmentRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (RoleAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IRoleAssignmentRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (RoleAssignmentRequest)this;
     }

}

