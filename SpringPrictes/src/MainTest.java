import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
		ApplicationContext con = new FileSystemXmlApplicationContext("Bean.xml");
		
		BikeCompant obj = (BikeCompant) con.getBean("Junaid");
		
		obj.ROnefive();
		obj.Newbike();
		obj.Haiabuza();
		

	}

}
