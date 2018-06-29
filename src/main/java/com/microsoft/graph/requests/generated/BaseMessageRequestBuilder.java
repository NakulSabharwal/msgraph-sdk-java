// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IMessageRequest;
import com.microsoft.graph.requests.extensions.MessageRequest;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageCopyRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCopyRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageMoveRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageMoveRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageCreateReplyRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCreateReplyRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageCreateReplyAllRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCreateReplyAllRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageCreateForwardRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCreateForwardRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageReplyRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageReplyRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageReplyAllRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageReplyAllRequestBuilder;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.requests.extensions.IMessageForwardRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageForwardRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageSendRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageSendRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Message Request Builder.
 */
public class BaseMessageRequestBuilder extends BaseRequestBuilder implements IBaseMessageRequestBuilder {

    /**
     * The request builder for the Message
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMessageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IMessageRequest instance
     */
    public IMessageRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IMessageRequest instance
     */
    public IMessageRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new MessageRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAttachmentCollectionRequestBuilder attachments() {
        return new AttachmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("attachments"), getClient(), null);
    }

    public IAttachmentRequestBuilder attachments(final String id) {
        return new AttachmentRequestBuilder(getRequestUrlWithAdditionalSegment("attachments") + "/" + id, getClient(), null);
    }
    public IExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public IExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    public ISingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties() {
        return new SingleValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties"), getClient(), null);
    }

    public ISingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id) {
        return new SingleValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties") + "/" + id, getClient(), null);
    }
    public IMultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties() {
        return new MultiValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties"), getClient(), null);
    }

    public IMultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id) {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties") + "/" + id, getClient(), null);
    }

    public IMessageCopyRequestBuilder copy(final String destinationId) {
        return new MessageCopyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copy"), getClient(), null, destinationId);
    }

    public IMessageMoveRequestBuilder move(final String destinationId) {
        return new MessageMoveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.move"), getClient(), null, destinationId);
    }

    public IMessageCreateReplyRequestBuilder createReply() {
        return new MessageCreateReplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createReply"), getClient(), null);
    }

    public IMessageCreateReplyAllRequestBuilder createReplyAll() {
        return new MessageCreateReplyAllRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createReplyAll"), getClient(), null);
    }

    public IMessageCreateForwardRequestBuilder createForward() {
        return new MessageCreateForwardRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createForward"), getClient(), null);
    }

    public IMessageReplyRequestBuilder reply(final String comment) {
        return new MessageReplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reply"), getClient(), null, comment);
    }

    public IMessageReplyAllRequestBuilder replyAll(final String comment) {
        return new MessageReplyAllRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.replyAll"), getClient(), null, comment);
    }

    public IMessageForwardRequestBuilder forward(final String comment, final java.util.List<Recipient> toRecipients) {
        return new MessageForwardRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.forward"), getClient(), null, comment, toRecipients);
    }

    public IMessageSendRequestBuilder send() {
        return new MessageSendRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.send"), getClient(), null);
    }
}

