package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cApp = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = (Student) cApp.getBean("student");
		student.study();
	}
}
