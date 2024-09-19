package com.alma.crud_fullstack_angular.controller;

import com.alma.crud_fullstack_angular.entity.Product;
import com.alma.crud_fullstack_angular.service.product.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> listAll() {
        return productService.findAll();
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/{idProduct}")
    public Product findById(@RequestParam("idProduct") Integer id) {
        return productService.findById(id);
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping("/{idProduct}")
    public void delete(@PathVariable("idProduct") Integer idProduct) {
        productService.deleteById(idProduct);
    }
}
