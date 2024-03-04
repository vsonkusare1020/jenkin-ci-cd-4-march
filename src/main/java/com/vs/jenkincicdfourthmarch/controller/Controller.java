package com.vs.jenkincicdfourthmarch.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/greet/{name}")
    public String greetings(@PathVariable String name){
        return "Hello "+ name + "Welcome";
    }
}
