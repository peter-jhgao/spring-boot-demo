package com.example.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/spring")
    public String sayHello() {
        return "Hello CCE from CSE!";
    }
}
