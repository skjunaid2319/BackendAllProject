package com.tw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.SpringProperties;




public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(SpringProperties.class);
		
		Imployess std = (Imployess) con.getBean("std");
		
		std.display();

	}

}
