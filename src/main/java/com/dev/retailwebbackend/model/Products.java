package com.dev.retailwebbackend.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Products {

    @Id
    @GeneratedValue
    private int productNum;

    private String department;
    private String commodity;
    private String brandType;
    private String flag;
}
