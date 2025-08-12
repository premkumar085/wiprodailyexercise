package com.wipro.productmgmt.repo;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.productmgmt.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByProductMake(String productMake);
    List<Product> findByProductNameAndProductMakeOrderByProductNameDesc(String productName, String productMake);
    Page<Product> findAll(Pageable pageable);
}
