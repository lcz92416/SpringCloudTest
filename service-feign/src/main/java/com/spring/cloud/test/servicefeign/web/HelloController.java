package com.spring.cloud.test.servicefeign.web;

import com.spring.cloud.test.servicefeign.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    FeignClientService feignClientService;

    @RequestMapping(value="/hi",method = RequestMethod.GET)
    public String hello(@RequestParam String name){
        return feignClientService.helloService(name);
    }
}
