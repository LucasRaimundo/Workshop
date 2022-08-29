package com.wetec.workshop.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wetec.workshop.entities.Categorys;
import com.wetec.workshop.entities.Orders;
import com.wetec.workshop.entities.Products;
import com.wetec.workshop.entities.Users;
import com.wetec.workshop.entities.enums.OrdersStatus;
import com.wetec.workshop.repositories.CategorysRepository;
import com.wetec.workshop.repositories.OrdersRepository;
import com.wetec.workshop.repositories.ProductsRepository;
import com.wetec.workshop.repositories.UsersRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private OrdersRepository ordersRepository;
	
	@Autowired
	private CategorysRepository categorysRepository;
	
	@Autowired
	private ProductsRepository productsRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Categorys cat1 = new Categorys(null, "Electronics"); 
		Categorys cat2 = new Categorys(null, "Books"); 
		Categorys cat3 = new Categorys(null, "Computers"); 
		
		
		
		Products p1 = new Products(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Products p2 = new Products(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Products p3 = new Products(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Products p4 = new Products(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Products p5 = new Products(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 

		categorysRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productsRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

		
		Users u1 = new Users(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		Users u2 = new Users(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		Orders o1 = new Orders(null, Instant.parse("2022-08-26T19:53:07Z"), OrdersStatus.PAID, u1); 
		Orders o2 = new Orders(null, Instant.parse("2022-08-26T03:42:10Z"), OrdersStatus.WAITING_PAYMENT, u2); 
		Orders o3 = new Orders(null, Instant.parse("2022-08-26T15:21:22Z"), OrdersStatus.WAITING_PAYMENT, u1); 

		
		usersRepository.saveAll(Arrays.asList(u1, u2));
		ordersRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	

}
