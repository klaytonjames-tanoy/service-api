package com.example.service_api.controller;

import com.example.service_api.model.User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Demo {

    @GetMapping("/hello")
    public User sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        // Create a User object
        User user = new User();
        user.setName(name);
        user.setAge(30); // Example age

        return user;
    }
}