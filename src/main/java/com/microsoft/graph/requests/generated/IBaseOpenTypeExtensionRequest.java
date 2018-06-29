// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.OpenTypeExtension;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Open Type Extension Request.
 */
public interface IBaseOpenTypeExtensionRequest extends IHttpRequest {

    /**
     * Gets the OpenTypeExtension from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<OpenTypeExtension> callback);

    /**
     * Gets the OpenTypeExtension from the service
     *
     * @return the OpenTypeExtension from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OpenTypeExtension get() throws ClientException;

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
     * Patches this OpenTypeExtension with a source
     *
     * @param sourceOpenTypeExtension the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OpenTypeExtension sourceOpenTypeExtension, final ICallback<OpenTypeExtension> callback);

    /**
     * Patches this OpenTypeExtension with a source
     *
     * @param sourceOpenTypeExtension the source object with updates
     * @return the updated OpenTypeExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OpenTypeExtension patch(final OpenTypeExtension sourceOpenTypeExtension) throws ClientException;

    /**
     * Posts a OpenTypeExtension with a new object
     *
     * @param newOpenTypeExtension the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OpenTypeExtension newOpenTypeExtension, final ICallback<OpenTypeExtension> callback);

    /**
     * Posts a OpenTypeExtension with a new object
     *
     * @param newOpenTypeExtension the new object to create
     * @return the created OpenTypeExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OpenTypeExtension post(final OpenTypeExtension newOpenTypeExtension) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseOpenTypeExtensionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseOpenTypeExtensionRequest expand(final String value);

}

