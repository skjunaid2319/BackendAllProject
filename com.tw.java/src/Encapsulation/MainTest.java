package Encapsulation;

public class MainTest {
	

              // What is Encapsulation ?

// Encapsulation is a process  of wriping data & code 
// to gather in single unit we can achey Encapsulation
// create variable class private & execess private 
// variable  by public geter & seter method 

	public static void main(String[] args) {
		Junaid jd= new Junaid();
		jd.setId(786);
		jd.setUzerName("Mohammad Junaid");
		jd.setPassword(null);
		
		System.out.println(jd.getId());
		System.out.println(jd.getpassword());
		System.out.println(jd.getName());
	}

}
