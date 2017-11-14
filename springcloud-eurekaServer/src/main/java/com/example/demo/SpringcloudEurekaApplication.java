package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaApplication {

	public static void main(String[] args) {
		System.out.println("启动Eureka服务注册中心");
		SpringApplication.run(SpringcloudEurekaApplication.class, args);
	}
}
