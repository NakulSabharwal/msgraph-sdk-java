// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mobile App Category Collection Page.
 */
public class BaseMobileAppCategoryCollectionPage extends BaseCollectionPage<MobileAppCategory, IMobileAppCategoryCollectionRequestBuilder> implements IBaseMobileAppCategoryCollectionPage {

    /**
     * A collection page for MobileAppCategory
     *
     * @param response the serialized BaseMobileAppCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseMobileAppCategoryCollectionPage(final BaseMobileAppCategoryCollectionResponse response, final IMobileAppCategoryCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
