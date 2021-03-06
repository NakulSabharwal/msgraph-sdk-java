// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPermutRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPermutRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Permut Request Builder.
 */
public class BaseWorkbookFunctionsPermutRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPermut
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param numberChosen the numberChosen
     */
    public BaseWorkbookFunctionsPermutRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement numberChosen) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("numberChosen", numberChosen);
    }

    /**
     * Creates the IWorkbookFunctionsPermutRequest
     *
     * @return the IWorkbookFunctionsPermutRequest instance
     */
    public IWorkbookFunctionsPermutRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPermutRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPermutRequest instance
     */
    public IWorkbookFunctionsPermutRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPermutRequest request = new WorkbookFunctionsPermutRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("numberChosen")) {
            request.body.numberChosen = getParameter("numberChosen");
        }

        return request;
    }
}
