package com.wlx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringBootApplication
@EnableZuulProxy
public class StarterZuul01 {
	public static void main(String[] args) {
		SpringApplication.run(StarterZuul01.class, args);
	}
}
