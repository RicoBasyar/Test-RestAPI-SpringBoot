package com.javaspringtest.testcrud.repository;

import com.javaspringtest.testcrud.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    ProductEntity findByProductName(String productName);
}
