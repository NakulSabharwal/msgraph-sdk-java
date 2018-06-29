// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.WorkbookChartAxes;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Axes Request.
 */
public interface IBaseWorkbookChartAxesRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartAxes from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookChartAxes> callback);

    /**
     * Gets the WorkbookChartAxes from the service
     *
     * @return the WorkbookChartAxes from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartAxes get() throws ClientException;

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
     * Patches this WorkbookChartAxes with a source
     *
     * @param sourceWorkbookChartAxes the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookChartAxes sourceWorkbookChartAxes, final ICallback<WorkbookChartAxes> callback);

    /**
     * Patches this WorkbookChartAxes with a source
     *
     * @param sourceWorkbookChartAxes the source object with updates
     * @return the updated WorkbookChartAxes
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartAxes patch(final WorkbookChartAxes sourceWorkbookChartAxes) throws ClientException;

    /**
     * Posts a WorkbookChartAxes with a new object
     *
     * @param newWorkbookChartAxes the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookChartAxes newWorkbookChartAxes, final ICallback<WorkbookChartAxes> callback);

    /**
     * Posts a WorkbookChartAxes with a new object
     *
     * @param newWorkbookChartAxes the new object to create
     * @return the created WorkbookChartAxes
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartAxes post(final WorkbookChartAxes newWorkbookChartAxes) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWorkbookChartAxesRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWorkbookChartAxesRequest expand(final String value);

}

