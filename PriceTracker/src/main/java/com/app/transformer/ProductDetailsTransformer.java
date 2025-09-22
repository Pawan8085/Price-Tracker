package com.app.transformer;

import com.app.dto.response.ProductDetailsResponse;
import com.app.model.ProductDetails;

public class ProductDetailsTransformer {


    public static ProductDetailsResponse productDetailsToProductDetailsResponse(ProductDetails productDetails){
        // ProductDetails To ProductDetailsResponse
        return  ProductDetailsResponse.builder()
                .url(productDetails.getUrl())
                .product(productDetails.getProduct())
                .currentPrice(productDetails.getCurrentPrice())
                .maxPrice(productDetails.getMaxPrice())
                .minPrice(productDetails.getMinPrice())
                .build();
    }
}
