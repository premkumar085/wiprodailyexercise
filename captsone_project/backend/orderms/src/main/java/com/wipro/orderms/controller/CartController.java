package com.wipro.orderms.controller;

import com.wipro.orderms.entity.Cart;
import com.wipro.orderms.service.CartService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders/cart")
@CrossOrigin(origins = "*")
@Tag(name = "Car Management", description = "APIs for managing Cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    @Operation(summary = "Get All Carts")
    public List<Cart> getAllCarts() {
        return cartService.findAll();
    }

    @GetMapping("/{userId}")
    @Operation(summary = "Get order by userId")
    public Cart getCartByUserId(@PathVariable int userId) {
        return cartService.findByUserId(userId);
    }

    @PostMapping
    @Operation(summary = "Add a prduct to a Cart")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "product Added successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    public Cart addOrUpdateCart(@RequestBody Cart cart) {
        return cartService.addOrUpdateCart(cart);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "remove prduct from  cart by ID")
    public void deleteCart(@PathVariable int id) {
        cartService.deleteById(id);
    }
}
