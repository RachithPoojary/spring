package com.spring;

public class Student {

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	private int sid;
	private String name;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
