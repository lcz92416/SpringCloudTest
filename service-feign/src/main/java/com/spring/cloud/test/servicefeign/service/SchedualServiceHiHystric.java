package com.spring.cloud.test.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric  implements FeignClientService {

    @Override
    public String helloService(String name) {
        return "hi,"+name+",sorry,error!-->service-feign";
    }
}
