package com.spring;

import org.springframework.stereotype.Component;

@Component(value = "myPerson")
public class Person {

	public void Dance() {
		System.out.println("Person is Dancing");
	}
}
