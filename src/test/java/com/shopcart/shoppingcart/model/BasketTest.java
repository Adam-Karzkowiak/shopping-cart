package com.shopcart.shoppingcart.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

class BasketTest {

    @Test
    @DisplayName("should calculate value of basket items")
    void shouldCalculateValueOfBasketItems() {
        ArrayList<Item> content = new ArrayList<>();
        Item itemOne = Item.create("ProductOne", BigDecimal.valueOf(10));
        Item itemTwo = Item.create("ProductTwo", BigDecimal.valueOf(15));
        Item itemThree = Item.create("ProductTwo", BigDecimal.valueOf(20));
        Item itemFour = Item.create("ProductTwo", BigDecimal.valueOf(25));
        content.add(itemOne);
        content.add(itemTwo);
        content.add(itemThree);
        content.add(itemFour);
        Basket basket = new Basket(content);
        Assertions.assertEquals(BigDecimal.valueOf(70), basket.totalPrice);
    }

    @Test
    @DisplayName("should give wrong value of basket items")
    void shouldGiveWrongValueOfBasketItems() {
        ArrayList<Item> content = new ArrayList<>();
        Item itemOne = Item.create("ProductOne", BigDecimal.valueOf(10));
        Item itemTwo = Item.create("ProductTwo", BigDecimal.valueOf(15));
        Item itemThree = Item.create("ProductTwo", BigDecimal.valueOf(20));
        Item itemFour = Item.create("ProductTwo", BigDecimal.valueOf(25));
        content.add(itemOne);
        content.add(itemTwo);
        content.add(itemThree);
        content.add(itemFour);
        Basket basket = new Basket(content);
        Assertions.assertNotEquals(BigDecimal.valueOf(50), basket.totalPrice);
    }

    @Test
    @DisplayName("basket default total price should be 0")
    void basketDefaultTotalPriceShouldBeZero() {
        ArrayList<Item> items = new ArrayList<>();
        Basket testBasket = new Basket(items);
        Assertions.assertEquals(BigDecimal.ZERO,testBasket.totalPrice);
    }
}
