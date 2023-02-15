package com.playdish.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.playdish.demo.entity.Restaurants;

public interface RestaurantsRepository extends CrudRepository<Restaurants, String>{

    Restaurants findByRestoName(String restoName);

    
}
