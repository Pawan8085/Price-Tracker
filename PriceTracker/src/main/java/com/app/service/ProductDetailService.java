package com.app.service;

import com.app.dto.request.UrlReqeust;
import com.app.dto.response.ApiResponse;
import com.app.dto.response.ProductDetailsResponse;
import com.app.exception.ProductException;
import com.app.exception.UserException;

public interface ProductDetailService {
    /**
     *
     * @param urlReqeust
     */
    void addProductDetails(UrlReqeust urlReqeust)throws ProductException, UserException;

    /**
     *
     * @param product
     */
    void removeProductDetails(Long productId) throws ProductException, UserException;

    /**
     *
     * @param page_no
     * @return
     */
    ApiResponse<ProductDetailsResponse> findAllProductDetails(int page_no);

    public ApiResponse<ProductDetailsResponse> searchProducts(String key, int page_no);

    /**
     *
     * @param page
     * @return
     */
    ApiResponse<ProductDetailsResponse> getPricedDroppedProduct(int page);

}
