// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAscRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsAscRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Asc Request Builder.
 */
public class BaseWorkbookFunctionsAscRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAsc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     */
    public BaseWorkbookFunctionsAscRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
    }

    /**
     * Creates the IWorkbookFunctionsAscRequest
     *
     * @return the IWorkbookFunctionsAscRequest instance
     */
    public IWorkbookFunctionsAscRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAscRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAscRequest instance
     */
    public IWorkbookFunctionsAscRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsAscRequest request = new WorkbookFunctionsAscRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        return request;
    }
}
