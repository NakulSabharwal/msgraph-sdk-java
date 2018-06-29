// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetProtectionRequest;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtectionOptions;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetProtectionProtectRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetProtectionUnprotectRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Worksheet Protection Request Builder.
 */
public interface IBaseWorkbookWorksheetProtectionRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookWorksheetProtectionRequest instance
     */
    IWorkbookWorksheetProtectionRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookWorksheetProtectionRequest instance
     */
    IWorkbookWorksheetProtectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);
    IWorkbookWorksheetProtectionProtectRequestBuilder protect(final WorkbookWorksheetProtectionOptions options);
    IWorkbookWorksheetProtectionUnprotectRequestBuilder unprotect();

}
