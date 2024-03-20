package com.flz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/agent")
public class ControllerAgent {

    //    http://localhost:9090/hello
    @GetMapping("/hello")
    public String hello (){
        return "Agent Service Hello";
    }

//    // ****************** @AutoWired *************** //
//    private final ServiceAgent serviceAuth;
//
//    public ControllerAgent(ServiceAuth serviceAuth) {
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
//

}
