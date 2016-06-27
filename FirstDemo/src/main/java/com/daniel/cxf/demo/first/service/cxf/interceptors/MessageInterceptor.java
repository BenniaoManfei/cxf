package com.daniel.cxf.demo.first.service.cxf.interceptors;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;

/**
 * 自定义消息拦截器
 *
 * @description 
 *
 * @author DaiZhengmiao
 * @createDate 2016年6月27日
 */
public class MessageInterceptor extends AbstractPhaseInterceptor<Message> {

	public MessageInterceptor(String phase) {
		super(phase);
	}

	public void handleMessage(Message message) throws Fault {
		System.out.println("############handleMessage##########");
		System.out.println(message);
		if (message.getDestination() != null) {
			System.out.println(message.getId() + "#" + message.getDestination().getMessageObserver());
		}
		if (message.getExchange() != null) {
			System.out.println(message.getExchange().getInMessage() + "#" + message.getExchange().getInFaultMessage());
			System.out.println(message.getExchange().getOutMessage() + "#" + message.getExchange().getOutFaultMessage());
		}
	}

}
