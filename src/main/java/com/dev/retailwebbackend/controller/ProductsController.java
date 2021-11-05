package com.dev.retailwebbackend.controller;

import com.dev.retailwebbackend.model.Products;
import com.dev.retailwebbackend.repository.ProductsRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductsRepository productsRepository;

    public ProductsController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @GetMapping("/all")
    public List<Products> getProducts() {
        return productsRepository.findAll();
    }

}
