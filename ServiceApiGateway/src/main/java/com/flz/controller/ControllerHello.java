package com.flz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//    http://localhost:80
@RestController
@RequestMapping
public class ControllerHello {


    //    http://localhost:80/hello
    @GetMapping("/hello")
    public String hello (){
        return "Api Gateway Service Hello";
    }


    //    http://localhost:80/
    @GetMapping("/")
    public String info (){
        return "INFO: Apigateway Service";
    }
}
