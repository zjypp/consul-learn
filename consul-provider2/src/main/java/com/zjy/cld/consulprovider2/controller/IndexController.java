package com.zjy.cld.consulprovider2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/actuator/health")
    public String health(){
        return "SUCCESS";
    }

    @GetMapping("/sayHello")
    public String sayHello(String name){
        return "hello ," + name + ", from provider2";


    }
}
