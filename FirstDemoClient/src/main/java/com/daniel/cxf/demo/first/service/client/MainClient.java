package com.daniel.cxf.demo.first.service.client;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.phase.Phase;

import com.daniel.cxf.demo.first.service.cxf.HelloService;
import com.daniel.cxf.demo.first.service.cxf.interceptors.MessageInterceptor;

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
		factory.setAddress("http://localhost:8080/HelloWorld");
		factory.setServiceClass(HelloService.class);
		
	//	factory.getInInterceptors().add(new LoggingInInterceptor()); 可选
	//	factory.getOutInterceptors().add(new LoggingOutInterceptor()); 可选
		
		factory.getInInterceptors().add(new MessageInterceptor(Phase.RECEIVE)); //自定义，recive只对输入有效
		factory.getOutInterceptors().add(new MessageInterceptor(Phase.SEND));//自定义,send只对输出有效

		
		HelloService helloWorld = (HelloService) factory.create();
		System.out.println(helloWorld.sayHi("zhuwei2"));
		
	}

}
