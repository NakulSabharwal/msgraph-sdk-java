// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education School With Reference Request.
 */
public class BaseEducationSchoolWithReferenceRequest extends BaseRequest implements IBaseEducationSchoolWithReferenceRequest {

    /**
     * The request for the EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEducationSchoolWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSchool.class);
    }

    public void post(final EducationSchool newEducationSchool, final IJsonBackedObject payload, final ICallback<EducationSchool> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public EducationSchool post(final EducationSchool newEducationSchool, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newEducationSchool;
        }
        return null;
    }

    public void get(final ICallback<EducationSchool> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public EducationSchool get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<EducationSchool> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final EducationSchool sourceEducationSchool, final ICallback<EducationSchool> callback) {
		send(HttpMethod.PATCH, callback, sourceEducationSchool);
	}

	public EducationSchool patch(final EducationSchool sourceEducationSchool) throws ClientException {
		return send(HttpMethod.PATCH, sourceEducationSchool);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationSchoolWithReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (IEducationSchoolWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationSchoolWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (EducationSchoolWithReferenceRequest)this;
    }
}
