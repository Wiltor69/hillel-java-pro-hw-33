package ua.hillel.spring.data;


import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product findProductByName(String name);
}
