package com.playdish.demo.service;

import java.util.ArrayList;

import com.playdish.demo.dto.RestaurantDto;

public interface RestaurantsService {
    ArrayList<RestaurantDto> getRestaurantsAll() throws Exception;

    RestaurantDto getRestaurantByRestoName(String restoName) throws Exception;

    boolean addRestaurant(RestaurantDto restaurant) throws Exception;
	
	boolean updateRestaurant(String RestaurantId, String category) throws Exception;
	
	boolean deleteRestaurant(String RestaurantId) throws Exception;
}
