package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("config.xml");
		DBTest db = (DBTest) cApp.getBean("myDB");
		db.Display();
	}

}
