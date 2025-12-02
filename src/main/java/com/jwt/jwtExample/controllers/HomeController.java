package com.jwt.jwtExample.controllers;

import com.jwt.jwtExample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUser(){
        System.out.println("getting users");
        return userService.getUsers().toString();
    }

}
