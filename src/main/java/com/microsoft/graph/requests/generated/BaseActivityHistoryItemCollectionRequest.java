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
 * The class for the Base Activity History Item Collection Request.
 */
public class BaseActivityHistoryItemCollectionRequest extends BaseCollectionRequest<BaseActivityHistoryItemCollectionResponse, IActivityHistoryItemCollectionPage> implements IBaseActivityHistoryItemCollectionRequest {

    /**
     * The request builder for this collection of ActivityHistoryItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseActivityHistoryItemCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseActivityHistoryItemCollectionResponse.class, IActivityHistoryItemCollectionPage.class);
    }

    public void get(final ICallback<IActivityHistoryItemCollectionPage> callback) {
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

    public IActivityHistoryItemCollectionPage get() throws ClientException {
        final BaseActivityHistoryItemCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ActivityHistoryItem newActivityHistoryItem, final ICallback<ActivityHistoryItem> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ActivityHistoryItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newActivityHistoryItem, callback);
    }

    public ActivityHistoryItem post(final ActivityHistoryItem newActivityHistoryItem) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ActivityHistoryItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newActivityHistoryItem);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IActivityHistoryItemCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ActivityHistoryItemCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IActivityHistoryItemCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ActivityHistoryItemCollectionRequest)this;
    }

    public IActivityHistoryItemCollectionPage buildFromResponse(final BaseActivityHistoryItemCollectionResponse response) {
        final IActivityHistoryItemCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ActivityHistoryItemCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ActivityHistoryItemCollectionPage page = new ActivityHistoryItemCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
