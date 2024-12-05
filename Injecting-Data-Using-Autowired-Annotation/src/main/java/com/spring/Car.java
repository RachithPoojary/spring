package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Value(value = "TATA")
	String Brand;
	@Autowired
	Engine engine;
	
	public void drive() {
		System.out.println("Brand = "+ Brand);
		engine.Start();
		System.out.println("Long Drive");
	}
	
}
