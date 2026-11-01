package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Online Store");

        InputStream input =
                Main.class.getResourceAsStream("/products.csv");

        if (input == null) {
            System.out.println("Products file not found.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(input, StandardCharsets.UTF_8))) {

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

            }

        } catch (IOException e) {

            System.out.println("Error reading products file.");
            System.out.println(e.getMessage());

        }
    }
}