package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = (Student) app.getBean("myStudent");
		
		student.study();
		
		
	Person person = (Person) app.getBean("myPerson");
	person.HealthyPerson();
	}
}
