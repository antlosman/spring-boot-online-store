package com.antlosman.onlinestore.dao;

import com.antlosman.onlinestore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
