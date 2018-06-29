// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBaseRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Base Request Builder.
 */
public interface IBaseWorkbookFunctionsBaseRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsBaseRequest
     *
     * @return the IWorkbookFunctionsBaseRequest instance
     */
    IWorkbookFunctionsBaseRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsBaseRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBaseRequest instance
     */
    IWorkbookFunctionsBaseRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
