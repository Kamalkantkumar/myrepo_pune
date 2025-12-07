package com.technoelevate.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.hibernate.mappingdto.Father;
import com.technoelevate.hibernate.mappingdto.Mother;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("mapping");
			entityManager=factory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Mother mother=new  Mother();
			Mother find = entityManager.find(Mother.class, 1);
			find.setName("rjhfblfsvb");
			
		Father father = new Father();
		father.setName("skjdnfkeurnkbnd");
			System.out.println("Done");
		entityTransaction.commit();
		
		}catch (Exception e) {
		}
		}
}
