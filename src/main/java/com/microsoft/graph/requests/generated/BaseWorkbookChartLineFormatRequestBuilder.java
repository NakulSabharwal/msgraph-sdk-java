// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatClearRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatClearRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Line Format Request Builder.
 */
public class BaseWorkbookChartLineFormatRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookChartLineFormatRequestBuilder {

    /**
     * The request builder for the WorkbookChartLineFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookChartLineFormatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookChartLineFormatRequest instance
     */
    public IWorkbookChartLineFormatRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartLineFormatRequest instance
     */
    public IWorkbookChartLineFormatRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookChartLineFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWorkbookChartLineFormatClearRequestBuilder clear() {
        return new WorkbookChartLineFormatClearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clear"), getClient(), null);
    }
}

