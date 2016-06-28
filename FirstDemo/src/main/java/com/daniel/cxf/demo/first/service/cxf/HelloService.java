package com.daniel.cxf.demo.first.service.cxf;

import java.util.List;

import javax.jws.WebService;

import com.daniel.cxf.demo.first.model.Cat;
import com.daniel.cxf.demo.first.model.User;

/**
 * HelloService的接口
 *
 * @description 
 *
 * @author DaiZhengmiao
 * @createDate 2016年6月28日
 */
@WebService
public interface HelloService {

	public String sayHi(String name);
	
	public List<Cat> getCatsByUser(User user);
}
