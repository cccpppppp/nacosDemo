package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/order")
    public String user(){
        return "Hello!" + restTemplate.getForObject("http://localhost:8020/order/reduce",String.class);
    }
}
