package ua.hillel.spring.data;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Products")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "price")
    private double cost;
    @Column(name = "name")
    private String name;

}
