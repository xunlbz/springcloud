package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringcloudEurekaClientApplication {
	@Value("${spring.application.name}")
	private String server;
	@Value("${server.port}")
	private int port;
	@RequestMapping(value = "/home")
	public String home(@RequestParam String name){
		return "hi "+name+", 我是"+server+":"+port;

	}
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaClientApplication.class, args);
	}
}
