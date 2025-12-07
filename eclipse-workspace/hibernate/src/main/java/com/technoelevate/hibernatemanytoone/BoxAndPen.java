package com.technoelevate.hibernatemanytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BoxAndPen {

	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		
//		Box box=new Box();
//		box.setBoxname("ballpen");
//		
//		Pen pen=new Pen();
//		pen.setClr("bluepen");
//		pen.setBox(box);
//		createEntityManager.persist(pen);
//		
//		Pen pen1=new Pen();
//		pen1.setClr("blackpen");
//		pen1.setBox(box);
//		createEntityManager.persist(pen1);
//		
//		Pen pen2=new Pen();
//		pen2.setClr("redpen");
//		pen2.setBox(box);
//		createEntityManager.persist(pen2);
		
//		Pen find = createEntityManager.find(Pen.class, 22);
//		createEntityManager.remove(find);
//		transaction.commit();
		
		
	}

}
