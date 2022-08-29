package com.wetec.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wetec.workshop.entities.Categorys;

public interface CategorysRepository extends JpaRepository<Categorys, Long> {
	

}
