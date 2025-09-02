package com.wipro.product.service.impl;

import com.wipro.product.entity.Product;
import com.wipro.product.repo.ProductRepo;
import com.wipro.product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(int id, Product product) {
        return productRepo.findById(id).map(existing -> {
            existing.setProdName(product.getProdName());
            existing.setProdDesc(product.getProdDesc());
            existing.setProdCat(product.getProdCat());
            existing.setMake(product.getMake());
            existing.setAvailableQty(product.getAvailableQty());
            existing.setPrice(product.getPrice());
            existing.setUom(product.getUom());
            existing.setProdRating(product.getProdRating());
            existing.setImageURL(product.getImageURL());
            existing.setDateOfManufacture(product.getDateOfManufacture());
            return productRepo.save(existing);
        }).orElse(null);
    }

    @Override
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> getByMake(String make) {
        return productRepo.findByMake(make);
    }

    @Override
    public List<Product> getByNameAndMake(String name, String make) {
        return productRepo.findByProdNameAndMakeOrderByProdNameDesc(name, make);
    }
}
