package com.technoelevate.dynamicquery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicQuery {

	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = null;
		EntityManager createEntityManager = null;
		EntityTransaction transaction = null;
		try {
			createEntityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
			createEntityManager = createEntityManagerFactory.createEntityManager();
			transaction = createEntityManager.getTransaction();
			transaction.begin();
			Query createQuery = createEntityManager
					.createQuery("update Contacts set contact_name='venkatesh' where contact_num=:num");
			createQuery.setParameter("num", Long.parseLong(args[0]));
			int executeUpdate = createQuery.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate + " row(s) affected!!!");

		} catch (Exception e) {
              e.getStackTrace();
		}finally {
			createEntityManager.close();
			createEntityManagerFactory.close();
		}
		

	}

}
