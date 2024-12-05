package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
//	@Value(value = "TATA")
	String brand;
	
//	@Autowired
	Engine engine;

//	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

public Car(@Value(value = "TATA") String brand,@Autowired Engine engine) {
	this.brand = brand;
	this.engine = engine;
}
	
	
	
	public void Drive() {
		System.out.println("Car started");
		engine.start();
	}
	
	
	
	

}
