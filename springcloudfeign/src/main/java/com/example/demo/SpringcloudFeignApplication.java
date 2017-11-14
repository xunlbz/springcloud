package com.example.demo;

import com.example.demo.service.ScheduleTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class SpringcloudFeignApplication {

	@Autowired
	ScheduleTestService scheduleTestService;
	@RequestMapping(value = "/feignHome",method = RequestMethod.GET)
	public String getHome(String name){
		return scheduleTestService.getHomeFromClient1(name);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudFeignApplication.class, args);
	}
}
