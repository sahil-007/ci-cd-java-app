package com.example.javaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class JavaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaAppApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from Java Spring Boot App!";
    }
}

