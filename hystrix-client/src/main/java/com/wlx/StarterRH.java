package com.wlx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class StarterRH {
	
	public static void main(String[] args) {
		SpringApplication.run(StarterRH.class, args);
		
	}
	//restTemplate对象
	@Bean
	@LoadBalanced
	public RestTemplate getSor(){
		return new RestTemplate();
	}
}
