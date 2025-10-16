package com.app.service;

import com.app.dto.request.UrlReqeust;
import com.app.dto.response.ApiResponse;
import com.app.dto.response.PageInfoResponse;
import com.app.dto.response.ProductDetailsResponse;
import com.app.exception.ProductException;

public interface ProductDetailService {
    /**
     *
     * @param urlReqeust
     */
    void addProductDetails(UrlReqeust urlReqeust)throws ProductException;

    /**
     *
     * @param page_no
     * @return
     */
    ApiResponse<ProductDetailsResponse> findAllProductDetails(int page_no);

    /**
     *
     * @param key
     * @param page
     * @return
     */
    ApiResponse<ProductDetailsResponse> searchProducts(String key, int page);

    /**
     *
     * @param page
     * @return
     */
    ApiResponse<ProductDetailsResponse> getPricedDroppedProduct(int page);

}
