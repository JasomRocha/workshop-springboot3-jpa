package com.jrsolutions.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrsolutions.course.entities.User;
import com.jrsolutions.course.repositories.UserRepository;

@Service //informammos ao spring que essa classe é um componente do tipo servico
public class UserService {
	
	@Autowired //declaramos a dependencia, o spring fará essa injeção
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
