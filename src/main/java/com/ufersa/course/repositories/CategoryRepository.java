package com.ufersa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufersa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
