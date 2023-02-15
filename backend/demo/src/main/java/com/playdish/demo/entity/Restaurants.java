package com.playdish.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Setter
public class Restaurants implements Serializable, CommonEntity{
    @Id
    private String restoId;
    
    private String restoName;
    private Long latitude;
    private Long longitude;
    private String category;
    private int commentCount;
    @OneToMany(mappedBy = "restoId")
    private List<Comment> comments;
    

}
