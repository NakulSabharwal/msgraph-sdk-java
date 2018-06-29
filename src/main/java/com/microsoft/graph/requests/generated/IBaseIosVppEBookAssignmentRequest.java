// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.IosVppEBookAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Ios Vpp EBook Assignment Request.
 */
public interface IBaseIosVppEBookAssignmentRequest extends IHttpRequest {

    /**
     * Gets the IosVppEBookAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosVppEBookAssignment> callback);

    /**
     * Gets the IosVppEBookAssignment from the service
     *
     * @return the IosVppEBookAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVppEBookAssignment get() throws ClientException;

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
     * Patches this IosVppEBookAssignment with a source
     *
     * @param sourceIosVppEBookAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosVppEBookAssignment sourceIosVppEBookAssignment, final ICallback<IosVppEBookAssignment> callback);

    /**
     * Patches this IosVppEBookAssignment with a source
     *
     * @param sourceIosVppEBookAssignment the source object with updates
     * @return the updated IosVppEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVppEBookAssignment patch(final IosVppEBookAssignment sourceIosVppEBookAssignment) throws ClientException;

    /**
     * Posts a IosVppEBookAssignment with a new object
     *
     * @param newIosVppEBookAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosVppEBookAssignment newIosVppEBookAssignment, final ICallback<IosVppEBookAssignment> callback);

    /**
     * Posts a IosVppEBookAssignment with a new object
     *
     * @param newIosVppEBookAssignment the new object to create
     * @return the created IosVppEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVppEBookAssignment post(final IosVppEBookAssignment newIosVppEBookAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseIosVppEBookAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseIosVppEBookAssignmentRequest expand(final String value);

}

