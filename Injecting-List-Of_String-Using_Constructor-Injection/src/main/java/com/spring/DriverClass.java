package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cApp = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student) cApp.getBean("myStudent");
		student.Display();
	}
}
