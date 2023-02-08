package com.playdish.demo.service;

import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playdish.demo.dto.RestaurantDto;
import com.playdish.demo.entity.Restaurants;
import com.playdish.demo.mapper.RestaurantMapper;
import com.playdish.demo.repository.RestaurantsRepository;

@Service
public class RestaurantsServiceImpl implements RestaurantsService {

    @Autowired
    RestaurantsRepository restoRepo;
    
    @Transactional
    public ArrayList<RestaurantDto> getRestaurantsAll() throws Exception {
        ArrayList<Restaurants> restoList = (ArrayList<Restaurants>)restoRepo.findAll();
        ArrayList<RestaurantDto> allDto = new ArrayList<RestaurantDto>();
        for(Restaurants i : restoList) {
            allDto.add(RestaurantMapper.INSTANCE.RestaurantToDto(i));
        } 
        return allDto;
        // 모델 맵퍼 사용 방법 -> entity/ dto 매칭     
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
        // TODO Auto-generated method stub 이름검색 - 비슷한 이름 및 없는결과 가져올시 exception 처리
        return null;
    }

    @Override
    public boolean addRestaurant(RestaurantDto restaurant) throws Exception {
        // TODO Auto-generated method stub - 로그인 구현 후 권한에따라
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
