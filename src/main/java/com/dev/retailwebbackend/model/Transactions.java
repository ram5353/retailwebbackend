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
    private int id;

    private int basketNum;

    @Column(name = "hshd_num")
    private int hshdNum;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productNum", referencedColumnName = "productNum")
    private Products products;
    private String date;
    private long spend;
    private int units;
    private String storeRegion;
    private int weekNum;
    private int year;

}
