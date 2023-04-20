package ua.hillel.spring.data;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepo productRepo;
    @Override
    public List<Product> getAllProduct() {
        Iterable<Product> all = productRepo.findAll();
        List<Product> products = new ArrayList<>();
        all.forEach(products::add);
        return products;

    }

    @Override
    public Product findProductByName(String name) {
        return productRepo.findByName(name);
    }
}
