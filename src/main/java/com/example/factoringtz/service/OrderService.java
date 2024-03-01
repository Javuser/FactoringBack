package com.example.factoringtz.service;

import com.example.factoringtz.entity.Order;

import java.util.List;

public interface OrderService {
    Order create(Order order);
    List<Order> getAll();

    Order findById(Long id);
    void deleteById(Long id);

}
