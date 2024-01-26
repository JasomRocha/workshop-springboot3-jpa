package com.jrsolutions.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrsolutions.course.entities.Product;
import com.jrsolutions.course.services.ProductService;

@RestController
@RequestMapping(value = "/products") //O recurso irá trazer 
public class ProductResource {
	
	@Autowired //Dependencia do service respeitando a estrutura em layers
	private ProductService service;
	
	@GetMapping //esse retorno é um tipo especifico do spring que retorna respostas de requisições web
	public ResponseEntity<List<Product>> findAll(){ //Response entity é um tipo generics e retorna um tipo, no nosso casa retornaremos o tipo user, usuario 
		List<Product> list = service.findAll();
		
		return ResponseEntity.ok().body(list); //ok retorna a reposta com sucesso, retorna o corpo da resposta, o que vai aparecer no corpo da mensagem
	}
	
	@GetMapping(value = "/{id}") //informo que a minha url irá com uma requisição, que é o id
	public ResponseEntity<Product> findByid(@PathVariable Long id){ //anotation pathvariable informando que esse parametro sera enviado pela url
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
 	
}
