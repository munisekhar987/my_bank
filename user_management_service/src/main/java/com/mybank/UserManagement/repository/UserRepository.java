package com.mybank.UserManagement.repository;

import com.mybank.UserManagement.User.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
    public User findByUsername(String username);
}
