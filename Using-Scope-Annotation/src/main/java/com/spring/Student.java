package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Student {

	public void study() {
		System.out.println("Get Job");
		
	}
}
