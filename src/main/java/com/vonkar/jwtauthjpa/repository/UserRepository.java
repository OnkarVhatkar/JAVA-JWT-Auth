package com.vonkar.jwtauthjpa.repository;

import com.vonkar.jwtauthjpa.entity.UserDAO;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDAO,Integer> {
    UserDAO findByUsernameIgnoreCaseAndActive(String username,boolean active);
}
