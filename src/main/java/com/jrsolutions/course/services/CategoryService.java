package com.jrsolutions.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrsolutions.course.entities.Category;
import com.jrsolutions.course.repositories.CategoryRepository;

@Service //informammos ao spring que essa classe é um componente do tipo servico
public class CategoryService {
	
	@Autowired //declaramos a dependencia, o spring fará essa injeção
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
