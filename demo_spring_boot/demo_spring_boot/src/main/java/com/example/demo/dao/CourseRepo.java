package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Course;

@Repository
public interface CourseRepo extends CrudRepository<Course,Long>{

	public Course findById(long courseId);
		
	
}
