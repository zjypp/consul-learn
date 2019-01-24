package com.zjy.cld.consulconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConsulConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConfigApplication.class, args);
    }

    //@Value("${foo.bar.name}")
    String name;

    @Value("${key1}")
    String key1;

    @GetMapping("/getname")
    public String getName(){
        return name + "-"+key1;
    }

    @RequestMapping("/actuator/health")
    public String health(){
        return "SUCCESS";
    }
}

