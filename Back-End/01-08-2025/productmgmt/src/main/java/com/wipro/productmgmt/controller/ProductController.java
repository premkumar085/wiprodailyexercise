package com.wipro.productmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import com.wipro.productmgmt.entity.Product;
import com.wipro.productmgmt.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Product", description = "Product management APIs")
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;
    
    @Operation(summary = "Create a Product")
	  @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Saved successfully"),
	    @ApiResponse(responseCode = "404", description = "Not found")
	  })
    
    @PostMapping
    void save(@RequestBody Product product) {
        productService.save(product);
    }
    @Operation(summary = "Save a Product")
	  @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Saved successfully"),
	    @ApiResponse(responseCode = "404", description = "Not found")
	  })

    @GetMapping
    List<Product> findAll() {
        return productService.findAll();
    }
    @Operation(summary = "Save a Product")
	  @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Saved successfully"),
	    @ApiResponse(responseCode = "404", description = "Not found")
	  })

    @GetMapping("/{id}")
    Product findById(@PathVariable int id) {
        return productService.findById(id);
    }
    
    @Operation(summary = "Update a Product")
	  @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Saved successfully"),
	    @ApiResponse(responseCode = "404", description = "Not found")
	  })

    @PutMapping
    void update(@RequestBody Product product) {
        productService.save(product);
    }
    @Operation(summary = "Delete a Product")
	  @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Saved successfully"),
	    @ApiResponse(responseCode = "404", description = "Not found")
	  })

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable int id) {
        productService.deleteById(id);
    }
    @Operation(summary = "make a Product")
	  @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Saved successfully"),
	    @ApiResponse(responseCode = "404", description = "Not found")
	  })

    @GetMapping("/make")
    List<Product> findByProductMake(@RequestParam String productMake) {
        return productService.findByProductMake(productMake);
    }
    @Operation(summary = "Search a Product")
	  @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Saved successfully"),
	    @ApiResponse(responseCode = "404", description = "Not found")
	  })

    @GetMapping("/search/{productName}/{productMake}")
    List<Product> findByNameAndMake(@PathVariable String productName, @PathVariable String productMake) {
        return productService.findByProductNameAndProductMakeOrderByProductNameDesc(productName, productMake);
    }
    @Operation(summary = "paging a Product")
	  @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Saved successfully"),
	    @ApiResponse(responseCode = "404", description = "Not found")
	  })

    @GetMapping("/page/{pageNum}/{pageSize}/{sortOrder}")
    Page<Product> findAllPage(@PathVariable int pageNum, @PathVariable int pageSize, @PathVariable int sortOrder) {
        Pageable p;
        if (sortOrder == 0) {
            p = PageRequest.of(pageNum, pageSize, Sort.by("productPrice").descending());
        } else {
            p = PageRequest.of(pageNum, pageSize, Sort.by("productPrice").ascending());
        }
        return productService.getProductsPaginated(p);
    }
}
