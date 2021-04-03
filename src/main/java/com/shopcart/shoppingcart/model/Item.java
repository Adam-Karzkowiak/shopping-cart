package com.shopcart.shoppingcart.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull
    String name;

    @NotNull
    BigDecimal price;



    private Item(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }


    public static Item create(String name, BigDecimal price) {
        return new Item(name, price);
    }


}
