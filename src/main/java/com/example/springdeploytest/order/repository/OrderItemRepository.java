package com.example.springdeploytest.order.repository;

import com.example.springdeploytest.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
