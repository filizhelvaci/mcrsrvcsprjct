package com.flz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
public class ServiceAuthApp {
    public static void main(String[] args) {

        SpringApplication.run(ServiceAuthApp.class, args);
    }
}