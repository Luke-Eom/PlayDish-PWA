package com.playdish.demo.service;

import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playdish.demo.dto.RestaurantDto;
import com.playdish.demo.entity.Restaurants;
import com.playdish.demo.repository.RestaurantsRepository;

@Service
public class RestaurantsServiceImpl implements RestaurantsService {

    @Autowired
    RestaurantsRepository restoRepo;

    @Transactional
    public ArrayList<RestaurantDto> getRestaurantsAll() throws Exception {
        ArrayList<Restaurants> restoList = (ArrayList<Restaurants>)restoRepo.findAll();

        return restoList.stream().map(Restaurants -> ModelMapperUtils.getModelMapper().map(Restaurants, RestaurantDto.class)).collect(Collectors.toList());
        // ArrayList<Restaurants> all = (ArrayList<Restaurants>)restoRepo.findAll();
        // ArrayList<RestaurantDto> allDto = new ArrayList<RestaurantDto>();
        // for(Restaurants i :all) {
            
        //     allDto.add(new RestaurantDto.Response(i));
        // }
        // return allDto;

        // for(Restaurants i : all) {
        //     allDto.add(RestaurantDto.Request.builder()
        //         .restoId(i.getRestoId())
        //         .restoName(i.getRestoName())
        //         .latitude(i.getLatitude())
        //         .longitude(i.getLongitude())
        //         .category(i.getCategory())
        //         .commentCount(i.getCommentCount())
        //         .build());
        // }
        // return null;
    }

    @Override
    public RestaurantDto getRestaurantByRestoName(String restoName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean addRestaurant(RestaurantDto restaurant) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateRestaurant(String RestaurantId, String category) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteRestaurant(String RestaurantId) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    
}
