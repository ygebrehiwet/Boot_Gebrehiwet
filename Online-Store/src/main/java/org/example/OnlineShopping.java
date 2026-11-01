package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShopping {

    private List<Product> products;
    private ShoppingCart cart;
    private Scanner scanner;

    // Constructor
    public OnlineShopping(List<Product> products) {

        this.products = products;
        this.cart = new ShoppingCart();
        this.scanner = new Scanner(System.in);
    }

    // Start the store
    public void start() {
        homeMenu();
    }

    // 1. Home menu
    public void homeMenu() {

        boolean running = true;

        while (running) {

            System.out.println("\n===== ONLINE STORE =====");
            System.out.println("1. Display Products");
            System.out.println("2. Display Cart");
            System.out.println("3. Exit");

            int choice = readInt("Choose an option: ");

            switch (choice) {

                case 1:
                    productsMenu();
                    break;

                case 2:
                    cartMenu();
                    break;

                case 3:
                    System.out.println("Thank you for shopping!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    // 2. Products menu
    public void productsMenu() {

        boolean back = false;

        while (!back) {

            System.out.println("\n===== PRODUCTS =====");
            System.out.println("1. Display All Products");
            System.out.println("2. Search by Name");
            System.out.println("3. Search by Price Range");
            System.out.println("4. Search by Department");
            System.out.println("5. Add Product to Cart");
            System.out.println("6. Go Back");

            int choice = readInt("Choose an option: ");

            switch (choice) {

                case 1:
                    displayProducts(products);
                    break;

                case 2:
                    searchByName();
                    break;

                case 3:
                    searchByPrice();
                    break;

                case 4:
                    searchByDepartment();
                    break;

                case 5:
                    AddProductToCart();
                    break;

                case 6:
                    back = true;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }