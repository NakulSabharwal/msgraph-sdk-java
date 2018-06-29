// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.EducationOrganization;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Education Organization Request.
 */
public interface IBaseEducationOrganizationRequest extends IHttpRequest {

    /**
     * Gets the EducationOrganization from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<EducationOrganization> callback);

    /**
     * Gets the EducationOrganization from the service
     *
     * @return the EducationOrganization from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationOrganization get() throws ClientException;

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
     * Patches this EducationOrganization with a source
     *
     * @param sourceEducationOrganization the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EducationOrganization sourceEducationOrganization, final ICallback<EducationOrganization> callback);

    /**
     * Patches this EducationOrganization with a source
     *
     * @param sourceEducationOrganization the source object with updates
     * @return the updated EducationOrganization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationOrganization patch(final EducationOrganization sourceEducationOrganization) throws ClientException;

    /**
     * Posts a EducationOrganization with a new object
     *
     * @param newEducationOrganization the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EducationOrganization newEducationOrganization, final ICallback<EducationOrganization> callback);

    /**
     * Posts a EducationOrganization with a new object
     *
     * @param newEducationOrganization the new object to create
     * @return the created EducationOrganization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationOrganization post(final EducationOrganization newEducationOrganization) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseEducationOrganizationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseEducationOrganizationRequest expand(final String value);

}

