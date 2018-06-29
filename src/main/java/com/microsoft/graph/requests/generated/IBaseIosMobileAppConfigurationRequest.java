// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.IosMobileAppConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Ios Mobile App Configuration Request.
 */
public interface IBaseIosMobileAppConfigurationRequest extends IHttpRequest {

    /**
     * Gets the IosMobileAppConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosMobileAppConfiguration> callback);

    /**
     * Gets the IosMobileAppConfiguration from the service
     *
     * @return the IosMobileAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosMobileAppConfiguration get() throws ClientException;

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
     * Patches this IosMobileAppConfiguration with a source
     *
     * @param sourceIosMobileAppConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosMobileAppConfiguration sourceIosMobileAppConfiguration, final ICallback<IosMobileAppConfiguration> callback);

    /**
     * Patches this IosMobileAppConfiguration with a source
     *
     * @param sourceIosMobileAppConfiguration the source object with updates
     * @return the updated IosMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosMobileAppConfiguration patch(final IosMobileAppConfiguration sourceIosMobileAppConfiguration) throws ClientException;

    /**
     * Posts a IosMobileAppConfiguration with a new object
     *
     * @param newIosMobileAppConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosMobileAppConfiguration newIosMobileAppConfiguration, final ICallback<IosMobileAppConfiguration> callback);

    /**
     * Posts a IosMobileAppConfiguration with a new object
     *
     * @param newIosMobileAppConfiguration the new object to create
     * @return the created IosMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosMobileAppConfiguration post(final IosMobileAppConfiguration newIosMobileAppConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseIosMobileAppConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseIosMobileAppConfigurationRequest expand(final String value);

}

