package com.javaspringtest.testcrud.repository;

import com.javaspringtest.testcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByProductName(String productName);
}
