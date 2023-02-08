package com.playdish.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.playdish.demo.dto.RestaurantDto;
import com.playdish.demo.entity.Restaurants;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    @Mapping(target = "restoId", constant = "")
    RestaurantDto RestaurantToDto(Restaurants resto);

}
