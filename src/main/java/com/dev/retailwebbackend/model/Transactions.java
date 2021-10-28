package com.dev.retailwebbackend.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transactions {

    @Id
    @GeneratedValue
    private int basketNum;
    private int hshdNum;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "basketNum", referencedColumnName = "productNum")
    private Products products;
    private String date;
    private long spend;
    private int units;
    private String storeRegion;
    private int weekNum;
    private int year;

}
