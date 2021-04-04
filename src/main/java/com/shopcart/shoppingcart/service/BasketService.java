package com.shopcart.shoppingcart.service;

import com.shopcart.shoppingcart.model.Basket;
import com.shopcart.shoppingcart.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;

class BasketService {


    Basket addProduct(Basket basket, Product item) {
        basket.content.add(item);
        basket.totalPrice = calculateTotalPrice(basket.content);
        return basket;
    }

    BigDecimal calculateTotalPrice(ArrayList<Product> content) {
        BigDecimal sum = new BigDecimal("0");
        for (Product product : content) {
            sum = sum.add(product.price);
        }
        return sum;
    }


}
