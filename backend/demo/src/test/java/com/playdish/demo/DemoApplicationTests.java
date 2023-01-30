package com.playdish.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.playdish.demo.repository.RestaurantsRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	RestaurantsRepository restoRepo;

	
	@Test
	void contextLoads() {
		// new Restaurants a = ;
		// RestaurantDto.Response();
	}
}
