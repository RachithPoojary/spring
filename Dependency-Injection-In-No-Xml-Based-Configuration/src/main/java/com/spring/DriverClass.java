package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext cApp = new AnnotationConfigApplicationContext(AppConfig.class);
		Person person = (Person) cApp.getBean("person");
		person.Display();
		
		Student student = (Student) cApp.getBean("student");
		student.Display();
		
		Teacher teacher = (Teacher) cApp.getBean("teacher");
		teacher.Display();
	}

}
