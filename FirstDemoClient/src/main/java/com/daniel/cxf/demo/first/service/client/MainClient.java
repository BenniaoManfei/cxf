package com.daniel.cxf.demo.first.service.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.daniel.cxf.demo.first.service.cxf.HelloService;

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
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://localhost:8080/HelloWorld2");
		factory.setServiceClass(HelloService.class);
		HelloService helloWorld = (HelloService) factory.create();
		System.out.println(helloWorld.sayHi("zhuwei2"));
		
	}

}
