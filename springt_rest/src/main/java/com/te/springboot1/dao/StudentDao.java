package com.te.springboot1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.springboot1.bean.Student;
@Repository
public class StudentDao {

	public Student validate(int id) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("mvc");
		EntityManager manager=factory.createEntityManager();
		Student student=manager.find(Student.class, id);
		System.out.println("dao...");
		if(student.getId()==id)
		{
			return student;
		}
		return null;
	}

	public Student findAll() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("mvc");
		EntityManager manager=factory.createEntityManager();
		Student list=manager.find(Student.class, 1);
		return list;
	}

}
