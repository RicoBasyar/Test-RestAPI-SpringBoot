package com.javaspringtest.testcrud.controller;

import com.javaspringtest.testcrud.entity.ProductEntity;
import com.javaspringtest.testcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addproduct")
    public ProductEntity addProduct(@RequestBody ProductEntity productEntity){
        return service.saveProduct(productEntity);
    }

    @GetMapping("/productById/{id}")
    public ProductEntity findProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @GetMapping("/productByName/{name}")
    public ProductEntity findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }

    @PutMapping("/updateproduct")
    public ProductEntity updateProduct(@RequestBody ProductEntity productEntity){
        return service.updateProduct(productEntity);
    }
    //test
    @DeleteMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
}