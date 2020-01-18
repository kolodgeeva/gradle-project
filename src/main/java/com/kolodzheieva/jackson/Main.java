package com.kolodzheieva.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kolodzheieva.data.Product;

import java.io.File;
import java.io.IOException;

public class Main {
    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static void main(String[] args) {

        Product product = Product.builder()
                .id(1)
                .name("some product")
                .build();

        File file = new File("product.json");

        /*try {
            OBJECT_MAPPER.writeValue(file, product);
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        try {
            Product product1 = OBJECT_MAPPER.readValue(file, Product.class);
            System.out.println(product1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
