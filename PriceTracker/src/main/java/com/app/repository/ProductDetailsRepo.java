package com.app.repository;

import com.app.model.ProductDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductDetailsRepo extends JpaRepository<ProductDetails, Long> {

    @Query("Select p FROM ProductDetails p WHERE p.product LIKE CONCAT('%', :query, '%')")
    Page<ProductDetails> findByProductName(@Param("query") String query, Pageable pageable);
}
