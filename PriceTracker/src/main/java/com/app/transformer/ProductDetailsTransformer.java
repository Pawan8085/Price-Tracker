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
                .price_drop(productDetails.getPriceDrop())
                .build();
    }


    public static ProductDetails productDetailsResponseToProductDetails(ProductDetailsResponse productDetailsResponse){
        // ProductDetailsResponse to ProductDetails
        return ProductDetails.builder()
                .product(productDetailsResponse.getProduct())
                .url(productDetailsResponse.getUrl())
                .currentPrice(productDetailsResponse.getCurrentPrice())
                .minPrice(productDetailsResponse.getMinPrice())
                .maxPrice(productDetailsResponse.getMaxPrice())
                .priceDrop(productDetailsResponse.getPrice_drop())
                .build();
    }
}
