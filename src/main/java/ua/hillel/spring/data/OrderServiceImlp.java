package ua.hillel.spring.data;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class OrderServiceImlp implements OrderService{
    private final OrderRepo orderRepo;
    private final OrderMapper orderMapper;
    @Override
    public List<OrderDTO> getAllOrdersForPage(int num, int count) {
        Pageable criteria = PageRequest.of(num, count);
        Page<Order> orderPage = orderRepo.findAll(criteria);
        return orderPage.get()
                .map(orderMapper::productToProductDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderDTO> getProductsByOrdersForPage(Long orderId, int num, int count) {

        Pageable criteria = PageRequest.of(num, count);
        Page<Order> page = orderRepo.findAllByProductId(orderId, criteria);
        return page.get()
                .map(orderMapper::productToProductDTO)
                .collect(Collectors.toList());
    }
}
