// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IConversationThreadRequest;
import com.microsoft.graph.requests.extensions.ConversationThreadRequest;
import com.microsoft.graph.requests.extensions.IPostCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PostCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPostRequestBuilder;
import com.microsoft.graph.requests.extensions.PostRequestBuilder;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.requests.extensions.IConversationThreadReplyRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadReplyRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Conversation Thread Request Builder.
 */
public class BaseConversationThreadRequestBuilder extends BaseRequestBuilder implements IBaseConversationThreadRequestBuilder {

    /**
     * The request builder for the ConversationThread
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseConversationThreadRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IConversationThreadRequest instance
     */
    public IConversationThreadRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IConversationThreadRequest instance
     */
    public IConversationThreadRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ConversationThreadRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPostCollectionRequestBuilder posts() {
        return new PostCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("posts"), getClient(), null);
    }

    public IPostRequestBuilder posts(final String id) {
        return new PostRequestBuilder(getRequestUrlWithAdditionalSegment("posts") + "/" + id, getClient(), null);
    }

    public IConversationThreadReplyRequestBuilder reply(final Post post) {
        return new ConversationThreadReplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reply"), getClient(), null, post);
    }
}

