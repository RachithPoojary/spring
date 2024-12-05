package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student) cApp.getBean("student");
		student.Display();
		
		Person person = (Person) cApp.getBean("person");
		person.Display();
		
		Teacher teacher = (Teacher) cApp.getBean("teacher");
		teacher.Display();
	}

}
