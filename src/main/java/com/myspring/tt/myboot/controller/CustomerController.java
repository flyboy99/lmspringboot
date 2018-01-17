package com.myspring.tt.myboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspring.tt.myboot.domain.TestProperties;
import com.myspring.tt.myboot.domain.User;

@RestController
public class CustomerController {
	
	@RequestMapping("/hello")
	public String index(){
		return "hello world";
	}
	
	@RequestMapping("/getUser")
    public User getUser(){
		User user = new User();
		user.setName("xiaoliang");
		user.setPwd("123");
		return user;
	}
	
	@RequestMapping("/getProp")
	public TestProperties getProperties(){
		TestProperties prop = new TestProperties();
		System.out.println("获得的prop 是：" + prop.toString());
		return prop;
	}

}
