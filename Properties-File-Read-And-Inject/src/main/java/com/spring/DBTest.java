package com.spring;

public class DBTest {

	String url;
	String un;
	String pwd;
	
	public DBTest() {
		
	}

	public DBTest(String url, String userName, String password) {
	
		this.url = url;
		this.un = userName;
		this.pwd = password;
	}
	public void Display() {
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);

	}
	
}
