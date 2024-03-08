package com.flz.controller;

import com.flz.dto.request.UserProfileSaveRequestDto;
import com.flz.model.UserProfile;
import com.flz.service.ServiceUserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class ControllerUserProfile {

    private final ServiceUserProfile serviceUserProfile;

    // http://localhost:9091/user/slm
    @GetMapping("/slm")
    public String slm()
    {
        return "User Profile slm diyor :) ";
    }

    @PostMapping("/save")
    public ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto) {
        serviceUserProfile.save(dto);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @GetMapping("/getall")
    public ResponseEntity<  List<UserProfile>> findAll()   {
        return ResponseEntity.ok(serviceUserProfile.findAll());
    }

}
