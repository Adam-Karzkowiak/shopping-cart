package com.shopcart.shoppingcart.service;

import com.shopcart.shoppingcart.model.Basket;
import com.shopcart.shoppingcart.model.Product;
import org.junit.jupiter.api.*;


import java.math.BigDecimal;

class BasketServiceTest {

    BasketService basketService;

    @BeforeEach
    void setup() {
        basketService = new BasketService();
    }

    @Test
    @DisplayName("should calculate value of basket items")
    void shouldCalculateValueOfBasketItems() {
        Basket basket = new Basket();
        Product productOne = Product.create("ProductOne", BigDecimal.valueOf(10));
        Product productTwo = Product.create("ProductTwo", BigDecimal.valueOf(15));
        Product productThree = Product.create("ProductTwo", BigDecimal.valueOf(20));
        Product productFour = Product.create("ProductTwo", BigDecimal.valueOf(25));
        basket = basketService.addProduct(basket, productOne);
        basket = basketService.addProduct(basket, productTwo);
        basket = basketService.addProduct(basket, productThree);
        basket = basketService.addProduct(basket, productFour);
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
        basket = basketService.addProduct(basket, productOne);
        basket = basketService.addProduct(basket, productTwo);
        basket = basketService.addProduct(basket, productThree);
        basket = basketService.addProduct(basket, productFour);
        Assertions.assertNotEquals(BigDecimal.valueOf(50), basket.totalPrice);
    }

    @Test
    @DisplayName("should add product to the basket")
    void shouldAddProductToTheBasket() {
        Basket basket = new Basket();
        Product productOne = Product.create("ProductOne", BigDecimal.valueOf(10));
        basket = basketService.addProduct(basket, productOne);
        Assertions.assertTrue(basket.content.contains(productOne));
    }

}
