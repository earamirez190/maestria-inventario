package com.arq.maestria_inventario.domain.model;

public class ProductBuilder {
    private String id;
    private String name;
    private int quantity;
    private double price;

    public ProductBuilder id(String id) {
        this.id = id;
        return this;
    }

    public ProductBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder quantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ProductBuilder price(double price) {
        this.price = price;
        return this;
    }

    // Getters para que Product pueda leer los datos acumulados
    public String getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public Product build() {
        // Llama al constructor de la otra clase
        return new Product(this);
    }
}