package com.shopcart.shoppingcart.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class BasketTest {

    @Test
    @DisplayName("should calculate value of basket items")
    void shouldCalculateValueOfBasketItems() {
        Basket basket = new Basket();
        Product productOne = Product.create("ProductOne", BigDecimal.valueOf(10));
        Product productTwo = Product.create("ProductTwo", BigDecimal.valueOf(15));
        Product productThree = Product.create("ProductTwo", BigDecimal.valueOf(20));
        Product productFour = Product.create("ProductTwo", BigDecimal.valueOf(25));
        basket.content.add(productOne);
        basket.content.add(productTwo);
        basket.content.add(productThree);
        basket.content.add(productFour);
        Assertions.assertEquals(BigDecimal.valueOf(70), basket.totalPrice);
    }

    @Test
    @DisplayName("should give wrong value of basket items")
    void shouldGiveWrongValueOfBasketItems() {
        Basket basket = new Basket();
        Product productOne = Product.create("ProductOne", BigDecimal.valueOf(10));
        Product productTwo = Product.create("ProductTwo", BigDecimal.valueOf(15));
        Product productThree = Product.create("ProductTwo", BigDecimal.valueOf(20));
        Product productFour = Product.create("ProductTwo", BigDecimal.valueOf(25));
        basket.content.add(productOne);
        basket.content.add(productTwo);
        basket.content.add(productThree);
        basket.content.add(productFour);
        Assertions.assertNotEquals(BigDecimal.valueOf(50), basket.totalPrice);
    }

    @Test
    @DisplayName("basket default total price should be 0")
    void basketDefaultTotalPriceShouldBeZero() {
        Basket testBasket = new Basket();
        Assertions.assertEquals(BigDecimal.ZERO, testBasket.totalPrice);
    }
}
