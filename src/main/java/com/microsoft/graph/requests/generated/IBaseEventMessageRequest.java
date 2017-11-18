// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Event Message Request.
 */
public interface IBaseEventMessageRequest extends IHttpRequest {

    /**
     * Gets the EventMessage from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<EventMessage> callback);

    /**
     * Gets the EventMessage from the service
     * @return The EventMessage from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    EventMessage get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EventMessage with a source
     * @param sourceEventMessage The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final EventMessage sourceEventMessage, final ICallback<EventMessage> callback);

    /**
     * Patches this EventMessage with a source
     * @param sourceEventMessage The source object with updates
     * @return The updated EventMessage
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    EventMessage patch(final EventMessage sourceEventMessage) throws ClientException;

    /**
     * Posts a EventMessage with a new object
     * @param newEventMessage The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final EventMessage newEventMessage, final ICallback<EventMessage> callback);

    /**
     * Posts a EventMessage with a new object
     * @param newEventMessage The new object to create
     * @return The created EventMessage
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    EventMessage post(final EventMessage newEventMessage) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseEventMessageRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseEventMessageRequest expand(final String value);

}
