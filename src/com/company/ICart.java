package com.company;

public interface ICart {
    public void addToCart(Integer productId);
    public void removeFromCart(Integer productId);
    public void reduceFromCart(Integer productId);
}
