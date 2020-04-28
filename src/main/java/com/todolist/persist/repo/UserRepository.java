package com.todolist.persist.repo;/*
 *@created 27/04/2020
 *@author timashvayko9
 */

import com.todolist.persist.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    boolean existsByUsername(String username);

    Optional<User> getUserByUsername(String username);
}
