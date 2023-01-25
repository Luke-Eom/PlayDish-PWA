package com.playdish.demo.dto;

import com.playdish.demo.entity.Comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentDto {
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Request {
        private Long commentId;
        private String userNickName;
        private Long restoId;
        private String contents;
        private int commentLikeCount;

        public Comment toEntity(){
            Comment cmt = Comment.builder().commentId(commentId).userNickname(userNickName).restoId(restoId).contents(contents).commentLikeCount(commentLikeCount).build();
            return cmt;
        }
    }

    @Getter
    public static class Response {
        private Long commentId;
        private String userNickname;
        private Long restoId;
        private String contents;
        private int commentLikeCount;

        public Response(Comment cmt) {
            this.commentId = cmt.getCommentId();
            this.userNickname = cmt.getUserNickname();
            this.restoId = cmt.getRestoId();
            this.contents = cmt.getContents();
            this.commentLikeCount = cmt.getCommentLikeCount();
        }
    }
}
