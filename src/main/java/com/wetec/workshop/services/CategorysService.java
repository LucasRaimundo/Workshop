package com.wetec.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wetec.workshop.entities.Categorys;
import com.wetec.workshop.repositories.CategorysRepository;

@Service
public class CategorysService {

	@Autowired
	private CategorysRepository repository;
	
	public List<Categorys> findAll(){
		return repository.findAll();
	}
	
	public Categorys findById(Long id){
		Optional<Categorys> obj = repository.findById(id);
		return obj.get();
	}
}
