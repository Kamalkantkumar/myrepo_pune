package com.technoelevate.frirnds_detail_pojo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Details_dao {

	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("hibernate");
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
//		Details_pojo  pojo=new Details_pojo();
//		Scanner scanner=new Scanner(System.in);
//		
//		System.out.println("enter eid");
//	String eid=scanner.next();
//		pojo.setId(eid);
//		
//		System.out.println("enter name");
//		String sname=scanner.next();
//		pojo.setName(sname);
//		
//		System.out.println("enter clg name");
//		String cname=scanner.next();
//		pojo.setClg_name(cname);
//		
//		System.out.println("enter branch");
//		String branch=scanner.next();
//		pojo.setBranch(branch);
//		
//		System.out.println("enter marks");
//		String marks=scanner.next();
//		pojo.setMarks(marks);
//		
//		manager.persist(pojo);
//		transaction.commit();
//		Details_pojo find = manager.find(Details_pojo.class,eid);
//		transaction.commit();
//		System.out.println(find);
//		
		Query createQuery = manager.createQuery("insert into  Details_pojo values('382','sandesh','jssclg','450')");
		transaction.commit();
		int firstResult = createQuery.executeUpdate();
	
		
		
		
		
		
		
	}

}
