package com.spring;

import java.util.List;

public class Student {
	private String name;
	private List<Subject> subjects;
	
	public void Display() {
		System.out.println("=======================Student Details========================");
		System.out.println(name);
		System.out.println("=======================Subject Details========================");
		for (Subject subject : subjects) {
			System.out.println(subject.getName());
			System.out.println(subject.getDays());
			
		}
	}

	public Student(String name, List<Subject> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
	}
	
	
}
