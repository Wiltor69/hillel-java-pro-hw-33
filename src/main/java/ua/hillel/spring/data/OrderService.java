package ua.hillel.spring.data;

import java.util.List;

public interface OrderService {


    List<OrderDTO> getAllOrdersForPage(int num, int count);
    List<OrderDTO> getProductsByOrdersForPage(Long orderId, int num, int count);
}
