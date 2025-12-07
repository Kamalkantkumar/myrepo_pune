package com.te.springboot1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot1.bean.Student;
import com.te.springboot1.service.ServiceDao;

@RestController
public class Controller1 {

	@Autowired
	private ServiceDao serviceDao;

	/*@GetMapping(path="/getdata/{id}",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Student getdat(@PathVariable int id) {
		System.out.println("controller");
		System.out.println(serviceDao.validate(id));
		return serviceDao.validate(id);
	}*/
	
	// second way
	@GetMapping(path="/getdata",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Student> getBook(){
		Student list=serviceDao.getAllStudent();
		System.out.println("list"+list);
		if(list.getId()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
		
	}
}
