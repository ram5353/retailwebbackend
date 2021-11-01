package com.dev.retailwebbackend.controller;


import com.dev.retailwebbackend.model.HouseHolds;
import com.dev.retailwebbackend.model.Transactions;
import com.dev.retailwebbackend.repository.HouseHoldRepository;
import com.dev.retailwebbackend.services.HouseHoldService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/house-holds")
public class HouseHoldController {

    private final HouseHoldRepository houseHoldRepository;
    private HouseHoldService houseHoldService;

    public HouseHoldController(HouseHoldRepository houseHoldRepository) {
        this.houseHoldRepository = houseHoldRepository;
    }

    @GetMapping("/all")
    public List<HouseHolds> getAllHouseHolds() {
        return houseHoldRepository.findAll();
    }

    @GetMapping("/datapull/{houseHoldNumber}")
    public HouseHolds getAllData(@PathVariable int houseHoldNumber) {
        return houseHoldService.getHouseHoldData(houseHoldNumber);
    }

}
