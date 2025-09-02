package com.wipro.product.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.product.entity.Product;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByMake(String make);
    List<Product> findByProdNameAndMakeOrderByProdNameDesc(String prodName, String make);
}
