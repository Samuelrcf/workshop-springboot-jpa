package com.ufersa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufersa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
