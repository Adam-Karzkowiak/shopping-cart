package com.shopcart.shoppingcart.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ItemTest {


    @Test
    @DisplayName("should create item")
    void shouldCreateItem() {
        Item item = Item.create("Product", BigDecimal.valueOf(10.5), 0);
        Assertions.assertEquals("Product", item.name);
        Assertions.assertEquals(new BigDecimal("10.5"), item.price);
        Assertions.assertEquals(0, item.discountPercent);
    }

}
