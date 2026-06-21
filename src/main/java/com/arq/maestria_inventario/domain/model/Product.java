package com.arq.maestria_inventario.domain.model;

public class Product {
    private String id;
    private String name;
    private int quantity;
    private double price;

    // Cambiado a "package-private" (le quitamos el private)
    // para que ProductBuilder pueda invocarlo desde su propio archivo.
    Product(ProductBuilder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.quantity = builder.getQuantity();
        this.price = builder.getPrice();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}