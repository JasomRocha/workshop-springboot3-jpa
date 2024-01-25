package com.jrsolutions.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrsolutions.course.entities.Category;
import com.jrsolutions.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories") //O recurso irá trazer 
public class CategoryResource {
	
	@Autowired //Dependencia do service respeitando a estrutura em layers
	private CategoryService service;
	
	@GetMapping //esse retorno é um tipo especifico do spring que retorna respostas de requisições web
	public ResponseEntity<List<Category>> findAll(){ //Response entity é um tipo generics e retorna um tipo, no nosso casa retornaremos o tipo user, usuario 
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list); //ok retorna a reposta com sucesso, retorna o corpo da resposta, o que vai aparecer no corpo da mensagem
	}
	
	@GetMapping(value = "/{id}") //informo que a minha url irá com uma requisição, que é o id
	public ResponseEntity<Category> findByid(@PathVariable Long id){ //anotation pathvariable informando que esse parametro sera enviado pela url
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
 	
}
