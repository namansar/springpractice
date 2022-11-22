package com.deqode.backend2.springpractice.repository;

import com.deqode.backend2.springpractice.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String > {

    User findFirstByUsername(String username);
}
