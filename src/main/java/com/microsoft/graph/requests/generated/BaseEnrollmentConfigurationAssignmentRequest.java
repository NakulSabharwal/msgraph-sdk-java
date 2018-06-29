// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IEnrollmentConfigurationAssignmentRequest;
import com.microsoft.graph.requests.extensions.EnrollmentConfigurationAssignmentRequest;
import com.microsoft.graph.models.extensions.EnrollmentConfigurationAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Enrollment Configuration Assignment Request.
 */
public class BaseEnrollmentConfigurationAssignmentRequest extends BaseRequest implements IBaseEnrollmentConfigurationAssignmentRequest {

    /**
     * The request for the EnrollmentConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseEnrollmentConfigurationAssignmentRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<EnrollmentConfigurationAssignment> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the EnrollmentConfigurationAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EnrollmentConfigurationAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EnrollmentConfigurationAssignment from the service
     *
     * @return the EnrollmentConfigurationAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EnrollmentConfigurationAssignment get() throws ClientException {
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
     * Patches this EnrollmentConfigurationAssignment with a source
     *
     * @param sourceEnrollmentConfigurationAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EnrollmentConfigurationAssignment sourceEnrollmentConfigurationAssignment, final ICallback<EnrollmentConfigurationAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceEnrollmentConfigurationAssignment);
    }

    /**
     * Patches this EnrollmentConfigurationAssignment with a source
     *
     * @param sourceEnrollmentConfigurationAssignment the source object with updates
     * @return the updated EnrollmentConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EnrollmentConfigurationAssignment patch(final EnrollmentConfigurationAssignment sourceEnrollmentConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceEnrollmentConfigurationAssignment);
    }

    /**
     * Creates a EnrollmentConfigurationAssignment with a new object
     *
     * @param newEnrollmentConfigurationAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EnrollmentConfigurationAssignment newEnrollmentConfigurationAssignment, final ICallback<EnrollmentConfigurationAssignment> callback) {
        send(HttpMethod.POST, callback, newEnrollmentConfigurationAssignment);
    }

    /**
     * Creates a EnrollmentConfigurationAssignment with a new object
     *
     * @param newEnrollmentConfigurationAssignment the new object to create
     * @return the created EnrollmentConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EnrollmentConfigurationAssignment post(final EnrollmentConfigurationAssignment newEnrollmentConfigurationAssignment) throws ClientException {
        return send(HttpMethod.POST, newEnrollmentConfigurationAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEnrollmentConfigurationAssignmentRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (EnrollmentConfigurationAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEnrollmentConfigurationAssignmentRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (EnrollmentConfigurationAssignmentRequest)this;
     }

}

