package com.wipro.orderms.service.impl;

import com.wipro.orderms.entity.Cart;
import com.wipro.orderms.repo.CartRepo;
import com.wipro.orderms.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepo cartRepo;

    @Override
    public List<Cart> findAll() {
        return cartRepo.findAll();
    }

    @Override
    public Cart findById(int id) {
        return cartRepo.findById(id).orElseThrow(() -> new RuntimeException("Cart not found"));
    }

    @Override
    public Cart findByUserId(int userId) {
        Cart cart = cartRepo.findByUserId(userId);
        if (cart == null) {
            cart = new Cart();
            cart.setUserId(userId);
        }
        return cart;
    }

    @Override
    public Cart addOrUpdateCart(Cart newCart) {
        Cart existingCart = cartRepo.findByUserId(newCart.getUserId());
        if (existingCart != null) {
            existingCart.getItems().addAll(newCart.getItems());
            existingCart.setTotalQty(existingCart.getItems().stream().mapToInt(i -> i.getQuantity()).sum());
            existingCart.setTotalPrice(existingCart.getItems().stream().mapToDouble(i -> i.getPrice() * i.getQuantity()).sum());
            return cartRepo.save(existingCart);
        } else {
            newCart.setTotalQty(newCart.getItems().stream().mapToInt(i -> i.getQuantity()).sum());
            newCart.setTotalPrice(newCart.getItems().stream().mapToDouble(i -> i.getPrice() * i.getQuantity()).sum());
            return cartRepo.save(newCart);
        }
    }

    @Override
    public void deleteById(int id) {
        cartRepo.deleteById(id);
    }
}
