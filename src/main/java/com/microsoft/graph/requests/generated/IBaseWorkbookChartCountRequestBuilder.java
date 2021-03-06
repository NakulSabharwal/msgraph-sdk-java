// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookChartCountRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Count Request Builder.
 */
public interface IBaseWorkbookChartCountRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookChartCountRequest
     *
     * @return the IWorkbookChartCountRequest instance
     */
    IWorkbookChartCountRequest buildRequest();

    /**
     * Creates the IWorkbookChartCountRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartCountRequest instance
     */
    IWorkbookChartCountRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
