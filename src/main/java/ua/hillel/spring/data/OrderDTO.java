package ua.hillel.spring.data;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderDTO {
    private Long id;
    private LocalDate date;
    private ProductDTO productDTO;

}
