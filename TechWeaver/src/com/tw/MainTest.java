package com.tw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
		ApplicationContext con = new FileSystemXmlApplicationContext("Bean.xml");
		
		StudentTechWevar obj = (StudentTechWevar) con.getBean("Mdjunaud");
		
		obj.StudentName();
		obj.StudentEmail();
		obj.StudentCorse();
		
		

	}

}
