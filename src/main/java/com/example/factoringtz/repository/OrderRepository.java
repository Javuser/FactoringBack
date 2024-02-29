package com.example.factoringtz.repository;

import com.example.factoringtz.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
