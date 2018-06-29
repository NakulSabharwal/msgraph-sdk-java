// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IMailFolderRequest;
import com.microsoft.graph.requests.extensions.MailFolderRequest;
import com.microsoft.graph.models.extensions.MailFolder;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mail Folder Request.
 */
public class BaseMailFolderRequest extends BaseRequest implements IBaseMailFolderRequest {

    /**
     * The request for the MailFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseMailFolderRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<MailFolder> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the MailFolder from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MailFolder> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MailFolder from the service
     *
     * @return the MailFolder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MailFolder get() throws ClientException {
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
     * Patches this MailFolder with a source
     *
     * @param sourceMailFolder the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MailFolder sourceMailFolder, final ICallback<MailFolder> callback) {
        send(HttpMethod.PATCH, callback, sourceMailFolder);
    }

    /**
     * Patches this MailFolder with a source
     *
     * @param sourceMailFolder the source object with updates
     * @return the updated MailFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MailFolder patch(final MailFolder sourceMailFolder) throws ClientException {
        return send(HttpMethod.PATCH, sourceMailFolder);
    }

    /**
     * Creates a MailFolder with a new object
     *
     * @param newMailFolder the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MailFolder newMailFolder, final ICallback<MailFolder> callback) {
        send(HttpMethod.POST, callback, newMailFolder);
    }

    /**
     * Creates a MailFolder with a new object
     *
     * @param newMailFolder the new object to create
     * @return the created MailFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MailFolder post(final MailFolder newMailFolder) throws ClientException {
        return send(HttpMethod.POST, newMailFolder);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMailFolderRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (MailFolderRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMailFolderRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (MailFolderRequest)this;
     }

}

