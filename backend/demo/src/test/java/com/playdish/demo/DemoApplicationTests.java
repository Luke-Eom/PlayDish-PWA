package com.playdish.demo;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.playdish.demo.dto.RestaurantDto;
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

	@Test
	void modelMapperTest() {
		RestaurantDto restoDto = new RestaurantDto();
    	restoDto.setRestoId("12345");
   	 	restoDto.set("oing");
    	restoDto.set("동작구");
    
    	ModelMapper modelMapper = new ModelMapper();
    	EmployeeEntity employeeEntity = modelMapper.map(employeeDto, EmployeeEntity.class);
    
    	System.out.println(employeeEntity.getEmployeeId());
    	System.out.println(employeeEntity.getEmployeeName());
    	System.out.println(employeeEntity.getEmployeeAddr());
	}
}
