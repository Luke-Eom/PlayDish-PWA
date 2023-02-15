package com.playdish.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Comment {
    @Id
    private Long commentId;
    private String RestoName;
    private String userNickname;
    private Long restoId;
    private String contents;
    private int commentLikeCount;
}

