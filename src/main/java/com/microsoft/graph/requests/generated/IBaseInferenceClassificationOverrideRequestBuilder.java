// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IInferenceClassificationOverrideRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Inference Classification Override Request Builder.
 */
public interface IBaseInferenceClassificationOverrideRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IInferenceClassificationOverrideRequest instance
     */
    IInferenceClassificationOverrideRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IInferenceClassificationOverrideRequest instance
     */
    IInferenceClassificationOverrideRequest buildRequest(final java.util.List<? extends Option> requestOptions);

}
