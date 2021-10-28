package com.dev.retailwebbackend.controller;

import com.dev.retailwebbackend.model.HouseHolds;
import com.dev.retailwebbackend.model.Products;
import com.dev.retailwebbackend.model.Transactions;
import com.dev.retailwebbackend.repository.HouseHoldRepository;
import com.dev.retailwebbackend.repository.ProductsRepository;
import com.dev.retailwebbackend.repository.TransactionsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
