package com.kh.coupang.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Product {

    @Id
    @Column(name="prod_code")
    private int prodCode; //prod_code

    @Column(name="prod_name")
    private String prodName; //prod_name

    @Column
    private int price;
}