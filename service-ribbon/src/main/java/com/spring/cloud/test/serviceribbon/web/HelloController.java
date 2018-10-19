package com.spring.cloud.test.serviceribbon.web;

import com.spring.cloud.test.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hello(@RequestParam String name){
        return helloService.helloService(name);
    }
}
