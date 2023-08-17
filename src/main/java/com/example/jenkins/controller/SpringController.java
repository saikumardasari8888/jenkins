package com.example.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {


    @GetMapping("/getMessage")
    public String getMessage(){
        return "hello world hello";
    }

    @GetMapping("/greating/{name}")
    public String Message(@PathVariable("name") String name){
        return "hello "+name;
    }
}
