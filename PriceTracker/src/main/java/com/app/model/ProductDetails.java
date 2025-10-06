package com.app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
