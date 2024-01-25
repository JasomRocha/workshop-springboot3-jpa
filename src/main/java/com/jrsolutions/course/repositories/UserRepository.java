package com.jrsolutions.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrsolutions.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
