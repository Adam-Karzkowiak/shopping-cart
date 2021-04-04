package com.shopcart.shoppingcart.model;

import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;

@ToString
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    public ArrayList<Product> content;
    public BigDecimal totalPrice;

    public Basket() {
        this.content = new ArrayList<>();
        this.totalPrice = BigDecimal.ZERO;
    }


}
