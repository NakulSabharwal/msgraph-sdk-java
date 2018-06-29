// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.Conversation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Conversation Request.
 */
public interface IBaseConversationRequest extends IHttpRequest {

    /**
     * Gets the Conversation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Conversation> callback);

    /**
     * Gets the Conversation from the service
     *
     * @return the Conversation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Conversation get() throws ClientException;

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
     * Patches this Conversation with a source
     *
     * @param sourceConversation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Conversation sourceConversation, final ICallback<Conversation> callback);

    /**
     * Patches this Conversation with a source
     *
     * @param sourceConversation the source object with updates
     * @return the updated Conversation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Conversation patch(final Conversation sourceConversation) throws ClientException;

    /**
     * Posts a Conversation with a new object
     *
     * @param newConversation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Conversation newConversation, final ICallback<Conversation> callback);

    /**
     * Posts a Conversation with a new object
     *
     * @param newConversation the new object to create
     * @return the created Conversation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Conversation post(final Conversation newConversation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseConversationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseConversationRequest expand(final String value);

}

