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
    private final TransactionsRepository transactionsRepository;
    private final HouseHoldRepository houseHoldRepository;

    public ProductsController(ProductsRepository productsRepository, TransactionsRepository transactionsRepository, HouseHoldRepository houseHoldRepository) {
        this.productsRepository = productsRepository;
        this.transactionsRepository = transactionsRepository;
        this.houseHoldRepository = houseHoldRepository;
    }

    @GetMapping("/all")
    public List<Products> getProducts() {
        return productsRepository.findAll();
    }

    @GetMapping("allTrans")
    public List<Transactions> getAllTransactions() {
        return transactionsRepository.findAll();
    }

    @GetMapping("allhouseholds")
    public List<HouseHolds> getAllHouseHolds() {
        return houseHoldRepository.findAll();
    }

}
