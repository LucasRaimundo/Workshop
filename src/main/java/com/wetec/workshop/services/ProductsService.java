package com.wetec.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wetec.workshop.entities.Products;
import com.wetec.workshop.repositories.ProductsRepository;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository repository;
	
	public List<Products> findAll(){
		return repository.findAll();
	}
	
	public Products findById(Long id){
		Optional<Products> obj = repository.findById(id);
		return obj.get();
	}
}
