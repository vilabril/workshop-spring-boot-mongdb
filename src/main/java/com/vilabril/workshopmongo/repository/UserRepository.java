package com.vilabril.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vilabril.workshopmongo.domian.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
