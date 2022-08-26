package com.wetec.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wetec.workshop.entities.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
	

}
