// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerRequest;
import com.microsoft.graph.models.extensions.DeviceManagementPartner;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Management Partner Request.
 */
public class BaseDeviceManagementPartnerRequest extends BaseRequest implements IBaseDeviceManagementPartnerRequest {

    /**
     * The request for the DeviceManagementPartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDeviceManagementPartnerRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<DeviceManagementPartner> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DeviceManagementPartner from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementPartner> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementPartner from the service
     *
     * @return the DeviceManagementPartner from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementPartner get() throws ClientException {
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
     * Patches this DeviceManagementPartner with a source
     *
     * @param sourceDeviceManagementPartner the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementPartner sourceDeviceManagementPartner, final ICallback<DeviceManagementPartner> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementPartner);
    }

    /**
     * Patches this DeviceManagementPartner with a source
     *
     * @param sourceDeviceManagementPartner the source object with updates
     * @return the updated DeviceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementPartner patch(final DeviceManagementPartner sourceDeviceManagementPartner) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementPartner);
    }

    /**
     * Creates a DeviceManagementPartner with a new object
     *
     * @param newDeviceManagementPartner the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementPartner newDeviceManagementPartner, final ICallback<DeviceManagementPartner> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementPartner);
    }

    /**
     * Creates a DeviceManagementPartner with a new object
     *
     * @param newDeviceManagementPartner the new object to create
     * @return the created DeviceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementPartner post(final DeviceManagementPartner newDeviceManagementPartner) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementPartner);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementPartnerRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceManagementPartnerRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementPartnerRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceManagementPartnerRequest)this;
     }

}

