package com.spring;

public class Student {
	
	public Student() {
		System.out.println("Object of student has been created");
		
	}
	
	public void init() {
		System.out.println("Init method has been invoked");
	}

	public void destroy() {
		System.out.println("Destroy method has been invoked");
	}
}
