package com.sales.mobile.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String greetings(){
        return "Welcome to springboot web service";
    }

    @GetMapping(value = "/hi")
    public String sayHi(){
        return "Hello";
    }
}
