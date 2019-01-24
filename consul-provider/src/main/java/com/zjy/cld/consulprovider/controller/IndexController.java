package com.zjy.cld.consulprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class IndexController {

    @GetMapping("/actuator/health")
    public String health(){
        return "SUCCESS";
    }

    @GetMapping("/sayHello")
    public String sayHello(String name) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();

        return "hello ," + name + ", from provider1" + address.getHostAddress();


    }
}
