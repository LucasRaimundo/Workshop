package com.wetec.workshop.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wetec.workshop.entities.Orders;
import com.wetec.workshop.entities.Users;
import com.wetec.workshop.repositories.OrdersRepository;
import com.wetec.workshop.repositories.UsersRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private OrdersRepository ordersRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Users u1 = new Users(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		Users u2 = new Users(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		Orders o1 = new Orders(null, Instant.parse("2022-08-26T19:53:07Z"), u1); 
		Orders o2 = new Orders(null, Instant.parse("2022-08-26T03:42:10Z"), u2); 
		Orders o3 = new Orders(null, Instant.parse("2022-08-26T15:21:22Z"), u1); 

		
		usersRepository.saveAll(Arrays.asList(u1, u2));
		ordersRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	

}
