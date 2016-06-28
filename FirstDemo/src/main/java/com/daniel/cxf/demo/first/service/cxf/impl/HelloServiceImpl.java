package com.daniel.cxf.demo.first.service.cxf.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.daniel.cxf.demo.first.model.Cat;
import com.daniel.cxf.demo.first.model.User;
import com.daniel.cxf.demo.first.service.cxf.HelloService;


/**
 * helloService的具体实现
 *
 * @description 
 *
 * @author DaiZhengmiao
 * @createDate 2016年6月28日
 */
@WebService(
		endpointInterface="com.daniel.cxf.demo.first.service.cxf.HelloService",
		serviceName="helloService"
	)
public class HelloServiceImpl implements HelloService {

	public String sayHi(String name) {
		System.out.println("服务器输出:Your Name is :+"+name);
		return "hello,CXF,"+name;
	}

	public List<Cat> getCatsByUser(User user) {
		System.out.println("服务器输出:+"+user);
		User ow = new User();
		ow.setName("DaiZhengmiao");
		ow.setPass("123456");
		
		List<Cat> cats = new ArrayList<Cat>();
		if(ow.equals(user)){
			cats.add(new Cat("白色","Tom"));
			cats.add(new Cat("黑色","Jerry"));
		} else{
			cats.add(new Cat("灰色","流浪猫"));
		}
		return cats;
	}

}
