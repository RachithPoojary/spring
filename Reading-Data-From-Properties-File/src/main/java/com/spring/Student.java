package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value(value = "${name}")
	String name;
	
	@Value(value = "${email}")
	String email;
	
	public void display() {
		System.out.println("Name : "+ name);
		System.out.println("Email : "+email);
		
	}
}
