package com.technoelevate.mvcproject4.service;

import com.technoelevate.mvcproject4.dto.ProductDto;

public interface ProductService {
	
	public ProductDto insert(int pid,String pname,String brand,double price);
	public ProductDto delete(int pid);
	public ProductDto login(int pid,String pname);


}
