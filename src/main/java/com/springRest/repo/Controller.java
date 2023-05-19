package com.springRest.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.springRest1.User;

//import antlr.collections.List;

@RestController
@RequestMapping("api")
public class Controller {


 
    @Autowired
    private UserReopsitory userReopsitory;
    
//    public HelloWorldController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
    
    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userReopsitory.findAll();
    }
    
    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }
}

