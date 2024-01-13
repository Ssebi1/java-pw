package com.sebi.deliver.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@ToString
@Data
@Entity @Table(name = "products")
public class Product {
    @Id
    @SequenceGenerator(name = "products_sequence", sequenceName = "products_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_sequence")
    private Long id;

    @NonNull
    private String name;

    private String description;

    @NonNull
    private Double price;

    private Double salePrice;

    private Double weight;

    @Column( length = 100000)
    private String imageUrl = "https://images.pexels.com/photos/1640777/pexels-photo-1640777.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940";
}
