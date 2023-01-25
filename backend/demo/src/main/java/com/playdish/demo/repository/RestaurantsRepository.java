package com.playdish.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.playdish.demo.entity.Restaurants;

@Repository
public interface RestaurantsRepository extends CrudRepository<Restaurants, String>{

    
}
