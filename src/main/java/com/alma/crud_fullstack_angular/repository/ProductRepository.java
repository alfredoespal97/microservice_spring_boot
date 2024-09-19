package com.alma.crud_fullstack_angular.repository;


import com.alma.crud_fullstack_angular.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
