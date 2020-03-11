package com.myorg.rest.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
	        "com.myorg.rest.contoller",
	        "com.myorg.rest.beans"
		})
public class SpringApplicationBootstrap extends SpringBootServletInitializer{
	
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringApplicationBootstrap.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationBootstrap.class, args);
	}
	

}
