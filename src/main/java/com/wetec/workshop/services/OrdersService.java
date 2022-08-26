package com.wetec.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wetec.workshop.entities.Orders;
import com.wetec.workshop.repositories.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository repository;
	
	public List<Orders> findAll(){
		return repository.findAll();
	}
	
	public Orders findById(Long id){
		Optional<Orders> obj = repository.findById(id);
		return obj.get();
	}
}
