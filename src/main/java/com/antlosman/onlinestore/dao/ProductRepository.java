package com.antlosman.onlinestore.dao;

import com.antlosman.onlinestore.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // select * from product where category_id=?
    // Spring Data REST automatically exposes endpoint http://localhost:8080/products/search/findByCategory?id=someId
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
}
