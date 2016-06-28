package com.daniel.cxf.demo.first.model;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -225549266689753107L;
	private int age;
	private String name;
	private String pass;
	private String address;
	
	
	public User() {
		super();
	}
	public User(int age, String name, String pass, String address) {
		super();
		this.age = age;
		this.name = name;
		this.pass = pass;
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", pass=" + pass
				+ ", address=" + address + "]";
	}
	
	
}
