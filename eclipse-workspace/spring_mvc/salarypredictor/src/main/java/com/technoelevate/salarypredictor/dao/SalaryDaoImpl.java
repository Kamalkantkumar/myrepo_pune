package com.technoelevate.salarypredictor.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.technoelevate.salarypredictor.dto.Salary;
import com.technoelevate.salarypredictor.exception.MyException;

@Repository
public class SalaryDaoImpl implements SalaryDao {

	Integer salary11 = 0;
	Integer sal = 0;

	@Override
	public Salary predictSalary(String emp_id, String name, Integer Mock1, Integer Mock2, Integer Mock3, Integer Mock4,
			Integer salary) {
		
		try {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernate");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
	
			
		

		transaction.begin();
		Salary salary1 = new Salary();
		salary1.setEmp_id(emp_id);
		salary1.setName(name);
		salary1.setMock1(Mock1);
		salary1.setMock2(Mock2);
		salary1.setMock3(Mock3);
		salary1.setMock4(Mock4);
		createEntityManager.persist(salary1);
		Salary find = createEntityManager.find(Salary.class, emp_id);
		Integer mock12 = find.getMock1();
		Integer mock22 = find.getMock2();
		Integer mock32 = find.getMock3();
		Integer mock42 = find.getMock4();
	
	
		if (mock12!=0&& mock22 !=0 && mock32 !=0 && mock42 !=0) {
			salary11 = (mock12 + mock22 + mock32 + mock42);
			sal = salary11 / 4;
			if (sal == 4) {
				sal = 360000;
				salary1.setSalary(sal);
				createEntityManager.persist(salary1);
				transaction.commit();

			} else if (sal == 3) {
				sal = 340000;
				salary1.setSalary(sal);
				createEntityManager.persist(salary1);
				transaction.commit();

			} else if (sal == 2) {
				sal = 320000;
				salary1.setSalary(sal);
				createEntityManager.persist(salary1);
				transaction.commit();

			} else  {
				sal = 300000;
				salary1.setSalary(sal);
				createEntityManager.persist(salary1);
				transaction.commit();

			} 

		}else {
			sal=0;
		
			salary1.setSalary(sal);
			createEntityManager.persist(salary1);
			transaction.commit();	
			
		}
		

		return find;
	
		

}catch (Exception e) {
	throw new MyException("Id already present");
}
	}	}
