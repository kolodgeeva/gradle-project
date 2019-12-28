package com.kolodzheieva;

public class Main {

    public static void main(String[] args) {

        Product product = Product.builder().build();

        Product product1 = Product.builder()
                .id(1)
                .build();

        Product product2 = Product.builder()
                .id(1)
                .name("name")
                .build();

        Product product3 = Product.builder()
                .id(1)
                .name("name")
                .description("desc")
                .build();

        Product product42 = Product.builder()
                .id(product3.id)
                .name(product3.name)
                .description(product3.description)
                .build();

        Product product4 = product3.toBuilder()
                .price(10.0)
                .build();

    }
}
