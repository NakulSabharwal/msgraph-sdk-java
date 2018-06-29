// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IConversationThreadRequest;
import com.microsoft.graph.requests.extensions.ConversationThreadRequest;
import com.microsoft.graph.models.extensions.ConversationThread;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Conversation Thread Request.
 */
public class BaseConversationThreadRequest extends BaseRequest implements IBaseConversationThreadRequest {

    /**
     * The request for the ConversationThread
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseConversationThreadRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<ConversationThread> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ConversationThread from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ConversationThread> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ConversationThread from the service
     *
     * @return the ConversationThread from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConversationThread get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this ConversationThread with a source
     *
     * @param sourceConversationThread the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ConversationThread sourceConversationThread, final ICallback<ConversationThread> callback) {
        send(HttpMethod.PATCH, callback, sourceConversationThread);
    }

    /**
     * Patches this ConversationThread with a source
     *
     * @param sourceConversationThread the source object with updates
     * @return the updated ConversationThread
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConversationThread patch(final ConversationThread sourceConversationThread) throws ClientException {
        return send(HttpMethod.PATCH, sourceConversationThread);
    }

    /**
     * Creates a ConversationThread with a new object
     *
     * @param newConversationThread the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ConversationThread newConversationThread, final ICallback<ConversationThread> callback) {
        send(HttpMethod.POST, callback, newConversationThread);
    }

    /**
     * Creates a ConversationThread with a new object
     *
     * @param newConversationThread the new object to create
     * @return the created ConversationThread
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConversationThread post(final ConversationThread newConversationThread) throws ClientException {
        return send(HttpMethod.POST, newConversationThread);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IConversationThreadRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ConversationThreadRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IConversationThreadRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ConversationThreadRequest)this;
     }

}

