package com.company;

import java.lang.annotation.Target;
import java.lang.reflect.*;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @org.junit.jupiter.api.Test
    void cart() {
    }

    @org.junit.jupiter.api.Test
    void addToCart() {
        Cart c = new Cart();
        c.addToCart(1000);
        Class<Cart> cartClass = Cart.class;
        Field field = cartClass.getDeclaredField("cartContent");

    }

    @org.junit.jupiter.api.Test
    void removeFromCart() {
    }

    @org.junit.jupiter.api.Test
    void reduceFromCart() {
    }
}