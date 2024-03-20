package com.flz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class ControllerHello {


    //    http://localhost:9091/hello
    @GetMapping("/hello")
    public String hello (){
        return "User Profile Service Hello";
    }


    //    http://localhost:9091/info
    @GetMapping("/info")
    public String info (){
        return "INFO: User Profile Service";
    }
}
