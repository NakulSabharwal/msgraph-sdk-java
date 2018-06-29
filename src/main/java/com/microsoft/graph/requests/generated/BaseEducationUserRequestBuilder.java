// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IEducationUserRequest;
import com.microsoft.graph.requests.extensions.EducationUserRequest;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserWithReferenceRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education User Request Builder.
 */
public class BaseEducationUserRequestBuilder extends BaseRequestBuilder implements IBaseEducationUserRequestBuilder {

    /**
     * The request builder for the EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEducationUserRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEducationUserRequest instance
     */
    public IEducationUserRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IEducationUserRequest instance
     */
    public IEducationUserRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new EducationUserRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationSchoolCollectionWithReferencesRequestBuilder schools() {
        return new EducationSchoolCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("schools"), getClient(), null);
    }

    public IEducationSchoolWithReferenceRequestBuilder schools(final String id) {
        return new EducationSchoolWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("schools") + "/" + id, getClient(), null);
    }
    public IEducationClassCollectionWithReferencesRequestBuilder classes() {
        return new EducationClassCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("classes"), getClient(), null);
    }

    public IEducationClassWithReferenceRequestBuilder classes(final String id) {
        return new EducationClassWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("classes") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    public IUserWithReferenceRequestBuilder user() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("user"), getClient(), null);
    }
}

