package com.tw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
		 ApplicationContext con = new FileSystemXmlApplicationContext("beans.xml");
		 
		 CarCompany obj = (CarCompany) con.getBean("Md");
		 
		 obj.CarColor();
		 obj.CarFeacher();
		 obj.CarName();

	}

}
