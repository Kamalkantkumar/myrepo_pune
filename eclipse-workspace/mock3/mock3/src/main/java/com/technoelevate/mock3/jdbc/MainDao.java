package com.technoelevate.mock3.jdbc;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainDao {

	public static void main(String[] args) {
    
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("hiber");
	EntityManager entityManager=factory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	
	Student student=new Student();
	student.setName("venkatesh");
	student.setLoc("ap");
	
	Books books=new Books();
	books.setBookname("biology");
	books.setPrice(100);
	books.setStudent(student);
	entityManager.persist(books);
	
	
	Books books1=new Books();
	books1.setBookname("science");
	books1.setPrice(1000);
	books1.setStudent(student);
	entityManager.persist(books1);
	
	
	
	
	entityTransaction.commit();
	System.out.println("succesful");
		
		
	}

}
