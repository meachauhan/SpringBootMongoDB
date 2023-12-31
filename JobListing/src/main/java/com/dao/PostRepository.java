package com.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
