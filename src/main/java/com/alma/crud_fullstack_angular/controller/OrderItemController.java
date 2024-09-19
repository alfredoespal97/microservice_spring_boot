package com.alma.crud_fullstack_angular.controller;

import com.alma.crud_fullstack_angular.entity.OrderItem;
import com.alma.crud_fullstack_angular.service.orderItem.OrderItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderitems")
public class OrderItemController {

    private final OrderItemService orderItemService;
    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }
    @GetMapping
    public List<OrderItem> getOrderItems() {
        return orderItemService.findAll();
    }

    @GetMapping("/{idOrderItem}")
    public OrderItem getOrderItem(@PathVariable("idOrderItem") Integer idOrderItem) {
        return orderItemService.findById(idOrderItem);
    }

    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.save(orderItem);
    }

    @PutMapping
    public OrderItem updateOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.save(orderItem);
    }

    @DeleteMapping("/{idOrderItem}")
    public void deleteOrderItem(@PathVariable("idOrderItem") Integer idOrderItem) {
        orderItemService.delete(idOrderItem);
    }
}
