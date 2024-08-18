package com.tw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigerFile {
	
	@Bean
	public Imployess std() {
		Imployess std = new Imployess();
		
		std.setName("junaid");
		std.setEmail("skjunaod@gmail.com");
		std.setId(101);
		
		return std;
		
		
	}
}