// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.ListItemVersion;
import com.microsoft.graph.requests.extensions.IListItemVersionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base List Item Version Collection Page.
 */
public class BaseListItemVersionCollectionPage extends BaseCollectionPage<ListItemVersion, IListItemVersionCollectionRequestBuilder> implements IBaseListItemVersionCollectionPage {

    /**
     * A collection page for ListItemVersion
     *
     * @param response the serialized BaseListItemVersionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseListItemVersionCollectionPage(final BaseListItemVersionCollectionResponse response, final IListItemVersionCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
