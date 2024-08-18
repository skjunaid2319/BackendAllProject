package SpringPrictes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Zinnera")
	private String name;
	@Value("Skjunaid@gmail.com")
	private String email;
	@Value("101")
	private String rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Rollno :"+rollno);
	}

}
