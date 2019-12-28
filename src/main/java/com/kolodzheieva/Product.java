package com.kolodzheieva;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder(toBuilder = true)
@ToString
@EqualsAndHashCode
public class Product {

    int id;
    String name;
    String description;
    Double price;

}
