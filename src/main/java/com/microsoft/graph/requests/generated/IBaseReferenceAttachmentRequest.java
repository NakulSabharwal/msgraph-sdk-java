// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.ReferenceAttachment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Reference Attachment Request.
 */
public interface IBaseReferenceAttachmentRequest extends IHttpRequest {

    /**
     * Gets the ReferenceAttachment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ReferenceAttachment> callback);

    /**
     * Gets the ReferenceAttachment from the service
     *
     * @return the ReferenceAttachment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ReferenceAttachment get() throws ClientException;

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
     * Patches this ReferenceAttachment with a source
     *
     * @param sourceReferenceAttachment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ReferenceAttachment sourceReferenceAttachment, final ICallback<ReferenceAttachment> callback);

    /**
     * Patches this ReferenceAttachment with a source
     *
     * @param sourceReferenceAttachment the source object with updates
     * @return the updated ReferenceAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ReferenceAttachment patch(final ReferenceAttachment sourceReferenceAttachment) throws ClientException;

    /**
     * Posts a ReferenceAttachment with a new object
     *
     * @param newReferenceAttachment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ReferenceAttachment newReferenceAttachment, final ICallback<ReferenceAttachment> callback);

    /**
     * Posts a ReferenceAttachment with a new object
     *
     * @param newReferenceAttachment the new object to create
     * @return the created ReferenceAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ReferenceAttachment post(final ReferenceAttachment newReferenceAttachment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseReferenceAttachmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseReferenceAttachmentRequest expand(final String value);

}

