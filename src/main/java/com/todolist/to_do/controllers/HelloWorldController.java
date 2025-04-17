package com.todolist.to_do.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping()
    public String HelloWorld(){
        return "HELLO WORLD. FROM CONTROLLER";
    }

}
