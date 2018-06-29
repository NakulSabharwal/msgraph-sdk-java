// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.EducationClass;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Education Class Request.
 */
public interface IBaseEducationClassRequest extends IHttpRequest {

    /**
     * Gets the EducationClass from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<EducationClass> callback);

    /**
     * Gets the EducationClass from the service
     *
     * @return the EducationClass from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationClass get() throws ClientException;

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
     * Patches this EducationClass with a source
     *
     * @param sourceEducationClass the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EducationClass sourceEducationClass, final ICallback<EducationClass> callback);

    /**
     * Patches this EducationClass with a source
     *
     * @param sourceEducationClass the source object with updates
     * @return the updated EducationClass
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationClass patch(final EducationClass sourceEducationClass) throws ClientException;

    /**
     * Posts a EducationClass with a new object
     *
     * @param newEducationClass the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EducationClass newEducationClass, final ICallback<EducationClass> callback);

    /**
     * Posts a EducationClass with a new object
     *
     * @param newEducationClass the new object to create
     * @return the created EducationClass
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationClass post(final EducationClass newEducationClass) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseEducationClassRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseEducationClassRequest expand(final String value);

}

