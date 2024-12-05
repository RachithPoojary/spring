package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Value(value = "1000")
	int cc;
	
	public void Start() {
		System.out.println("Engine = "+ cc);
		System.out.println("Buuuuuuuuuurrrrrrrrrrrrrrrrrrrrr");
	}

}
