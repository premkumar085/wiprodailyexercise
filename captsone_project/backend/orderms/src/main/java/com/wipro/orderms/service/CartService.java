package com.wipro.orderms.service;

import com.wipro.orderms.entity.Cart;
import java.util.List;

public interface CartService {
    List<Cart> findAll();
    Cart findById(int id);
    Cart findByUserId(int userId);
    Cart addOrUpdateCart(Cart cart); 
    void deleteById(int id);
}
