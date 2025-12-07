package com.technoelevate.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.shopping.dao.DetailsDaoInterface;
import com.technoelevate.shopping.dto.CarClass;
import com.technoelevate.shopping.dto.DetailsDto;

@Service
public class DetailsServiceImpl implements DetailsService {
	@Autowired
	DetailsDaoInterface daoInterface;

	@Override
	public boolean addEmp(DetailsDto dto) {
		if (dto == null) {
			return false;
		} else {
			return daoInterface.newregister(dto);
		}

	}

	@Override
	public DetailsDto login(String number, String password, String name) {
		return daoInterface.login(number, password, name);
	}

	@Override
	public DetailsDto update(String number, String password, String name, String gender, String email, String dob) {
		return daoInterface.update(number, password, name, gender, email, dob);
	}

	@Override
	public boolean Delete(String id) {
		return daoInterface.Delete(id);
	}

	@Override
	public DetailsDto Search(String number) {
		return daoInterface.Search(number);
	}

	@Override
	public DetailsDto password(String number, String password,String password1) {
		return daoInterface.password(number, password,password1);
	}

	@Override
	public boolean enter(CarClass class1) {
		
		return daoInterface.enter(class1);
	}

	@Override
	public List<CarClass> name(String fue1_type) {
		return daoInterface.name(fue1_type);
	}

	@Override
	public DetailsDto profile(String number) {
		// TODO Auto-generated method stub
		return daoInterface.profile(number);
	}

	@Override
	public boolean update(CarClass car) {
		if (car != null) {
			daoInterface.update(car);
			return true;
		}
		return false;
	}

	@Override
	public CarClass updateShow(String id) {
		return daoInterface.updateShow(id);
	}

	@Override
	public CarClass updateShowf(CarClass cls) {
		// TODO Auto-generated method stub
		return daoInterface.updateShowf(cls);
	}

	

}
