package com.ufersa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufersa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
