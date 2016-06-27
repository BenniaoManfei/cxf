package com.daniel.cxf.demo.first.service.cxf;

import javax.jws.WebService;

@WebService
public interface HelloService {

	public String sayHi(String name);
	
}
