package com.playdish.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.playdish.demo.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
    
}
