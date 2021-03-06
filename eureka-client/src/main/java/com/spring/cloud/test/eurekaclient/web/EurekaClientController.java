package com.spring.cloud.test.eurekaclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String EurekaClient(@RequestParam(value="name",defaultValue = "EurekaClient")String name){
        return "hi " + name +",i am from port:" + port;
    }
}
