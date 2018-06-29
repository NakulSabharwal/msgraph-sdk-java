// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyRequest;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyRequest;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed App Policy Request.
 */
public class BaseManagedAppPolicyRequest extends BaseRequest implements IBaseManagedAppPolicyRequest {

    /**
     * The request for the ManagedAppPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseManagedAppPolicyRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends ManagedAppPolicy> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ManagedAppPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ManagedAppPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedAppPolicy from the service
     *
     * @return the ManagedAppPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppPolicy get() throws ClientException {
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
     * Patches this ManagedAppPolicy with a source
     *
     * @param sourceManagedAppPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedAppPolicy sourceManagedAppPolicy, final ICallback<ManagedAppPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedAppPolicy);
    }

    /**
     * Patches this ManagedAppPolicy with a source
     *
     * @param sourceManagedAppPolicy the source object with updates
     * @return the updated ManagedAppPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppPolicy patch(final ManagedAppPolicy sourceManagedAppPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAppPolicy);
    }

    /**
     * Creates a ManagedAppPolicy with a new object
     *
     * @param newManagedAppPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedAppPolicy newManagedAppPolicy, final ICallback<ManagedAppPolicy> callback) {
        send(HttpMethod.POST, callback, newManagedAppPolicy);
    }

    /**
     * Creates a ManagedAppPolicy with a new object
     *
     * @param newManagedAppPolicy the new object to create
     * @return the created ManagedAppPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppPolicy post(final ManagedAppPolicy newManagedAppPolicy) throws ClientException {
        return send(HttpMethod.POST, newManagedAppPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedAppPolicyRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ManagedAppPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedAppPolicyRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ManagedAppPolicyRequest)this;
     }

}

