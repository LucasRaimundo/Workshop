package com.wetec.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wetec.workshop.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	

}
