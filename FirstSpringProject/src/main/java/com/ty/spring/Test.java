package com.ty.spring;

import java.util.ResourceBundle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("config.xml");
		BeanFactory bean = new XmlBeanFactory(r);
		Student student =  (Student) bean.getBean("myStudent");
		student.bunk();
	}
}
