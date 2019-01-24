package com.zjy.cld.consulconsumer.controller;

import com.zjy.cld.consulconsumer.client.Helloservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    Helloservice helloservice;

    @RequestMapping("/actuator/health")
    public String health(){
        return "SUCCESS";
    }

    @RequestMapping("/hello")
    public String hello(String name){
        return  helloservice.sayHello(name);
    }
}
