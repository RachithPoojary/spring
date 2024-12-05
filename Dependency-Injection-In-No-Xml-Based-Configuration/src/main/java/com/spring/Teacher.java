package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	String name;
	String email;
	int age;
	public Teacher(@Value(value = "Kashi") String name,@Value(value = "kashi@gmail.com") String email,@Value(value = "27") int age) {
		
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public void Display() {
		System.out.println("Name = "+name);
		System.out.println("Email = "+email);
		System.out.println("Age = "+age);
		System.out.println("==========================================================");
	}

}
