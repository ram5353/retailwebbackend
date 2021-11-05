package com.dev.retailwebbackend.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class HouseholdsDto {
    private int hshdNum;
    private String loyaltyFlag;
    private String ageRange;
    private String maritalStatus;
    private String incomeRange;
    private String homeownerDesc;
    private String hshdComposition;
    private String hshdSize;
    private String children;
    private int productNum;
    private String department;
    private String commodity;
    private int basketNum;
    private long spend;
    private int units;
    private String storeRegion;
    private int weekNum;
    private int year;
}
