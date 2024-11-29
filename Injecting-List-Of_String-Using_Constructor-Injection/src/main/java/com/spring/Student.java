package com.spring;

import java.util.List;

public class Student {
	private String name;
	private int sid;
	private List<String> subjects;
	
	public void Display() {
		System.out.println("==================Student Details===================");
		System.out.println(name);
		System.out.println(sid);
		System.out.println("==================Subject Details===================");
		for (String subject : subjects) {
			System.out.println(subject);
			
		}
	}

	public Student(String name, int sid, List<String> subjects) {
		super();
		this.name = name;
		this.sid = sid;
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + ", subjects=" + subjects + "]";
	}
	
	
}
