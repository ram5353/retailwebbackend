package com.dev.retailwebbackend.repository;

import com.dev.retailwebbackend.dto.HouseholdsDto;
import com.dev.retailwebbackend.model.HouseHolds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseHoldRepository extends JpaRepository<HouseHolds, Integer> {

    @Query("SELECT new com.dev.retailwebbackend.dto.HouseholdsDto(h.hshdNum, h.loyaltyFlag, h.ageRange, h.maritalStatus, h.incomeRange,h.homeownerDesc, h.hshdComposition, h.hshdSize, h.children, p.productNum, p.department, p.commodity, t.basketNum, t.spend, t.units, t.storeRegion, t.weekNum, t.year) FROM HouseHolds h JOIN h.transactions t JOIN t.products p")
    public List<HouseholdsDto> getJoinInformation();

}
