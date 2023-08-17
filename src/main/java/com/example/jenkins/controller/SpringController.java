package com.example.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {


    @GetMapping("/getMessage")
    public String getMessage(){
        return "hello world";
    }
}
