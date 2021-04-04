package com.shopcart.shoppingcart.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ProductTest {


    @Test
    @DisplayName("should create item")
    void shouldCreateItem() {
        Product product = Product.create("Product", BigDecimal.valueOf(10.5));
        Assertions.assertEquals("Product", product.name);
        Assertions.assertEquals(new BigDecimal("10.5"), product.price);
    }

}
