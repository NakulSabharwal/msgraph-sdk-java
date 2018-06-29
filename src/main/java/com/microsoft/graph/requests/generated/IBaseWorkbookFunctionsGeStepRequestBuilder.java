// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsGeStepRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Ge Step Request Builder.
 */
public interface IBaseWorkbookFunctionsGeStepRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsGeStepRequest
     *
     * @return the IWorkbookFunctionsGeStepRequest instance
     */
    IWorkbookFunctionsGeStepRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsGeStepRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsGeStepRequest instance
     */
    IWorkbookFunctionsGeStepRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
