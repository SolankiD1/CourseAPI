package com.practice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //starting point of the spring boot application
public class CourseApiApp {
	
	public static void main(String[] args){
			//create a Servlet Container host this application in that container. 
			//one static method to do all this is.
			//args is just a pass through of the arguments from the command line. 
		SpringApplication.run(CourseApiApp.class, args);
	}

}
