// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnRequest;
import com.microsoft.graph.requests.extensions.IWorkbookFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnDataBodyRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnHeaderRowRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnTotalRowRangeRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Table Column Request Builder.
 */
public interface IBaseWorkbookTableColumnRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookTableColumnRequest instance
     */
    IWorkbookTableColumnRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookTableColumnRequest instance
     */
    IWorkbookTableColumnRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    /**
     * Gets the request builder for WorkbookFilter
     *
     * @return the IWorkbookFilterRequestBuilder instance
     */
    IWorkbookFilterRequestBuilder filter();
    IWorkbookTableColumnDataBodyRangeRequestBuilder dataBodyRange();
    IWorkbookTableColumnHeaderRowRangeRequestBuilder headerRowRange();
    IWorkbookTableColumnRangeRequestBuilder range();
    IWorkbookTableColumnTotalRowRangeRequestBuilder totalRowRange();

}
