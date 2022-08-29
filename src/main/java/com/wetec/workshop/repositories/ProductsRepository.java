package com.wetec.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wetec.workshop.entities.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {
	

}
