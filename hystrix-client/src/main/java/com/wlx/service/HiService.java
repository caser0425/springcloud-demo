package com.wlx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HiService {
	@Autowired
	private RestTemplate temp;
	//Hystrix的command注解,实现服务降级的逻辑
	//一旦当前方法调用的其他服务出现了连接断开,异常,延迟等等,都会采用
	//服务降级的逻辑
	@HystrixCommand(fallbackMethod="error")
	//fallbackMethod就是服务降级后调用的方法,调用一个error的方法
	//调用过程和调用sayHi是一样的,
	public String sayHi(String name) {
		String result=temp.getForObject("http://service-hi/hi?hello="
				+name, String.class);
		return result;
	}

	@HystrixCommand(fallbackMethod="error")
	public String error(String name){
		String result="出错啦";
		return result;
	}

}
