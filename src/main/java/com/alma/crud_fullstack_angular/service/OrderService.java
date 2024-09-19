package com.alma.crud_fullstack_angular.service;

import com.alma.crud_fullstack_angular.entity.Order;
import java.util.List;

public interface OrderService {

    Order save(Order order);
    List<Order> findAll();
    Order findById(int id);
    Order update(Order order);
    void deleteById(int id);
}
