package Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		
		Student std = (Student) con.getBean("std");
		
		std.display();

	}

}
