package com.ttvartech.javatest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

    @GetMapping
    public String sayHello(){
        return "Welcome to the javatest application :)";
    }
}
