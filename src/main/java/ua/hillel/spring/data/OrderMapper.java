package ua.hillel.spring.data;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;


@Mapper(componentModel = "spring")
public interface OrderMapper {
    @Mapping(source = "order", target = "order", qualifiedByName = "productToProductDTO")
    OrderDTO productToProductDTO(Product product);
    Product productToProductDTO(ProductDTO productDto);

    @Named("productToProductDTO")
    public static ProductDTO productToProductDTO(Product product) {
        return new ProductDTO(){{
            setName(product.getName());
        }};
    }

    Object productToProductDTO(Order order);
}
