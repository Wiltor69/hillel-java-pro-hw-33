package ua.hillel.spring.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderRepo extends PagingAndSortingRepository<Order, Long> {
    Page<Order> findAllByProductId(Long productId, Pageable pageable);
}
