// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookTableSortRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableSortRequest;
import com.microsoft.graph.models.extensions.WorkbookTableSort;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table Sort Request.
 */
public class BaseWorkbookTableSortRequest extends BaseRequest implements IBaseWorkbookTableSortRequest {

    /**
     * The request for the WorkbookTableSort
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWorkbookTableSortRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WorkbookTableSort> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookTableSort from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookTableSort> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTableSort from the service
     *
     * @return the WorkbookTableSort from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTableSort get() throws ClientException {
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
     * Patches this WorkbookTableSort with a source
     *
     * @param sourceWorkbookTableSort the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookTableSort sourceWorkbookTableSort, final ICallback<WorkbookTableSort> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookTableSort);
    }

    /**
     * Patches this WorkbookTableSort with a source
     *
     * @param sourceWorkbookTableSort the source object with updates
     * @return the updated WorkbookTableSort
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTableSort patch(final WorkbookTableSort sourceWorkbookTableSort) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookTableSort);
    }

    /**
     * Creates a WorkbookTableSort with a new object
     *
     * @param newWorkbookTableSort the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookTableSort newWorkbookTableSort, final ICallback<WorkbookTableSort> callback) {
        send(HttpMethod.POST, callback, newWorkbookTableSort);
    }

    /**
     * Creates a WorkbookTableSort with a new object
     *
     * @param newWorkbookTableSort the new object to create
     * @return the created WorkbookTableSort
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTableSort post(final WorkbookTableSort newWorkbookTableSort) throws ClientException {
        return send(HttpMethod.POST, newWorkbookTableSort);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookTableSortRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookTableSortRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookTableSortRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookTableSortRequest)this;
     }

}

