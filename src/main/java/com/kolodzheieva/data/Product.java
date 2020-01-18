package com.kolodzheieva.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder(toBuilder = true)
@ToString
@EqualsAndHashCode
public class Product {

    public int id;
    public String name;

    @JsonIgnore
    public String description;

    public Double price;

}
