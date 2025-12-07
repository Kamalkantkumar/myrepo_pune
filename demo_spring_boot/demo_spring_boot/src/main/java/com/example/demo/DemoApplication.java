package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//if you are getting "Consider defining a bean of type 'com.example.demo.dao.CourseRepo' in your configuration" the add below "@ComponentScan()"
//@ComponentScan("com.example.demo.dao.CourseRepo")
//if getting "Reason: Failed to determine a suitable driver class" then add "(exclude = {DataSourceAutoConfiguration.class })"
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
