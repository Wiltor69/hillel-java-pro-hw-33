package ua.hillel.spring.data;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private double cost;
}
