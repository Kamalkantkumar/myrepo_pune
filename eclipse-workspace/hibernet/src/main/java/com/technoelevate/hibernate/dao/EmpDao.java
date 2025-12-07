package com.technoelevate.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.technoelevate.hibernet.dto.Employee;

public class EmpDao {

	public static void main(String[] args) {
      EntityManagerFactory factory=null;
      EntityManager createEntityManager=null;
      EntityTransaction transaction=null;
      
     try {
    	 factory = Persistence.createEntityManagerFactory("hibernate");
    	    createEntityManager = factory.createEntityManager();
    	    transaction = createEntityManager.getTransaction();
    	   Query createQuery = createEntityManager.createQuery("from emp");
    	   List resultList = createQuery.getResultList();
    	   for (Object object : resultList) {
			
		}
    	   
    	    transaction.begin();
    	    
//    	    Employee emp=new Employee();
//    		emp.setEid(300);
//    		emp.setEname("balla");
//    		emp.setDesig("developer");
//    		emp.setSal(5555);
//    		emp.setAge(85);
//    		emp.setDate("19-07-1892");
//    		
//    		createEntityManager.persist(emp);
//    		transaction.commit();
    	    
    	    Employee find = createEntityManager.find(Employee.class,1);
    	   
    	    System.out.println(find);
 
    	    
    	    
    	    
    	    
	} catch (Exception e) {
		System.err.println("unit name is may be wrong!!!!!!!!!!!!!!!!!!");
	} 
   
		
//		Employee find = createEntityManager.find(Employee.class, 1);
//		
//		System.out.println(find);
		
//		createEntityManager.persist(emp);
//		transaction.commit();                                       
//		
		
	}

}
