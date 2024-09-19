package com.alma.crud_fullstack_angular.repository;

import com.alma.crud_fullstack_angular.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product extends JpaRepository<Order,Integer> {
}
