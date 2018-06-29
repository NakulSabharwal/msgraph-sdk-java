// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base User Activity Collection Request.
 */
public class BaseUserActivityCollectionRequest extends BaseCollectionRequest<BaseUserActivityCollectionResponse, IUserActivityCollectionPage> implements IBaseUserActivityCollectionRequest {

    /**
     * The request builder for this collection of UserActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseUserActivityCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseUserActivityCollectionResponse.class, IUserActivityCollectionPage.class);
    }

    public void get(final ICallback<IUserActivityCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IUserActivityCollectionPage get() throws ClientException {
        final BaseUserActivityCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UserActivity newUserActivity, final ICallback<UserActivity> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UserActivityRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newUserActivity, callback);
    }

    public UserActivity post(final UserActivity newUserActivity) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserActivityRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newUserActivity);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserActivityCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (UserActivityCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserActivityCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (UserActivityCollectionRequest)this;
    }

    public IUserActivityCollectionPage buildFromResponse(final BaseUserActivityCollectionResponse response) {
        final IUserActivityCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserActivityCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UserActivityCollectionPage page = new UserActivityCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
