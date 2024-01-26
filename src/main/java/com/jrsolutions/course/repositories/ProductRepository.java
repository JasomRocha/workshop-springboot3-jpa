package com.jrsolutions.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrsolutions.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
