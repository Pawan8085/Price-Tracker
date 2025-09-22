package com.app.dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductDetailsResponse {

    private String url;
    private  String product;
    private Integer currentPrice;
    private Integer minPrice;
    private  Integer maxPrice;
}
