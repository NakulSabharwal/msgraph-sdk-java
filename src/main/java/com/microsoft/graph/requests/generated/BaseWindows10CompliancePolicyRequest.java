// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWindows10CompliancePolicyRequest;
import com.microsoft.graph.requests.extensions.Windows10CompliancePolicyRequest;
import com.microsoft.graph.models.extensions.Windows10CompliancePolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows10Compliance Policy Request.
 */
public class BaseWindows10CompliancePolicyRequest extends BaseRequest implements IBaseWindows10CompliancePolicyRequest {

    /**
     * The request for the Windows10CompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWindows10CompliancePolicyRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<Windows10CompliancePolicy> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Windows10CompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows10CompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10CompliancePolicy from the service
     *
     * @return the Windows10CompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10CompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this Windows10CompliancePolicy with a source
     *
     * @param sourceWindows10CompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10CompliancePolicy sourceWindows10CompliancePolicy, final ICallback<Windows10CompliancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10CompliancePolicy);
    }

    /**
     * Patches this Windows10CompliancePolicy with a source
     *
     * @param sourceWindows10CompliancePolicy the source object with updates
     * @return the updated Windows10CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10CompliancePolicy patch(final Windows10CompliancePolicy sourceWindows10CompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10CompliancePolicy);
    }

    /**
     * Creates a Windows10CompliancePolicy with a new object
     *
     * @param newWindows10CompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10CompliancePolicy newWindows10CompliancePolicy, final ICallback<Windows10CompliancePolicy> callback) {
        send(HttpMethod.POST, callback, newWindows10CompliancePolicy);
    }

    /**
     * Creates a Windows10CompliancePolicy with a new object
     *
     * @param newWindows10CompliancePolicy the new object to create
     * @return the created Windows10CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10CompliancePolicy post(final Windows10CompliancePolicy newWindows10CompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newWindows10CompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10CompliancePolicyRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (Windows10CompliancePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10CompliancePolicyRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (Windows10CompliancePolicyRequest)this;
     }

}

