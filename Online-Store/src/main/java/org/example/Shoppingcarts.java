package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCarts {

    // Store products
    private List<Product> products;

    // Constructor
    public ShoppingCart() {
        products = new ArrayList<>();
    }

    // Add product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove product by SKU
    public boolean removeProductBySku(String sku) {

        for (Product product : products) {

            if (product.getSku().equalsIgnoreCase(sku)) {
                products.remove(product);
                return true;
            }
        }

        return false;
    }

    // Display cart
    public void displayCart() {

        if (products.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        for (Product product : products) {
            System.out.println(product);
        }

        System.out.printf("Cart Total: $%.2f%n", getTotal());
    }

    // Calculate total
    public double getTotal() {

        double total = 0;

        for (Product product : products) {
            total = total + product.getPrice();
        }

        return total;
    }

    // Clear cart
    public void clear() {
        products.clear();
    }
}