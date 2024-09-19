package com.alma.crud_fullstack_angular.service.orderItem;

import com.alma.crud_fullstack_angular.entity.OrderItem;
import com.alma.crud_fullstack_angular.exception.ResourceNotFoundException;
import com.alma.crud_fullstack_angular.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    public final OrderItemRepository orderItemRepository;

    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }


    @Override
    public OrderItem save(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    @Override
    public OrderItem findById(Integer id) {
        return orderItemRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("OrderItem not found id: "+ id)
        );
    }

    @Override
    public OrderItem update(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public void delete(Integer id) {
        orderItemRepository.deleteById(id);
    }
}
