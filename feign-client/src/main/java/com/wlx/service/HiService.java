package com.wlx.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//feign组件的声明式注解
//底层代理实现逻辑,就是生成一个restTemaplate
//访问其他服务,value的值就是服务的名称;
//当前接口的所有方法,都会在拼接getForObject(http://服务名称/地址
@FeignClient("service-hi")
public interface HiService {
	//底层实现的方法getForObejct,getForEntity.postForObject postForEntity
	//至少应该告知访问地址/hello,告知请求方式,get,post,参数类型
	//利用springmvc的注解 requestmapping requestParam
	@RequestMapping(value="hello",method=RequestMethod.GET)
	String sayHi(@RequestParam(value = "name") String name);

}
