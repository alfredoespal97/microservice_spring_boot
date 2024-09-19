package com.alma.crud_fullstack_angular.controller;


import com.alma.crud_fullstack_angular.entity.Order;
import com.alma.crud_fullstack_angular.service.order.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> listAll() {
        return orderService.findAll();
    }

    @PostMapping
    public Order save(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping("/{idOrder}")
    public Order findById(@PathVariable("idOrder") Integer id) {
        return orderService.findById(id);
    }


    @PutMapping
    public Order update(@RequestBody Order order) {
        Order orderToUpdate = orderService.findById(order.getId());
        orderToUpdate.setOrderDate(order.getOrderDate());
        orderToUpdate.setOrderItems(order.getOrderItems());
        orderToUpdate.setCustomer(order.getCustomer());
        orderToUpdate.setTotalAmount(order.getTotalAmount());
        return orderService.update(orderToUpdate);
    }

    @DeleteMapping("/{idOrder}")
    public void deleteById(@PathVariable("idOrder") Integer id) {
        orderService.deleteById(id);
    }



}
