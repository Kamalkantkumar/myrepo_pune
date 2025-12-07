package com.technoelevate.hipernate.jpql;

import java.util.List;

import javax.persistence.*;

import com.technoelevate.hibernet.dto.Employee;

public class JpqlClass {

	public static void main(String[] args) {

		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Query createQuery = createEntityManager.createQuery("delete from Employee where Eid=:id");
		createQuery.setParameter("id", 100);
		
		
		int executeUpdate = createQuery.executeUpdate();
		transaction.commit();
		System.out.println(executeUpdate+"one row ");
		//Employee resultList = (Employee) createQuery.getSingleResult();
		

    //System.out.println("age is :"+resultList.getAge());
	}

}
