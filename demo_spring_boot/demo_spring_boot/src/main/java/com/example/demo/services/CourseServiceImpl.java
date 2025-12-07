package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseRepo;
import com.example.demo.entities.Course;

@Service
//@Component
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo courseRepo;

	@Override
	public List<Course> getCourses() {
		List<Course> list = (List<Course>) this.courseRepo.findAll();
		return list;
	}

	public Course getCourse(long courseId) {

		Course course = null;
		course = this.courseRepo.findById(courseId);
		return course;
	}

	public Course addCourse(Course course) {
		System.out.println("add");
		Course result = this.courseRepo.save(course);
		return result;
	}

	// rest code need to implement

	public void deleteCourse(long courseId) {
		courseRepo.deleteById(courseId);
	}

	public void updateCourse(Course course, long courseId) {
		course.setId(courseId);
		courseRepo.save(course);
	}


}
