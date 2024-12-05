package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new AnnotationConfigApplicationContext(AppConfig.class);
		Pushpa2 pushpa = (Pushpa2) cApp.getBean("pushpa2");
		pushpa.story();
		
		Industry i = (Industry) cApp.getBean("industry");
		i.Budget();
	}

}
