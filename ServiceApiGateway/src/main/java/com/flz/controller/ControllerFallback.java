package com.flz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//    http://localhost/fallback
@RequiredArgsConstructor
@RestController
@RequestMapping("/fallback")
public class ControllerFallback {


    //    http://localhost/fallback/user
    @GetMapping("/user")
    public ResponseEntity<String> fallbackUser (){
        return ResponseEntity.ok("Api Gateway'den msj: UserService ŞU AN GEÇİCİ OLARAK HİZMET VEREMEMEKTEDİR");
    }
    //    http://localhost/fallback/auth
    @GetMapping("/auth")
    public ResponseEntity<String> fallbackAuth (){
        return ResponseEntity.ok("Api Gateway'den msj: Auth Servis ŞU AN GEÇİCİ OLARAK HİZMET VEREMEMEKTEDİR");
    }

    //    http://localhost/fallback/buyer
    @GetMapping("/buyer")
    public ResponseEntity<String> fallbackBuyer (){
        return ResponseEntity.ok("Api Gateway'den msj: Buyer Servis ŞU AN GEÇİCİ OLARAK HİZMET VEREMEMEKTEDİR");
    }

    //    http://localhost/fallback/properties
    @GetMapping("/properties")
    public ResponseEntity<String> fallbackProperties (){
        return ResponseEntity.ok("Api Gateway'den msj: Properties Servis ŞU AN GEÇİCİ OLARAK HİZMET VEREMEMEKTEDİR");
    }
    //    http://localhost/fallback/agent
    @GetMapping("/agent")
    public ResponseEntity<String> fallbackAgent (){
        return ResponseEntity.ok("Api Gateway'den msj: Agent Servis ŞU AN GEÇİCİ OLARAK HİZMET VEREMEMEKTEDİR");
    }
}
