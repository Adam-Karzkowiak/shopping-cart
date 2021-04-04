package com.shopcart.shoppingcart.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class BasketTest {

    @Test
    @DisplayName("basket default total price should be 0")
    void basketDefaultTotalPriceShouldBeZero() {
        Basket testBasket = new Basket();
        Assertions.assertEquals(BigDecimal.ZERO, testBasket.totalPrice);
    }
}
