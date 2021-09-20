package com.vilabril.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vilabril.workshopmongo.domian.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	
}
