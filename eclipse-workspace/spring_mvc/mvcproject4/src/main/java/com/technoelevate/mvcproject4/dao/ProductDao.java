package com.technoelevate.mvcproject4.dao;

import com.technoelevate.mvcproject4.dto.ProductDto;


public interface ProductDao {
	
	public ProductDto insert(int pid,String pname,String brand,double price);
	public ProductDto delet(int pid);
	public ProductDto login(int pid,String pname);
	public void update();

}
