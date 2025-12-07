package com.te.springboot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot1.bean.Student;
import com.te.springboot1.dao.StudentDao;
@Service
public class ServiceDao {
	
	@Autowired
	private StudentDao dao;

	public Student validate(int id) {
		System.out.println("service");
		if(id<=0)
		{
			return null;
		}else {
			return dao.validate(id);
		}
	}

	public Student getAllStudent() {
		Student list=this.dao.findAll();
		return list;
	}

}
