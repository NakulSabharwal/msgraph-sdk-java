// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRadiansRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Radians Request Builder.
 */
public interface IBaseWorkbookFunctionsRadiansRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsRadiansRequest
     *
     * @return the IWorkbookFunctionsRadiansRequest instance
     */
    IWorkbookFunctionsRadiansRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsRadiansRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRadiansRequest instance
     */
    IWorkbookFunctionsRadiansRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
