package com.wipro.product.service;

import java.util.List;

import com.wipro.product.entity.Product;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void deleteById(int id);
}
