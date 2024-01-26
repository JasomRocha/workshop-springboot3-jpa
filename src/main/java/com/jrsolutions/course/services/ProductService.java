package com.jrsolutions.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrsolutions.course.entities.Product;
import com.jrsolutions.course.repositories.ProductRepository;

@Service //informammos ao spring que essa classe é um componente do tipo servico
public class ProductService {
	
	@Autowired //declaramos a dependencia, o spring fará essa injeção
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
