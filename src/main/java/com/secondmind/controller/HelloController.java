package com.secondmind.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // tells Spring this class handles HTTP requests
public class HelloController {

    @GetMapping("/hello")  // maps GET requests at localhost:8080/hello
    public String sayHello() {
        return "Hello, Second Mind Journal!";
    }
}
