// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemAddRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Named Item Add Request Builder.
 */
public interface IBaseWorkbookNamedItemAddRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookNamedItemAddRequest
     *
     * @return the IWorkbookNamedItemAddRequest instance
     */
    IWorkbookNamedItemAddRequest buildRequest();

    /**
     * Creates the IWorkbookNamedItemAddRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookNamedItemAddRequest instance
     */
    IWorkbookNamedItemAddRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
