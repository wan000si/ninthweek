package com.example.ninthweek.service.ServiceImpl;

import com.example.ninthweek.entity.Order;
import com.example.ninthweek.entity.OrderForm;
import com.example.ninthweek.repository.OrderRepository;
import com.example.ninthweek.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderFormRepository;


    @Override
    public Order findOrderById(Long id) {
        return null;
    }

    @Override
    public List<Order> findOrderByUserId(Long userId) {
        return null;
    }

    @Override
    public Order addOrder(Order order) {
        return null;
    }

    @Override
    public String withdrawnOrder(Long id) {
        return null;
    }

    @Override
    public String payOrder(Long id) {
        return null;
    }
}
