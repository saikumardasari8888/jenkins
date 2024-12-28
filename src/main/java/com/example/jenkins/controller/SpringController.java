package com.example.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {


    @GetMapping("/getMessage")
    public String getMessage(){
    return "hello world hello ";
    }

    @GetMapping("/greating/{name}")
    public String Message(@PathVariable("name") String name){
        return "hello "+name;
    }

    @GetMapping("/message")
    public String postMessage(){
        return "hello world";
    }
    @GetMapping("/saikumar")
    public String saiMessage(){
        return "hello saikumar";
    }


    @GetMapping("/hello")
    public String helloMessage(){
        return "hello message";
    }

    @GetMapping("/gali")
    public String galiMessage(){
        return "gali message";
    }


    @GetMapping("/getNaveen/{name}")
    public String NaveenMessage(@PathVariable("name") String name){
        return name + " message";
    }
}
