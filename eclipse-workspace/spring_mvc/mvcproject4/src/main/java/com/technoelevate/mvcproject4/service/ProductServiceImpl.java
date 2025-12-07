package com.technoelevate.mvcproject4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.mvcproject4.dao.ProductDao;
import com.technoelevate.mvcproject4.dto.ProductDto;

@Service
public class ProductServiceImpl  implements ProductService {
	
	@Autowired
	ProductDao dao;

	@Override
	public ProductDto insert(int pid, String pname, String brand, double price) {	
		
		return dao.insert(pid, pname, brand, price);
	}

	@Override
	public ProductDto delete(int pid) {
		return dao.delet(pid);
	}

	@Override
	public ProductDto login(int pid, String pname) {
		
		return dao.login(pid, pname);
	}

}
