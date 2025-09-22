package com.app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private  String product;
    private  String url;
    private Integer currentPrice;
    private Integer minPrice;
    private  Integer maxPrice;

}
