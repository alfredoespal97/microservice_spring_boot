package com.alma.crud_fullstack_angular.service.product;

import com.alma.crud_fullstack_angular.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    Product save(Product product);
    List<Product> findAll();
    Product findById(Integer id);
    Product update(Product product);
    void deleteById(Integer id);
}
