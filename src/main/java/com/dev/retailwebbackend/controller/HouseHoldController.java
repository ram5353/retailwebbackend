package com.dev.retailwebbackend.controller;


import com.dev.retailwebbackend.model.HouseHolds;
import com.dev.retailwebbackend.repository.HouseHoldRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/house-holds")
public class HouseHoldController {

    private final HouseHoldRepository houseHoldRepository;

    public HouseHoldController(HouseHoldRepository houseHoldRepository) {
        this.houseHoldRepository = houseHoldRepository;
    }

    @GetMapping("/all")
    public List<HouseHolds> getAllHouseHolds() {
        return houseHoldRepository.findAll();
    }
}
