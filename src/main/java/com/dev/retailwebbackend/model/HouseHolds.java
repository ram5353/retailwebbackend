package com.dev.retailwebbackend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HouseHolds {

    @Id
    @GeneratedValue
    private int hshdNum;
    private Boolean loyaltyFlag;
    private String ageRange;
    private String maritalStatus;
    private String incomeRange;
    private Boolean homeownerDesc;
    private String hshdComposition;
    private int hshdSize;
    private int children;

}
