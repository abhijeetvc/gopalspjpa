package com.gopalspringjpa.gopalspjpa.controller;

import com.gopalspringjpa.gopalspjpa.model.User;
import com.gopalspringjpa.gopalspjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/save")
    public String addUser(@RequestBody User user){
        userRepository.save(user);
        return "USer added successfully";
    }
}
