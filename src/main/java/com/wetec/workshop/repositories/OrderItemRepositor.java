package com.wetec.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wetec.workshop.entities.OrderItem;

public interface OrderItemRepositor extends JpaRepository<OrderItem, Long> {
	

}
