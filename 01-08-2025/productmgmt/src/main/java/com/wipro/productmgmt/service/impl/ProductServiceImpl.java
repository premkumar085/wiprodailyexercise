package com.wipro.productmgmt.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.wipro.productmgmt.entity.Product;
import com.wipro.productmgmt.repo.ProductRepo;
import com.wipro.productmgmt.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    public void save(Product product) {
        productRepo.save(product);
    }

    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public Product findById(int id) {
        Optional<Product> product = productRepo.findById(id);
        return product.orElse(null);
    }

    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

    public List<Product> findByProductMake(String productMake) {
        return productRepo.findByProductMake(productMake);
    }

    public List<Product> findByProductNameAndProductMakeOrderByProductNameDesc(String productName, String productMake) {
        return productRepo.findByProductNameAndProductMakeOrderByProductNameDesc(productName, productMake);
    }

    public Page<Product> getProductsPaginated(Pageable pageable) {
        return productRepo.findAll(pageable);
    }
}
