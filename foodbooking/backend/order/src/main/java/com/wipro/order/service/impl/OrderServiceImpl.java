package com.wipro.order.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.order.dto.Food;
import com.wipro.order.entity.OrderEntity;
import com.wipro.order.entity.OrderMaster;
import com.wipro.order.repo.OrderMasterRepo;
import com.wipro.order.repo.OrderRepo;
import com.wipro.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private OrderMasterRepo orderMasterRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<OrderEntity> findAll() {
        return orderRepo.findAll();
    }

    @Override
    public OrderEntity findById(int id) {
        Optional<OrderEntity> orderOpt = orderRepo.findById(id);
        return orderOpt.orElse(null);
    }

    @Override
    public OrderEntity save(OrderEntity order, String token) {
        // 1. Generate orderId
        List<OrderMaster> orderMasterList = orderMasterRepo.findAll();
        String orderId = null;
        if (!orderMasterList.isEmpty()) {
            OrderMaster orderMasterData = orderMasterList.get(orderMasterList.size() - 1);
            int value = orderMasterData.getValue() + 1;
            String strValue = String.format("%04d", value);
            orderId = "ORD-" + strValue;
            orderMasterData.setValue(value);
            orderMasterRepo.save(orderMasterData);
        }
        order.setOrderId(orderId);
        order.setOrderStatus(0);

        // 2. Call FOOD-MS
        String url = "http://FOOD-MS/food/" + order.getFoodId();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<Food> response = restTemplate.exchange(url, HttpMethod.GET, entity, Food.class);

        Food food = response.getBody();
        order.setTotalOrderPrice(order.getQuantity() * food.getPrice());

        return orderRepo.save(order);
    }

    @Override
    public void deleteById(int id) {
        orderRepo.deleteById(id);
    }
}
