package com.dev.retailwebbackend.services;


import com.dev.retailwebbackend.model.HouseHolds;
import com.dev.retailwebbackend.repository.HouseHoldRepository;
import org.springframework.stereotype.Service;


@Service
public class HouseHoldService {

    private final HouseHoldRepository houseHoldRepository;

    public HouseHoldService(HouseHoldRepository houseHoldRepository) {
        this.houseHoldRepository = houseHoldRepository;
    }

    public HouseHolds getHouseHoldData(int houseHoldNumber) {
        return houseHoldRepository.findById(houseHoldNumber).orElseThrow();
    }
}
