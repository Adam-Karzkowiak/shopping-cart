package com.shopcart.shoppingcart.model;

import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;

@ToString
class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    ArrayList<Item> content;
    BigDecimal totalPrice;

    Basket(ArrayList<Item> content) {
        this.content = content;
        this.totalPrice = calculateTotalPrice(content);
    }

    private static BigDecimal calculateTotalPrice(ArrayList<Item> content) {
        BigDecimal sum = new BigDecimal("0");
        for (Item item : content) {
            sum = sum.add(item.price);
        }
        return sum;
    }


}
