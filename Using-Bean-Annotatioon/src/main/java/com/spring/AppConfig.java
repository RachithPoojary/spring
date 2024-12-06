package com.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring")
public class AppConfig {
	@Bean(value = "student")
	public Student getStudent() {
		return new Student();
	}
	@Bean
	public List<String> getList(){
		return Arrays.asList("Java","SQL");
	}
}
