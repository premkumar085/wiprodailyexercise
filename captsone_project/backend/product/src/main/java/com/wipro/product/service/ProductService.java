package com.wipro.product.service;

import java.util.List;
import com.wipro.product.entity.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
    Product addProduct(Product product);
    Product updateProduct(int id, Product product);
    void deleteProduct(int id);
    List<Product> getByMake(String make);
    List<Product> getByNameAndMake(String name, String make);
}
