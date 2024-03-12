package com.javaspringtest.testcrud.service;

import com.javaspringtest.testcrud.entity.ProductEntity;
import com.javaspringtest.testcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public ProductEntity saveProduct(ProductEntity productEntity){
        return repository.save(productEntity);
    }

    public ProductEntity getProductById(int id){

        return repository.findById(id).orElse(null);
    }

    public ProductEntity getProductByName(String name){
        return repository.findByProductName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Data with id = "+id+" has been deleted";
    }

    public ProductEntity updateProduct(ProductEntity productEntity){
        ProductEntity existingProductEntity = repository.findById(productEntity.getId()).orElse(null);
        existingProductEntity.setProductName(productEntity.getProductName());
        existingProductEntity.setQuantity(productEntity.getQuantity());
        existingProductEntity.setPrice(productEntity.getPrice());
        return repository.save(existingProductEntity);
    }
}
