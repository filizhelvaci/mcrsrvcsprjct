package com.flz.controller;

import com.flz.constant.EndPoint;
import com.flz.dto.request.DoLoginRequestDto;
import com.flz.dto.request.DoRegisterRequestDto;
import com.flz.dto.response.DoRegisterResponseDto;
import com.flz.model.Auth;
import com.flz.service.ServiceAuth;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class ControllerAuth {

    // ****************** @AutoWired *************** //
    private final ServiceAuth serviceAuth;

    public ControllerAuth(ServiceAuth serviceAuth) {
        this.serviceAuth = serviceAuth;
    }

    // *******************    ********************* //

    //    http://localhost:9090/auth/register
    @PostMapping(EndPoint.REGISTER)
    public ResponseEntity<DoRegisterResponseDto> doRegister(@RequestBody DoRegisterRequestDto dto){
        System.out.println("DTO: " +  dto);
        return ResponseEntity.ok(serviceAuth.doRegister(dto));
    }

    //    http://localhost:9090/auth/login
    @PostMapping(EndPoint.LOGIN)
    public ResponseEntity<Auth> doLogin(@RequestBody DoLoginRequestDto dto){
        System.out.println("DTO: " +  dto);
        return ResponseEntity.ok(serviceAuth.doLogin(dto));
    }

    //    http://localhost:9090/auth/getall
    @GetMapping("/getall")
    public ResponseEntity<  List<Auth>> findAll()   {
        return ResponseEntity.ok(serviceAuth.findAll());
    }


    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("AuthServis mesaji");
    }


}
