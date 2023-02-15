package com.playdish.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.playdish.demo.dto.RestaurantDto;
import com.playdish.demo.entity.Restaurants;
import com.playdish.demo.mapper.RestaurantMapper;
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
	public void restoMapStructTest() {
		Restaurants resto = new Restaurants();
		resto.setRestoId("d1");
		resto.setRestoName("pd");
		ArrayList<Restaurants> restoList = (ArrayList<Restaurants>)restoRepo.findAll();
        ArrayList<RestaurantDto> allDto = new ArrayList<RestaurantDto>();
        for(Restaurants i : restoList) {
            allDto.add(RestaurantMapper.INSTANCE.RestaurantToDto(i));
        }
	}

	@Test
	public void restoSearchByName(String restoName) {
		Restaurants resto = new Restaurants();
		resto.setRestoId("d1");
		resto.setRestoName("pd");
		restoName = "pd";
		Restaurants restoEntity = restoRepo.findByRestoName(restoName);
        RestaurantDto restoDto = RestaurantMapper.INSTANCE.RestaurantToDto(restoEntity);
		restoDto.getClass();

	}
}

// assert~(); 테스트하려는 객체들이 일치하는지 확인
