package com.tw;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext contex = new AnnotationConfigApplicationContext(Configuration.class);
		
		Employess emp = (Employess) contex.getBean("std");
		
		emp.display();
	}

}
