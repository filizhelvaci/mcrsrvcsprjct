package com.flz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/buyer")
public class ControllerBuyer {

//    // ****************** @AutoWired *************** //
//    private final ServiceAuth serviceAuth;
//
//    public ControllerBuyer(ServiceAuth serviceAuth) {
//        this.serviceAuth = serviceAuth;
//    }
//
//    // *******************    ********************* //
//
//    //    http://localhost:9090/auth/register
//    @PostMapping(EndPoint.REGISTER)
//    public ResponseEntity<DoRegisterResponseDto> doRegister(@RequestBody DoRegisterRequestDto dto){
//        System.out.println("DTO: " +  dto);
//        return ResponseEntity.ok(serviceAuth.doRegister(dto));
//    }
//
//    //    http://localhost:9090/auth/login
//    @PostMapping(EndPoint.LOGIN)
//    public ResponseEntity<Auth> doLogin(@RequestBody DoLoginRequestDto dto){
//        System.out.println("DTO: " +  dto);
//        return ResponseEntity.ok(serviceAuth.doLogin(dto));
//    }
//
//    public ResponseEntity<List<Auth>> findAll()   {
//        return ResponseEntity.ok(serviceAuth.findAll());
//    }
//
//
//    public ResponseEntity<String> getMessage(){
//        return ResponseEntity.ok("AuthServis mesaji");
//    }


}
