// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnRequest;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table Column Request.
 */
public class BaseWorkbookTableColumnRequest extends BaseRequest implements IBaseWorkbookTableColumnRequest {

    /**
     * The request for the WorkbookTableColumn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWorkbookTableColumnRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WorkbookTableColumn> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookTableColumn from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookTableColumn> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTableColumn from the service
     *
     * @return the WorkbookTableColumn from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTableColumn get() throws ClientException {
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
     * Patches this WorkbookTableColumn with a source
     *
     * @param sourceWorkbookTableColumn the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookTableColumn sourceWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookTableColumn);
    }

    /**
     * Patches this WorkbookTableColumn with a source
     *
     * @param sourceWorkbookTableColumn the source object with updates
     * @return the updated WorkbookTableColumn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTableColumn patch(final WorkbookTableColumn sourceWorkbookTableColumn) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookTableColumn);
    }

    /**
     * Creates a WorkbookTableColumn with a new object
     *
     * @param newWorkbookTableColumn the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookTableColumn newWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback) {
        send(HttpMethod.POST, callback, newWorkbookTableColumn);
    }

    /**
     * Creates a WorkbookTableColumn with a new object
     *
     * @param newWorkbookTableColumn the new object to create
     * @return the created WorkbookTableColumn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookTableColumn post(final WorkbookTableColumn newWorkbookTableColumn) throws ClientException {
        return send(HttpMethod.POST, newWorkbookTableColumn);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookTableColumnRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookTableColumnRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookTableColumnRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookTableColumnRequest)this;
     }

}

