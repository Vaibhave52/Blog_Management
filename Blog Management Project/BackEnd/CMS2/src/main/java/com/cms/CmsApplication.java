package com.cms;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class CmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsApplication.class, args);
	}
	
	@Bean // equivalent to <bean id ..../> in xml file
	public ModelMapper mapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}
	
	@Bean
	public PasswordEncoder getEncoder() {
		return new BCryptPasswordEncoder();
	}


}
