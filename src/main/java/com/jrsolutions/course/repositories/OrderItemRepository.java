package com.jrsolutions.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrsolutions.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
