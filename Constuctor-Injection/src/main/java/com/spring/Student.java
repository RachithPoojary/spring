package com.spring;

public class Student {
	
	String name;
	String email;
	int age;
	public Student(String name, String email, int age) {
	
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public Student() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void Display() {
		System.out.println("Name: "+ name);
		System.out.println("Email: "+ email);
		System.out.println("Age: "+ age);
		
	}

}
