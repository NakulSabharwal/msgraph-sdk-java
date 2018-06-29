// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeRequest;
import com.microsoft.graph.models.extensions.WorkbookRange;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Range Request.
 */
public class BaseWorkbookRangeRequest extends BaseRequest implements IBaseWorkbookRangeRequest {

    /**
     * The request for the WorkbookRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWorkbookRangeRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WorkbookRange> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookRange from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookRange> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRange from the service
     *
     * @return the WorkbookRange from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRange get() throws ClientException {
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
     * Patches this WorkbookRange with a source
     *
     * @param sourceWorkbookRange the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookRange sourceWorkbookRange, final ICallback<WorkbookRange> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookRange);
    }

    /**
     * Patches this WorkbookRange with a source
     *
     * @param sourceWorkbookRange the source object with updates
     * @return the updated WorkbookRange
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRange patch(final WorkbookRange sourceWorkbookRange) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRange);
    }

    /**
     * Creates a WorkbookRange with a new object
     *
     * @param newWorkbookRange the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookRange newWorkbookRange, final ICallback<WorkbookRange> callback) {
        send(HttpMethod.POST, callback, newWorkbookRange);
    }

    /**
     * Creates a WorkbookRange with a new object
     *
     * @param newWorkbookRange the new object to create
     * @return the created WorkbookRange
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRange post(final WorkbookRange newWorkbookRange) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRange);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookRangeRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookRangeRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookRangeRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookRangeRequest)this;
     }

}

