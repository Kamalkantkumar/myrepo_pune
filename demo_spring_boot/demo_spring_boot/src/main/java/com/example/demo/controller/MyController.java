package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseServiceImpl;

//import org.springframework.stereotype.Controller;
//to tell the spring boot, this is my controller class, thats why we are using "@Controller"
//@Controller

// we are making rest api, this is why using"@RestController"
@RestController
public class MyController {

	@Autowired
	private CourseServiceImpl courseServiceImpl;
	
	@GetMapping("/")
	public String get(){
		return "welcome";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseServiceImpl.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		return this.courseServiceImpl.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public ResponseEntity<?> addCourse(@RequestBody Course course) {
		//return this.courseServiceImpl.addCourse(course);
		courseServiceImpl.addCourse(course);
		try {
			return new ResponseEntity<String>("data added successfully", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("some error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@DeleteMapping("/delete/{courseId}")
	public ResponseEntity<?> deleteCourse(@PathVariable String courseId) {
		//return this.courseServiceImpl.addCourse(course);
		courseServiceImpl.deleteCourse(Long.parseLong(courseId));
		try {
			return new ResponseEntity<String>("data deleted successfully", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("some error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
}
