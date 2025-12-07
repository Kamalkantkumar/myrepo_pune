package com.technoelevate.webapplication.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.technoelevate.webapplication.dto.EmployeeDto;


@Repository
 public  class EmployeeClassDao implements EmployeeInterface {
	@Autowired
	EmployeeDto dto;
	
	 public EmployeeDto getData(int eid) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("web");
		EntityManager entityManager = managerFactory.createEntityManager();
		EmployeeDto find = entityManager.find(EmployeeDto.class, eid);
		return find;		
	}


public EmployeeDto insertData1(EmployeeDto dto2) {
	EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("web");
	EntityManager entityManager = managerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	transaction.begin();
//	EmployeeDto dto=new EmployeeDto();
//	dto.setEid(dto2.getEid());
//	dto.setEname(dto2.getEname());
//	dto.setPassword(dto2.getPassword());
//	dto.setPosition(dto2.getPosition());
	entityManager.persist(dto);
	transaction.commit();
	return dto;
}
}
