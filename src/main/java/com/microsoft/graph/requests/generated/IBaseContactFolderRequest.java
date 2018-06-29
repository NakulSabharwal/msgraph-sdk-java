// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.ContactFolder;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Contact Folder Request.
 */
public interface IBaseContactFolderRequest extends IHttpRequest {

    /**
     * Gets the ContactFolder from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ContactFolder> callback);

    /**
     * Gets the ContactFolder from the service
     *
     * @return the ContactFolder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ContactFolder get() throws ClientException;

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
     * Patches this ContactFolder with a source
     *
     * @param sourceContactFolder the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ContactFolder sourceContactFolder, final ICallback<ContactFolder> callback);

    /**
     * Patches this ContactFolder with a source
     *
     * @param sourceContactFolder the source object with updates
     * @return the updated ContactFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ContactFolder patch(final ContactFolder sourceContactFolder) throws ClientException;

    /**
     * Posts a ContactFolder with a new object
     *
     * @param newContactFolder the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ContactFolder newContactFolder, final ICallback<ContactFolder> callback);

    /**
     * Posts a ContactFolder with a new object
     *
     * @param newContactFolder the new object to create
     * @return the created ContactFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ContactFolder post(final ContactFolder newContactFolder) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseContactFolderRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseContactFolderRequest expand(final String value);

}

