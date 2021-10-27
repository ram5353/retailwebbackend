package com.dev.retailwebbackend.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transactions {

    @Id
    @GeneratedValue
    private int basketNum;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "basketNum", referencedColumnName = "productNum")
    private Products products;
    private Date data;
    private long spend;
    private int units;
    private String storeRegion;
    private int weekNum;
    private int year;

}
