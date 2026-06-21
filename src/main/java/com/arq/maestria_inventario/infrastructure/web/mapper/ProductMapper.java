package com.arq.maestria_inventario.infrastructure.web.mapper;

import com.arq.maestria_inventario.domain.model.Product;
import com.arq.maestria_inventario.domain.model.ProductBuilder;
import com.arq.maestria_inventario.infrastructure.web.dto.ProductRequest;
import com.arq.maestria_inventario.infrastructure.web.dto.ProductResponse;

public class ProductMapper {

    public static Product toDomain(ProductRequest request) {
        return new ProductBuilder()
                .name(request.getName())
                .quantity(request.getQuantity())
                .price(request.getPrice())
                .build();
    }

    public static ProductResponse toResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getQuantity(),
                product.getPrice()
        );
    }
}