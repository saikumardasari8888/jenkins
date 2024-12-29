package com.example.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    @GetMapping("/getSai/{message}")
    public String getMessage(@PathVariable("message") String message){
    return String.format("hello world :: %s", message);
    }
    @GetMapping("/getZango")
    public String getZango(){
        return "hello world";
    }

}
