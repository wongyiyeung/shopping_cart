package com.company;

import java.util.HashMap;

public class Cart implements ICart {
    private HashMap<Integer, Integer> cartContent;
    private Inventory mInventory;

    public void Cart(Inventory inventory) {
        mInventory = inventory;
    }

    public void addToCart(Integer productId) {
        Integer amount = cartContent.get(productId);
        cartContent.put(productId, amount + 1);
    }

    public void removeFromCart(Integer productId) {
        cartContent.remove(productId);
    }

    public void reduceFromCart(Integer productId) {
        Integer amount = cartContent.get(productId);
        if (amount == null) return;

        if (amount == 0) {
            cartContent.remove(productId);
        } else {
            cartContent.put(productId, amount - 1);
        }
    }
}
