// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.Domain;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Domain Request.
 */
public interface IBaseDomainRequest extends IHttpRequest {

    /**
     * Gets the Domain from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Domain> callback);

    /**
     * Gets the Domain from the service
     *
     * @return the Domain from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Domain get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Domain with a source
     *
     * @param sourceDomain the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Domain sourceDomain, final ICallback<Domain> callback);

    /**
     * Patches this Domain with a source
     *
     * @param sourceDomain the source object with updates
     * @return the updated Domain
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Domain patch(final Domain sourceDomain) throws ClientException;

    /**
     * Posts a Domain with a new object
     *
     * @param newDomain the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Domain newDomain, final ICallback<Domain> callback);

    /**
     * Posts a Domain with a new object
     *
     * @param newDomain the new object to create
     * @return the created Domain
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Domain post(final Domain newDomain) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDomainRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDomainRequest expand(final String value);

}

