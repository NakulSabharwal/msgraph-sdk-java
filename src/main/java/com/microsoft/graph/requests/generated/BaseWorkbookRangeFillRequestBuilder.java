// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFillRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeFillRequest;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFillClearRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeFillClearRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Range Fill Request Builder.
 */
public class BaseWorkbookRangeFillRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookRangeFillRequestBuilder {

    /**
     * The request builder for the WorkbookRangeFill
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookRangeFillRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookRangeFillRequest instance
     */
    public IWorkbookRangeFillRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookRangeFillRequest instance
     */
    public IWorkbookRangeFillRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookRangeFillRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWorkbookRangeFillClearRequestBuilder clear() {
        return new WorkbookRangeFillClearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clear"), getClient(), null);
    }
}

