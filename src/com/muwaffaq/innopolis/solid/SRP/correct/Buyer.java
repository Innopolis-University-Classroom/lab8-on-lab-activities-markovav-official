package com.muwaffaq.innopolis.solid.SRP.correct;

public class Buyer {
    String token;
    Cart cart;

    public Buyer(String token) {
        this.token = token;
        cart = new Cart();
    }

    double getTotalPrice() {
        return cart.getTotalPrice();
    }

    double getTotalPriceWithDiscount(int percentage) {
        return cart.getTotalPrice() * (100 - percentage) / 100;
    }
}
