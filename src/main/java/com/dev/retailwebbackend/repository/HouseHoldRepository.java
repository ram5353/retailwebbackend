package com.dev.retailwebbackend.repository;

import com.dev.retailwebbackend.model.HouseHolds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseHoldRepository extends JpaRepository<HouseHolds, Integer> {

}
