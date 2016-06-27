package com.daniel.cxf.demo.first.service.cxf.impl;

import javax.jws.WebService;

import com.daniel.cxf.demo.first.service.cxf.HelloService;

@WebService
public class HelloServiceImpl implements HelloService {

	public String sayHi(String name) {
		System.out.println("Your Name is :+"+name);
		return "hello,CXF,"+name;
	}

}
