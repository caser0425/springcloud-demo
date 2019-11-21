package com.wlx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
//启动eureka注册中心的进程
@EnableEurekaClient
public class StarterEurekaClient03 {
	public static void main(String[] args) {
		SpringApplication.run(StarterEurekaClient03.class, args);
	}
}
