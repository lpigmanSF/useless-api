package com.pigman.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UselessApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UselessApplication.class, args);
	}
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(UselessApplication.class);
	}

}
