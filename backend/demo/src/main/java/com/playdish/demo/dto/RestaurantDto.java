package com.playdish.demo.dto;

import com.playdish.demo.entity.Restaurants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class RestaurantDto {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Request {
        private String restoId;
        private String restoName;
        private Long latitude;
        private Long longitude;
        private String category;
        private int commentCount;

        public Restaurants toEntity() {
            Restaurants resto = Restaurants.builder().restoId(restoId).restoName(restoName).latitude(latitude).longitude(longitude).category(category).commentCount(0).build();
            return resto;
        }
    }

    @Getter
    public static class Response {
        private String restoId;
        private String restoName;
        private Long latitude;
        private Long longitude;
        private String category;
        private int commentCount;

        public Response(Restaurants resto) {
            this.restoId = resto.getRestoId();
            this.restoName = resto.getRestoName();
            this.latitude = resto.getLatitude();
            this.longitude = resto.getLongitude();
            this.category = resto.getCategory();
            this.commentCount = resto.getCommentCount();
        }
    }

}
