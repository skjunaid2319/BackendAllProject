package com.tw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		
		ApplicationContext con = new FileSystemXmlApplicationContext("NewFile.xml");
		
		Imployess obj = (Imployess) con.getBean("new");
		
		obj.imployess();
		obj.rools();
		obj.salary();
		obj.location();

	}

}
