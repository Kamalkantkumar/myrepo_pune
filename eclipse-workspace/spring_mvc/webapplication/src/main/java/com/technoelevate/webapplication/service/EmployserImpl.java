package com.technoelevate.webapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.webapplication.dao.EmployeeClassDao;
import com.technoelevate.webapplication.dto.EmployeeDto;

@Service
public class EmployserImpl implements EmployeeService {
	@Autowired
	EmployeeClassDao classDao;
 
//	public EmployeeDto getData(int eid) {
//		if(eid<=0) {
//			return null;
//		}else
//		return classDao.getData(eid);
//	}

	
	public EmployeeDto insertData1(EmployeeDto dto) {
		return classDao.insertData1(dto);
	}

	
	     
		
	

}
