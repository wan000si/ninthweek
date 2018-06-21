package com.example.ninthweek.service;

import com.example.ninthweek.entity.Order;
import com.example.ninthweek.entity.OrderForm;

import java.util.List;

public interface OrderService {
    Order findOrderById(Long id);

    List<Order> findOrderByUserId(Long userId);

    Order addOrder(Order order);

    String withdrawnOrder(Long id);

    String payOrder(Long id);


}
