// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsProductRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Product Request Builder.
 */
public interface IBaseWorkbookFunctionsProductRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsProductRequest
     *
     * @return the IWorkbookFunctionsProductRequest instance
     */
    IWorkbookFunctionsProductRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsProductRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsProductRequest instance
     */
    IWorkbookFunctionsProductRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
