package com.wetec.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wetec.workshop.entities.Users;
import com.wetec.workshop.repositories.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository repository;
	
	public List<Users> findAll(){
		return repository.findAll();
	}
	
	public Users findById(Long id){
		Optional<Users> obj = repository.findById(id);
		return obj.get();
	}
}
