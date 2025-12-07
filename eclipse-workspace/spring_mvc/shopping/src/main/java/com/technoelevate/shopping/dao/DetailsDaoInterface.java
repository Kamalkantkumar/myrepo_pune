package com.technoelevate.shopping.dao;

import java.util.List;

import com.technoelevate.shopping.dto.CarClass;
import com.technoelevate.shopping.dto.DetailsDto;

public interface DetailsDaoInterface {
	
	public  boolean newregister(DetailsDto dto);
	public DetailsDto login(String number,String password,String name);
	public DetailsDto update(String number,String password,String name,String gender,String email,String dob);
	public  boolean Delete(String number);
	public  DetailsDto Search(String number);
	public DetailsDto password(String number,String password,String password2) ;
	public boolean enter(CarClass class1);
	public List<CarClass> name(String fue1_type);
	public DetailsDto profile(String number) ;
	public boolean update(CarClass car);
	public CarClass updateShow(String id);
	public CarClass updateShowf(CarClass cls);
		
	
		
	
	
}
