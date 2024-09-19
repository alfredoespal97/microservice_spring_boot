package com.alma.crud_fullstack_angular.service.orderItem;

import com.alma.crud_fullstack_angular.entity.OrderItem;

import java.util.List;

public interface OrderItemService {

    OrderItem save(OrderItem orderItem);
    List<OrderItem> findAll();
    OrderItem findById(Integer id);
    OrderItem update(OrderItem orderItem);
    void delete(Integer id);
}
