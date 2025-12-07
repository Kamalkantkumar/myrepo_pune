package com.technoelevate.hibernate;

//package com.technoelevate.hibernateonetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.hibernateonetomany.StateDto;

public class RemoveOneToMany {

	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("hibernate");
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		StateDto find = manager.find(StateDto.class, 15);
		manager.remove(find);
		transaction.commit();
		System.out.println("query ok");

	}

}
