package Spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configer {
	
	@Bean
	public Imployess std() {
		
		Imployess imp = new Imployess();
		
		imp.setName("Mdjunaiduddin");
		imp.setEmail("Skjunaid@gmail.com");
		imp.setMobile("9156665772");
		
		return imp;
		
	}

}
