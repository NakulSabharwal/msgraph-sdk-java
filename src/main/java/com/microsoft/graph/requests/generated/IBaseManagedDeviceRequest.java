// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.ManagedDevice;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Managed Device Request.
 */
public interface IBaseManagedDeviceRequest extends IHttpRequest {

    /**
     * Gets the ManagedDevice from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ManagedDevice> callback);

    /**
     * Gets the ManagedDevice from the service
     *
     * @return the ManagedDevice from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDevice get() throws ClientException;

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
     * Patches this ManagedDevice with a source
     *
     * @param sourceManagedDevice the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedDevice sourceManagedDevice, final ICallback<ManagedDevice> callback);

    /**
     * Patches this ManagedDevice with a source
     *
     * @param sourceManagedDevice the source object with updates
     * @return the updated ManagedDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDevice patch(final ManagedDevice sourceManagedDevice) throws ClientException;

    /**
     * Posts a ManagedDevice with a new object
     *
     * @param newManagedDevice the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedDevice newManagedDevice, final ICallback<ManagedDevice> callback);

    /**
     * Posts a ManagedDevice with a new object
     *
     * @param newManagedDevice the new object to create
     * @return the created ManagedDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDevice post(final ManagedDevice newManagedDevice) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseManagedDeviceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseManagedDeviceRequest expand(final String value);

}

