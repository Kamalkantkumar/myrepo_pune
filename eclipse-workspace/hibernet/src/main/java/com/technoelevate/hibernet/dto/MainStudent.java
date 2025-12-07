package com.technoelevate.hibernet.dto;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainStudent {
	
	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();		
		StudentMany many=new StudentMany(212, "balla", null);
		StudentMany many2=new  StudentMany(815, "venkatesh", null);
//		createEntityManager.persist(many);
//		createEntityManager.persist(many2);
//		
		
		ArrayList<StudentMany> arrayList=new ArrayList<StudentMany>();
		arrayList.add(many);
		arrayList.add(many2);
		
		ArrayList<StudentMany> arrayList2=new ArrayList<StudentMany>();
		arrayList2.add(many2);
		arrayList2.add(many);
		
		Library library=new Library(813, "social", arrayList);
		createEntityManager.persist(library);
		
		Library library2=new Library(914, "science", arrayList2);
		createEntityManager.persist(library2);
		transaction.commit();
		
	}

}
