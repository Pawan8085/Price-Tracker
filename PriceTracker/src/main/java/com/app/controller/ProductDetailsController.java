package com.app.controller;

import com.app.dto.request.UrlReqeust;
import com.app.dto.response.ApiResponse;
import com.app.dto.response.ProductDetailsResponse;
import com.app.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductDetailsController {

    private final ProductDetailService productDetailService;

    @Autowired
    public ProductDetailsController(ProductDetailService productDetailService) {
        this.productDetailService = productDetailService;
    }

    @PostMapping("/add")
    public  ResponseEntity<Void> addProductDetailsHandler(@RequestBody UrlReqeust urlReqeust){

        productDetailService.addProductDetails(urlReqeust);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public  ResponseEntity<ApiResponse<ProductDetailsResponse>> findAllProductsHandler(@RequestParam int page){

        ApiResponse<ProductDetailsResponse> response = productDetailService.findAllProductDetails(page);
        return new ResponseEntity<ApiResponse<ProductDetailsResponse>>(response, HttpStatus.OK);

    }

    @GetMapping
    public  ResponseEntity<ApiResponse<ProductDetailsResponse>> searchProductDetailsByNameHandler(@RequestParam String q, @RequestParam int page){

        ApiResponse<ProductDetailsResponse> response = productDetailService.searchProducts(q, page);
        return new ResponseEntity<ApiResponse<ProductDetailsResponse>>(response, HttpStatus.OK);

    }

}
