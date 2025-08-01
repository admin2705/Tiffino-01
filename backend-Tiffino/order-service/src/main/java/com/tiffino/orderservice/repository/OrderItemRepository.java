package com.tiffino.orderservice.repository;

import com.tiffino.orderservice.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

    List<OrderItem> findByOrder_Id(Long orderId);

}
