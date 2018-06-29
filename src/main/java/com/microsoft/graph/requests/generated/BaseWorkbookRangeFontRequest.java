// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFontRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeFontRequest;
import com.microsoft.graph.models.extensions.WorkbookRangeFont;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Range Font Request.
 */
public class BaseWorkbookRangeFontRequest extends BaseRequest implements IBaseWorkbookRangeFontRequest {

    /**
     * The request for the WorkbookRangeFont
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWorkbookRangeFontRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WorkbookRangeFont> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookRangeFont from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookRangeFont> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeFont from the service
     *
     * @return the WorkbookRangeFont from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeFont get() throws ClientException {
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
     * Patches this WorkbookRangeFont with a source
     *
     * @param sourceWorkbookRangeFont the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookRangeFont sourceWorkbookRangeFont, final ICallback<WorkbookRangeFont> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookRangeFont);
    }

    /**
     * Patches this WorkbookRangeFont with a source
     *
     * @param sourceWorkbookRangeFont the source object with updates
     * @return the updated WorkbookRangeFont
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeFont patch(final WorkbookRangeFont sourceWorkbookRangeFont) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRangeFont);
    }

    /**
     * Creates a WorkbookRangeFont with a new object
     *
     * @param newWorkbookRangeFont the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookRangeFont newWorkbookRangeFont, final ICallback<WorkbookRangeFont> callback) {
        send(HttpMethod.POST, callback, newWorkbookRangeFont);
    }

    /**
     * Creates a WorkbookRangeFont with a new object
     *
     * @param newWorkbookRangeFont the new object to create
     * @return the created WorkbookRangeFont
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeFont post(final WorkbookRangeFont newWorkbookRangeFont) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRangeFont);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookRangeFontRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookRangeFontRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookRangeFontRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookRangeFontRequest)this;
     }

}

