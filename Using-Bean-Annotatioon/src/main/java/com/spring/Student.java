package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	List<String> subjects;
	
	public void study() {
		System.out.println("Get Job");
		for (String sub : subjects) {
			System.out.println(sub);
		}
	}
}
