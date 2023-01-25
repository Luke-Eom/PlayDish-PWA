package com.playdish.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Restaurants {
    @Id
    private String restoId;
    
    private String restoName;
    private Long latitude;
    private Long longitude;
    private String category;
    private int commentCount;
    @OneToMany
    private List<Comment> comments; 
}