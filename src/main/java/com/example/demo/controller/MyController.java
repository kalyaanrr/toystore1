package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class MyController {
    @GetMapping("/api/path")
    public String getMethodName() {
        return "Hello World, from Spring Boot!";
    }
    
}
