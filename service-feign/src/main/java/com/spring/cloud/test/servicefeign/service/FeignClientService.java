package com.spring.cloud.test.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eureka-client",fallback = SchedualServiceHiHystric.class)
public interface FeignClientService {
    @RequestMapping(value="/hi",method=RequestMethod.GET)
    String helloService(@RequestParam(value = "name") String name);
}
