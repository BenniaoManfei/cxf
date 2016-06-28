package com.daniel.cxf.demo.first.model;

import java.io.Serializable;

public class Cat implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9202791140223341559L;
	private String color;
	private String name;
	public Cat(String color, String name) {
		super();
		this.color = color;
		this.name = name;
	}
	public Cat() {
		super();
	}
	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
