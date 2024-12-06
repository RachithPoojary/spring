package com.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.spring")
@PropertySource(value = "classpath:student.properties")
public class AppConfig {
	@Bean(value = "student")
	@Scope(value = "prototype")
	public Student getStudent() {
		return new Student();
	}
	@Bean
	public List<String> getList(){
		return Arrays.asList("Java","SQL");
	}
}
