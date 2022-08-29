package com.wetec.workshop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wetec.workshop.entities.Categorys;
import com.wetec.workshop.services.CategorysService;

@RestController
@RequestMapping(value = "/categories")
public class CategorysResource {

	@Autowired
	private CategorysService service;
	
	@GetMapping
	public ResponseEntity<List<Categorys>> findAll() {
		List<Categorys> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categorys> findById(@PathVariable Long id){
		Categorys obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}