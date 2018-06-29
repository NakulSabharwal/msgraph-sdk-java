// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointFormatRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Point Format Request Builder.
 */
public interface IBaseWorkbookChartPointFormatRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookChartPointFormatRequest instance
     */
    IWorkbookChartPointFormatRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartPointFormatRequest instance
     */
    IWorkbookChartPointFormatRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    /**
     * Gets the request builder for WorkbookChartFill
     *
     * @return the IWorkbookChartFillRequestBuilder instance
     */
    IWorkbookChartFillRequestBuilder fill();

}
