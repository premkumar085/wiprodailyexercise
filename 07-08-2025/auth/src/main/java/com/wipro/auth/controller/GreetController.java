package com.wipro.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello from Greet";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Prem";
    }
}