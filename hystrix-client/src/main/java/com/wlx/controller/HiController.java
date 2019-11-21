package com.wlx.controller;

import com.wlx.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	
	@Autowired
	private HiService hiService;
	@RequestMapping("hi")
	public String sayHi(String name){
		String result=hiService.sayHi(name);
		return "RIBBON+HYSTRIX:"+result;
	}
}
