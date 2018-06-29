// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSkew_pRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Skew_p Request Builder.
 */
public interface IBaseWorkbookFunctionsSkew_pRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsSkew_pRequest
     *
     * @return the IWorkbookFunctionsSkew_pRequest instance
     */
    IWorkbookFunctionsSkew_pRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsSkew_pRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSkew_pRequest instance
     */
    IWorkbookFunctionsSkew_pRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
