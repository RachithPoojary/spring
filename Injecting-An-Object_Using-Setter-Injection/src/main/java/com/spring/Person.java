package com.spring;

public class Person {
	
	private String name;
	private Mobile mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public void Display() {
		System.out.println(name+" is using this mobile.");
		System.out.println("He uses "+mobile.getBrand());
		mobile.ring();
	}
	
	

}
