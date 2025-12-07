package com.te.springmvcdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.te.springmvcdemo.dto.Employee;
import com.te.springmvcdemo.excepption.EmployeeException;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee validate(int id, String password) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Employee employee = entityManager.find(Employee.class, id);

		if (employee != null) {
			return employee;
		}
		throw new EmployeeException("invalid Id, please enter valid id.");
	}

	@Override
	public Employee getData(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Employee employee = entityManager.find(Employee.class, id);

		if (employee != null) {
			return employee;
		}
		return null;
	}

	@Override
	public int deleteData(int id) {
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Employee employee = manager.find(Employee.class, id);
			manager.remove(employee);
			transaction.commit();
			return 1;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean addData(int id, String name, String address, String password) {
		EntityTransaction transaction=null;
		boolean result=false;
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setAddress(address);
		emp.setPassword(password);

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
			EntityManager manager = factory.createEntityManager();
			 transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(emp);
			transaction.commit();
			result=true;
			return result;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean updateData(int id, String name) {
		EntityTransaction transaction=null;
		boolean update=false;
		
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
			EntityManager manager = factory.createEntityManager();
			 transaction = manager.getTransaction();
			transaction.begin();
			Employee employee = manager.find(Employee.class, id);
			employee.setName(name);
			transaction.commit();
			update=true;
			return update;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return update;
	}

	@Override
	public List<Employee> seeAllDetails() {
	
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
			EntityManager manager = factory.createEntityManager();
			String read="from Employee";
			Query query=manager.createQuery(read);
			List<Employee> li = query.getResultList();
			if(li!=null)
				return li;
			else
				throw new EmployeeException("Record not found");
		
	}

}
