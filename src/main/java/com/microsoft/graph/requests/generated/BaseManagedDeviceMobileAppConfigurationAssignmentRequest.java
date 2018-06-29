// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationAssignmentRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationAssignmentRequest;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Device Mobile App Configuration Assignment Request.
 */
public class BaseManagedDeviceMobileAppConfigurationAssignmentRequest extends BaseRequest implements IBaseManagedDeviceMobileAppConfigurationAssignmentRequest {

    /**
     * The request for the ManagedDeviceMobileAppConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseManagedDeviceMobileAppConfigurationAssignmentRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<ManagedDeviceMobileAppConfigurationAssignment> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ManagedDeviceMobileAppConfigurationAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationAssignment from the service
     *
     * @return the ManagedDeviceMobileAppConfigurationAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationAssignment get() throws ClientException {
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
     * Patches this ManagedDeviceMobileAppConfigurationAssignment with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedDeviceMobileAppConfigurationAssignment sourceManagedDeviceMobileAppConfigurationAssignment, final ICallback<ManagedDeviceMobileAppConfigurationAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedDeviceMobileAppConfigurationAssignment);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfigurationAssignment with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationAssignment the source object with updates
     * @return the updated ManagedDeviceMobileAppConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationAssignment patch(final ManagedDeviceMobileAppConfigurationAssignment sourceManagedDeviceMobileAppConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfigurationAssignment);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationAssignment with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedDeviceMobileAppConfigurationAssignment newManagedDeviceMobileAppConfigurationAssignment, final ICallback<ManagedDeviceMobileAppConfigurationAssignment> callback) {
        send(HttpMethod.POST, callback, newManagedDeviceMobileAppConfigurationAssignment);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationAssignment with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationAssignment the new object to create
     * @return the created ManagedDeviceMobileAppConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationAssignment post(final ManagedDeviceMobileAppConfigurationAssignment newManagedDeviceMobileAppConfigurationAssignment) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceMobileAppConfigurationAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedDeviceMobileAppConfigurationAssignmentRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ManagedDeviceMobileAppConfigurationAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedDeviceMobileAppConfigurationAssignmentRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ManagedDeviceMobileAppConfigurationAssignmentRequest)this;
     }

}

