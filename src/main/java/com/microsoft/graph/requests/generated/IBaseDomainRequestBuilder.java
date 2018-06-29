// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDomainRequest;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainVerifyRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Domain Request Builder.
 */
public interface IBaseDomainRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDomainRequest instance
     */
    IDomainRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDomainRequest instance
     */
    IDomainRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDomainDnsRecordCollectionRequestBuilder serviceConfigurationRecords();

    IDomainDnsRecordRequestBuilder serviceConfigurationRecords(final String id);

    IDomainDnsRecordCollectionRequestBuilder verificationDnsRecords();

    IDomainDnsRecordRequestBuilder verificationDnsRecords(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder domainNameReferences();

    IDirectoryObjectWithReferenceRequestBuilder domainNameReferences(final String id);
    IDomainVerifyRequestBuilder verify();

}
