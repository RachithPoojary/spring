package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value="Rachith")
	String name;
	@Value(value="20")
	int age;
	
	
	public void Display() {
		System.out.println("Name = "+name);
		System.out.println("Age = "+ age);
	}

}
