package com.daniel.cxf.demo.first.service.client;

import java.util.List;

import com.daniel.cxf.demo.first.service.cxf.impl.Hellossss;


/**
 * 发布webservice服务
 *
 * @description
 *
 * @author DaiZhengmiao
 * @createDate 2016年6月27日
 */
public class MainClient {
	public static void main(String[] args) {
	//	simple();
		mulity();
	}

	public static void simple() {
		Hellossss factory = new Hellossss();//当做工厂使用
		
		com.daniel.cxf.demo.first.service.cxf.HelloService helloService = factory.getHelloServiceImplPort();//getXXXPort
		
		System.out.println(helloService.sayHi("nihao"));
	}
	
	public static void mulity() {
		HelloService_Service factory = new HelloService_Service();
		com.daniel.cxf.demo.first.service.client.HelloService helloService = factory.getHelloServiceImplPort();
		System.out.println(helloService.sayHi("mulity"));
	//	List<Cat> cats = helloService.getCatsByUser(new User("DaiZhengmiao", "123456"));
	//	System.out.println(cats);
	}
}
