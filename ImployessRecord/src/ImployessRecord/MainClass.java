package ImployessRecord;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.NativeDetector.Context;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("bean.xml");
		
		NewImployess emp = (NewImployess) contex.getBean("emp");
		 System.out.println(emp);
		 
        
        

	}

}
