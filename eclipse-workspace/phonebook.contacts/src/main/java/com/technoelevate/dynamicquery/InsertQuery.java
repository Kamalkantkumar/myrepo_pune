package com.technoelevate.dynamicquery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertQuery {

	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = null;
		EntityManager createEntityManager = null;
		EntityTransaction transaction = null;
		try {
			createEntityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
			createEntityManager = createEntityManagerFactory.createEntityManager();
			transaction = createEntityManager.getTransaction();
			transaction.begin();
			Query createQuery = createEntityManager.createQuery("delete from Contacts where ontact_num=:num");
			createQuery.setParameter("num", Integer.parseInt(args[0]));
			int i = createQuery.executeUpdate();
			transaction.commit();
			System.out.println(i + "query ok");
		} catch (Exception e) {
		}

	}

}
