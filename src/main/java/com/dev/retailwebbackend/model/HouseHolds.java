package com.dev.retailwebbackend.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HouseHolds {

    @Id
    @GeneratedValue
    @Column(name = "hshd_num")
    private int hshdNum;
    private String loyaltyFlag;
    private String ageRange;
    private String maritalStatus;
    private String incomeRange;
    private String homeownerDesc;
    private String hshdComposition;
    private String hshdSize;
    private String children;

    @OneToMany(targetEntity = Transactions.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "hshd_num", referencedColumnName = "hshd_num")
    private List<Transactions> transactions;

}
