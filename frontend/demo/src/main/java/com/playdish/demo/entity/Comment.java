package com.playdish.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Comment {
    private Long commentId;
    private String RestoName;
    private String userNickname;
    private String contents;
}
