// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedIOSStoreAppRequest;
import com.microsoft.graph.requests.extensions.ManagedIOSStoreAppRequest;
import com.microsoft.graph.models.extensions.ManagedIOSStoreApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed IOSStore App Request.
 */
public class BaseManagedIOSStoreAppRequest extends BaseRequest implements IBaseManagedIOSStoreAppRequest {

    /**
     * The request for the ManagedIOSStoreApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseManagedIOSStoreAppRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<ManagedIOSStoreApp> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ManagedIOSStoreApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ManagedIOSStoreApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedIOSStoreApp from the service
     *
     * @return the ManagedIOSStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedIOSStoreApp get() throws ClientException {
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
     * Patches this ManagedIOSStoreApp with a source
     *
     * @param sourceManagedIOSStoreApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedIOSStoreApp sourceManagedIOSStoreApp, final ICallback<ManagedIOSStoreApp> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedIOSStoreApp);
    }

    /**
     * Patches this ManagedIOSStoreApp with a source
     *
     * @param sourceManagedIOSStoreApp the source object with updates
     * @return the updated ManagedIOSStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedIOSStoreApp patch(final ManagedIOSStoreApp sourceManagedIOSStoreApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedIOSStoreApp);
    }

    /**
     * Creates a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedIOSStoreApp newManagedIOSStoreApp, final ICallback<ManagedIOSStoreApp> callback) {
        send(HttpMethod.POST, callback, newManagedIOSStoreApp);
    }

    /**
     * Creates a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the new object to create
     * @return the created ManagedIOSStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedIOSStoreApp post(final ManagedIOSStoreApp newManagedIOSStoreApp) throws ClientException {
        return send(HttpMethod.POST, newManagedIOSStoreApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedIOSStoreAppRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ManagedIOSStoreAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedIOSStoreAppRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ManagedIOSStoreAppRequest)this;
     }

}

