package com.daniel.cxf.demo.first.service.server;
//com.daniel.cxf.demo.first.service.client;
import javax.xml.ws.Endpoint;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.daniel.cxf.demo.first.service.cxf.HelloService;
import com.daniel.cxf.demo.first.service.cxf.impl.HelloServiceImpl;

/**
 * 发布webservice服务
 *
 * @description 
 *
 * @author DaiZhengmiao
 * @createDate 2016年6月27日
 */
public class MainServer {
	public static void main(String[] args) {
		publish1();
//		publish2();
	}
	
	/**
	 * 第一种发布方式：通过CXF提供的JaxWsServerFactoryBean来发布webservice  
	 *
	 *
	 * @author DaiZhengmiao
	 * @createDate 2016年6月27日
	 */
	public static void publish1(){
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setServiceClass(HelloServiceImpl.class);
		factory.setAddress("http://localhost:8080/");
		
		factory.getInInterceptors().add(new LoggingInInterceptor()); //可选
		factory.getOutInterceptors().add(new LoggingOutInterceptor());//可选
		
	//	factory.getInInterceptors().add(new MessageInterceptor(Phase.RECEIVE)); //自定义，recive只对输入有效
	//	factory.getOutInterceptors().add(new MessageInterceptor(Phase.SEND));//自定义,send只对输出有效

		
		Server server = factory.create();
		server.start();
	}
	/**
	 * 	第二种方式，通过JAX-WS提供的Endpoint来发布webservice  
		首先创建webservice服务提供类的实例  
	 *
	 *
	 * @author DaiZhengmiao
	 * @createDate 2016年6月27日
	 */
	public static void publish2() {
	
		HelloService implementor = new HelloServiceImpl();  
		String address = "http://localhost:8080/HelloWorld2";  
		Endpoint.publish("http://localhost:8080/", implementor);  
		//使用wsdl2java生成客户端相关代码
		//WSDL = Web service definition Language
	}
}
