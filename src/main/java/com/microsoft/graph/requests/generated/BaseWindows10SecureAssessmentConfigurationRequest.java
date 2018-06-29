// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWindows10SecureAssessmentConfigurationRequest;
import com.microsoft.graph.requests.extensions.Windows10SecureAssessmentConfigurationRequest;
import com.microsoft.graph.models.extensions.Windows10SecureAssessmentConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows10Secure Assessment Configuration Request.
 */
public class BaseWindows10SecureAssessmentConfigurationRequest extends BaseRequest implements IBaseWindows10SecureAssessmentConfigurationRequest {

    /**
     * The request for the Windows10SecureAssessmentConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWindows10SecureAssessmentConfigurationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<Windows10SecureAssessmentConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Windows10SecureAssessmentConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows10SecureAssessmentConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10SecureAssessmentConfiguration from the service
     *
     * @return the Windows10SecureAssessmentConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10SecureAssessmentConfiguration get() throws ClientException {
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
     * Patches this Windows10SecureAssessmentConfiguration with a source
     *
     * @param sourceWindows10SecureAssessmentConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10SecureAssessmentConfiguration sourceWindows10SecureAssessmentConfiguration, final ICallback<Windows10SecureAssessmentConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10SecureAssessmentConfiguration);
    }

    /**
     * Patches this Windows10SecureAssessmentConfiguration with a source
     *
     * @param sourceWindows10SecureAssessmentConfiguration the source object with updates
     * @return the updated Windows10SecureAssessmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10SecureAssessmentConfiguration patch(final Windows10SecureAssessmentConfiguration sourceWindows10SecureAssessmentConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10SecureAssessmentConfiguration);
    }

    /**
     * Creates a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration, final ICallback<Windows10SecureAssessmentConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindows10SecureAssessmentConfiguration);
    }

    /**
     * Creates a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the new object to create
     * @return the created Windows10SecureAssessmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10SecureAssessmentConfiguration post(final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10SecureAssessmentConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10SecureAssessmentConfigurationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (Windows10SecureAssessmentConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10SecureAssessmentConfigurationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (Windows10SecureAssessmentConfigurationRequest)this;
     }

}

