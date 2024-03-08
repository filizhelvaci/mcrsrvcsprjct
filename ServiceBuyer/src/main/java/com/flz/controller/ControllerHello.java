package com.flz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerHello {


    //    http://localhost:9093/hello
    @GetMapping("/hello")
    public String hello (){
        return "BuyerService Hello";
    }


    //    http://localhost:9093/info
    @GetMapping("/info")
    public String info (){
        return "INFO: BuyerService";
    }
}
