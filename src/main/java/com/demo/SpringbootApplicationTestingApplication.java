package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplicationTestingApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringbootApplicationTestingApplication.class, args);
	
		((ConfigurableApplicationContext) ac).close();
	
	}

}
