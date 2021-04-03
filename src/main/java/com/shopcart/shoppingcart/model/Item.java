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

    @NotBlank
    int discountPercent;

    private Item(String name, BigDecimal price, int discountPercent) {
        this.name = name;
        this.price = price;
        this.discountPercent = discountPercent;
    }


    public static Item create(String name, BigDecimal price, int discountPercent) {
        return new Item(name, price, discountPercent);
    }


}
