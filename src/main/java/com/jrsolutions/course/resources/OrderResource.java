package com.jrsolutions.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrsolutions.course.entities.Order;
import com.jrsolutions.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders") //informamos que podemos enviar o mapping orders na url
public class OrderResource {
	
	@Autowired
	private OrderService service; //instanciamos o serviço injetando dependencia
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){ //minha requisição http
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findByid(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
 	
}
