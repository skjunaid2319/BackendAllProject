package Spring3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Imployess {
	
	@Value("Mdjunaid")
	private String name;
	@Value("skjunaid@gmail.com")
	private String email;
	@Value("9156665772")
	private String mobile;
	
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void display() {
		
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Mobile :"+mobile);
	}
	
	

}
