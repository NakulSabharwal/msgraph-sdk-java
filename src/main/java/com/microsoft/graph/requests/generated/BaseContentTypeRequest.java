// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IContentTypeRequest;
import com.microsoft.graph.requests.extensions.ContentTypeRequest;
import com.microsoft.graph.models.extensions.ContentType;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Content Type Request.
 */
public class BaseContentTypeRequest extends BaseRequest implements IBaseContentTypeRequest {

    /**
     * The request for the ContentType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseContentTypeRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<ContentType> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ContentType from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ContentType> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ContentType from the service
     *
     * @return the ContentType from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ContentType get() throws ClientException {
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
     * Patches this ContentType with a source
     *
     * @param sourceContentType the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ContentType sourceContentType, final ICallback<ContentType> callback) {
        send(HttpMethod.PATCH, callback, sourceContentType);
    }

    /**
     * Patches this ContentType with a source
     *
     * @param sourceContentType the source object with updates
     * @return the updated ContentType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ContentType patch(final ContentType sourceContentType) throws ClientException {
        return send(HttpMethod.PATCH, sourceContentType);
    }

    /**
     * Creates a ContentType with a new object
     *
     * @param newContentType the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ContentType newContentType, final ICallback<ContentType> callback) {
        send(HttpMethod.POST, callback, newContentType);
    }

    /**
     * Creates a ContentType with a new object
     *
     * @param newContentType the new object to create
     * @return the created ContentType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ContentType post(final ContentType newContentType) throws ClientException {
        return send(HttpMethod.POST, newContentType);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IContentTypeRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ContentTypeRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IContentTypeRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ContentTypeRequest)this;
     }

}

