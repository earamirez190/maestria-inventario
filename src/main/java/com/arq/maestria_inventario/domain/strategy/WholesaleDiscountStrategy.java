package com.arq.maestria_inventario.domain.strategy;

import com.arq.maestria_inventario.domain.model.Product;

public class WholesaleDiscountStrategy implements DiscountStrategy {
    @Override
    public void applyDiscount(Product product) {
        if (product.getQuantity() >= 100) {
            double discountedPrice = product.getPrice() * 0.90; //Aplica un 10% de descuento
            product.setPrice(discountedPrice);
        }
    }
}
