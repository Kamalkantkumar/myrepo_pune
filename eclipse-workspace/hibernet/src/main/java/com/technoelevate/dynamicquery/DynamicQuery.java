package com.technoelevate.dynamicquery;




import java.sql.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicQuery {
  
	public static void main(String[] args) {
      EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
      EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
      EntityTransaction transaction = createEntityManager.getTransaction();
      transaction.begin();
      Query createQuery = createEntityManager.createQuery("update Contacts set contact_name=venkatesh where contact_num=:num");
        createQuery.setParameter(1, "310");
        Object singleResult = createQuery.getSingleResult();
        transaction.commit();
        System.out.println(singleResult);
	}
	public void name() {
		try {
			Connection connection=DriverManager.getConnection(null);
			Statement createStatement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
