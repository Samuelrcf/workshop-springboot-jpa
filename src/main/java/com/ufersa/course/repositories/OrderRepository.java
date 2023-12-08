package com.ufersa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufersa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
