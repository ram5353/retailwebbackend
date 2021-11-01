package com.dev.retailwebbackend.controller;


import com.dev.retailwebbackend.model.Transactions;
import com.dev.retailwebbackend.repository.TransactionsRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/transactions")
public class TransactionsController {

    private final TransactionsRepository transactionsRepository;

    public TransactionsController(TransactionsRepository transactionsRepository) {
        this.transactionsRepository = transactionsRepository;
    }

    @GetMapping("/all")
    public List<Transactions> getAllTransactions() {
        return transactionsRepository.findAll();
    }

    @GetMapping("/totalsales")
    public int totalSales() {
        return transactionsRepository.findAll().stream().mapToInt(l -> (int) l.getSpend()).sum();
    }
}
