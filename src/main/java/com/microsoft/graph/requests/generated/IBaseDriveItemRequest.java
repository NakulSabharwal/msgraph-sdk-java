// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DriveItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Drive Item Request.
 */
public interface IBaseDriveItemRequest extends IHttpRequest {

    /**
     * Gets the DriveItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DriveItem> callback);

    /**
     * Gets the DriveItem from the service
     *
     * @return the DriveItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DriveItem get() throws ClientException;

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
     * Patches this DriveItem with a source
     *
     * @param sourceDriveItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DriveItem sourceDriveItem, final ICallback<DriveItem> callback);

    /**
     * Patches this DriveItem with a source
     *
     * @param sourceDriveItem the source object with updates
     * @return the updated DriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DriveItem patch(final DriveItem sourceDriveItem) throws ClientException;

    /**
     * Posts a DriveItem with a new object
     *
     * @param newDriveItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DriveItem newDriveItem, final ICallback<DriveItem> callback);

    /**
     * Posts a DriveItem with a new object
     *
     * @param newDriveItem the new object to create
     * @return the created DriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DriveItem post(final DriveItem newDriveItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDriveItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDriveItemRequest expand(final String value);

}

