package com.flz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerHello {


    //    http://localhost:9092/hello
    @GetMapping("/hello")
    public String hello (){
        return "AgentService Hello";
    }


    //    http://localhost:9092/info
    @GetMapping("/info")
    public String info (){
        return "INFO: AgentService";
    }
}
