package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Industry {
	@Autowired
	Movie movie;
	
	public void Budget() {
		System.out.println("BUdget invested on movie");
		movie.story();
	}
}
