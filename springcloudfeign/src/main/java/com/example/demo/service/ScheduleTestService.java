package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liuxun on 2017/11/9.
 */
@Service
@FeignClient(value = "service-client1")
public interface ScheduleTestService {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String getHomeFromClient1(@RequestParam(value = "name") String name);
}
