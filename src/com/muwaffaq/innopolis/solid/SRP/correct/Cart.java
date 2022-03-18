package com.muwaffaq.innopolis.solid.SRP.correct;

import java.util.List;

/**
 * ❌ ❌ ❌ ❌
 * how many responsibilities does it have?
 *
 * SRP :
 * a class should only have one responsibility
 * it should only have one reason to change
 */

public class Cart {

    List<Product> products;

    void addToCart(Product product) {
        products.add(product);
    }

    void removeFromCart(Product product) {
        products.remove(product);
    }

    double getTotalPrice() {
        double sum = 0;
        for (Product p : products)
            sum += p.getPrice();
        return sum;
    }
}



