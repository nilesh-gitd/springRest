package com.springRest.repo;

import org.springframework.data.repository.CrudRepository;

import com.springRest.springRest1.User;

public interface UserReopsitory extends CrudRepository<User, Integer> {

}
