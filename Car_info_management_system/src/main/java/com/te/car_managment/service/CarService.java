package com.te.car_managment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.car_managment.Dao.CarDao;
import com.te.car_managment.Dto.AdminInfo;
import com.te.car_managment.Dto.CarData;
import com.te.car_managment.Dto.CarInfo;

@Service
public class CarService {

	@Autowired
	private CarDao dao;

	public AdminInfo validateAdminInfo(int adminId, String password) {

		AdminInfo adminInfo = dao.validateAdminInfo(adminId, password);

		if (adminInfo != null) {

			return adminInfo;
		} else
			return null;
	}

	public boolean addCar(CarData carData) {

		boolean isAdded = false;

		if (dao.addCar(carData)) {

			isAdded = true;
		}

		return isAdded;
	}

	public CarInfo validateCarData(int carId) {

		CarInfo info = dao.validateCarData(carId);

		if (info != null) {

			return info;
		} else {

			return null;
		}
	}

	public CarInfo modifyCarData(CarData carData) {

		CarInfo info = dao.modifyCarData(carData);

		if (info != null) {

			return info;
		} else {

			return null;
		}
	}

	public boolean deleteCarData(int carId) {
		boolean isDeleted = false ;
		if (dao.deleteCarData(carId)) {

			isDeleted = true;
		} 
		
		return isDeleted ;
	}

	public List<CarInfo> validateUserInput(String UserInput) {

		List<CarInfo> list = dao.validateUserInput(UserInput);
		if (list != null) {
			return list;
		}
		return null;
	}
	
	public List<CarInfo> seeAllCarData() {

		List<CarInfo> list = dao.getAllCarData() ;
		if (list != null) {
			return list;
		}
		return null;
	}

}
