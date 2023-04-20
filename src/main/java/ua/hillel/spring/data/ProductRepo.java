package ua.hillel.spring.data;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
    Product findByName(String name);
}
