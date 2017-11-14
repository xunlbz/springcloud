package com.example.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liuxun on 2017/11/9.
 */
@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error")
    public String home(String name){
        return restTemplate.getForObject("http://service-client1/home?name="+name,String.class);
    }


    public String error(String name){
        return "hi "+name+",调用service-client1出错，断路器触发";
    }
    public String defaultError(String name){
        return
    }
}
