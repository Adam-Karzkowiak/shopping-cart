package com.shopcart.shoppingcart.model;

import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ToString
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull
    String name;

    @NotNull
    public BigDecimal price;



    private Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }


    public static Product create(String name, BigDecimal price) {
        return new Product(name, price);
    }


}
