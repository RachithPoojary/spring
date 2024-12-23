package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("config1.xml");
		
		Student student = (Student) app.getBean("myStudent");
		
		student.study();
		
		Person person = (Person) app.getBean("myPerson");
		person.HealthyPerson();
		
		
		ApplicationContext app1 = new ClassPathXmlApplicationContext("config2.xml");
		
		Student student1 = (Student) app1.getBean("myStudent");
		student1.study();
		
		/*
		 * Person person1 = (Person) app1.getBean("myPerson");
		 *  person1.HealthyPerson();   //this will throw the NoSuchBeanDefinitionException as the person class is not configured inside the config2.xml file
		 */
	}

}
