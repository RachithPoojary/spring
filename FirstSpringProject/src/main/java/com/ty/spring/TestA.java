package com.ty.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student) app.getBean("myStudent");
		student.bunk();
	}

}
