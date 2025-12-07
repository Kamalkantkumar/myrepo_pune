package com.technoelevate.mvcproject4.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoelevate.mvcproject4.dto.ProductDto;


@Repository
public class ProductDaoImpl implements ProductDao {
	
	
	static EntityManagerFactory fact=null;
	static EntityManager manager=null;
	 static EntityTransaction transaction=null;
	boolean isadded=false;
	
	
	public  static void hibernate() {
	 fact=Persistence.createEntityManagerFactory("shop");
	 manager=fact.createEntityManager();
      transaction=manager.getTransaction();
		transaction.begin();		
	}
	@Override
	public ProductDto insert(int pid, String pname, String brand, double price) {
		hibernate();
		ProductDto dto=new ProductDto();
		dto.setPid(pid);
		dto.setPname(pname);
		dto.setBrand(brand);
		dto.setPrice(price);
		manager.persist(dto);
		transaction.commit();
		return dto;
	}
	@Override
	public ProductDto delet(int pid) {
		hibernate();
		ProductDto dto=new ProductDto();
	 dto= manager.find(ProductDto.class, pid);
		manager.remove(dto);
		transaction.commit();
		return dto;
	}
	@Override
	public void update() {
   // TODO document why this method is empty
		hibernate();
		ProductDto dto=new ProductDto();
		manager.persist(dto);
		
 }

	@Override
	public ProductDto login(int pid, String pname) {
		hibernate();
		ProductDto dto =new ProductDto();
		dto=manager.find(ProductDto.class, pid);
		String s1=dto.getPname();
		String s2=pname;
		if( s2.equals(s1)) {
			return dto;
		}
		return null;
	}

}
