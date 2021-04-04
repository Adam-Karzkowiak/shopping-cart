package com.shopcart.shoppingcart.repository;

import com.shopcart.shoppingcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

interface ProductRepository extends JpaRepository<Integer, Product> {

    Product save(Product entity);
}
