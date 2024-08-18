package SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		
		@SuppressWarnings("resource")
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		Imployess std = (Imployess) con.getBean("imp");
		
//			System.out.println(std);
			  System.out.println("ID: " + std.getId());
		
	}

}
