package com.tw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configer {
	
	@Bean
	public Employess std() {
		
		Employess emp = new Employess();
		
		emp.setEmaill("Skjunaid@gmail.com");
		emp.setId(786);
		emp.setMobile("9156665772");
		emp.setName("Mdjunaid");
		
		return emp;
		
		
		
	}

}
