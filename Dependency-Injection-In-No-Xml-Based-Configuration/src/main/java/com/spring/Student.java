package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private String email;
	private int age;
	
	@Value(value = "Sanchit")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value(value="sanchit@gamil.com")
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Value(value="20")
	public void setAge(int age) {
		this.age = age;
	}
	
	public void Display() {
		System.out.println("Name = "+name);
		System.out.println("Email = "+email);
		System.out.println("Age = "+age);
		System.out.println("==========================================================");
	}
	
	

}
