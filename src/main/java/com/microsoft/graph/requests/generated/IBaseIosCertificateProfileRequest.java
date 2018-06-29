// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.IosCertificateProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Ios Certificate Profile Request.
 */
public interface IBaseIosCertificateProfileRequest extends IHttpRequest {

    /**
     * Gets the IosCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosCertificateProfile> callback);

    /**
     * Gets the IosCertificateProfile from the service
     *
     * @return the IosCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosCertificateProfile get() throws ClientException;

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
     * Patches this IosCertificateProfile with a source
     *
     * @param sourceIosCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosCertificateProfile sourceIosCertificateProfile, final ICallback<IosCertificateProfile> callback);

    /**
     * Patches this IosCertificateProfile with a source
     *
     * @param sourceIosCertificateProfile the source object with updates
     * @return the updated IosCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosCertificateProfile patch(final IosCertificateProfile sourceIosCertificateProfile) throws ClientException;

    /**
     * Posts a IosCertificateProfile with a new object
     *
     * @param newIosCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosCertificateProfile newIosCertificateProfile, final ICallback<IosCertificateProfile> callback);

    /**
     * Posts a IosCertificateProfile with a new object
     *
     * @param newIosCertificateProfile the new object to create
     * @return the created IosCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosCertificateProfile post(final IosCertificateProfile newIosCertificateProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseIosCertificateProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseIosCertificateProfileRequest expand(final String value);

}

