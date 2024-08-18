package SpringApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigerFile {
	
 @Bean
		public Student stdId1() {
	 
	    Student std = new Student();
	    
	    std.setName("Zinnera");
	    std.setId(101);
	    std.setEmail("Z@gamil.com");
			return std;
		}
}

