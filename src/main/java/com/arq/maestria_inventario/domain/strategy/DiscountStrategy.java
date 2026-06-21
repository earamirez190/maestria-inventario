package com.arq.maestria_inventario.domain.strategy;

import com.arq.maestria_inventario.domain.model.Product;

public interface DiscountStrategy {
    void applyDiscount(Product product);
}