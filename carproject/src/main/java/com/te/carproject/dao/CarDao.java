package com.te.carproject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.carproject.dto.AdminInfo;
import com.te.carproject.dto.CarData;
import com.te.carproject.dto.CarInfo;


@Repository
public class CarDao {

	EntityManagerFactory factory = null;
	EntityManager manager = null;
	EntityTransaction transaction = null;

	public void factoryInitializationSetUp() {

		factory = Persistence.createEntityManagerFactory("car_mapping");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	// ==========================================================================

	public AdminInfo validateAdminInfo(int adminId, String password) {

		try {
			factoryInitializationSetUp();

			AdminInfo info = manager.find(AdminInfo.class, adminId);

			if (info.getAdmin_password().equals(password)) {

				return info;
			} else
				return null;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (manager != null) {
				manager.close();
			}
			if (factory != null) {

				factory.close();
			}
		}

		return null;

	}

	public CarInfo validateCarData(int carId) {

		try {
			factoryInitializationSetUp();

			CarInfo info = manager.find(CarInfo.class, carId);

			if (info != null) {

				return info;
			} else
				return null;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (manager != null) {
				manager.close();
			}
			if (factory != null) {

				factory.close();
			}
		}

		return null;

	}

	public boolean deleteCarData(int carId) {

		boolean isDeleted = false ;
		try {
			factoryInitializationSetUp();

			CarInfo info = manager.find(CarInfo.class, carId);
			
			transaction.begin();
			manager.remove(info);
			transaction.commit();
			
			CarInfo found = manager.find(CarInfo.class, carId);
			
			if (found == null) {
				isDeleted = true ;
			} 

			return isDeleted ;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			if (transaction != null) {
				transaction.rollback();
			}
			
		} finally {

			if (manager != null) {
				manager.close();
			}
			if (factory != null) {

				factory.close();
			}
		}

		return isDeleted ;

	}

	public CarInfo modifyCarData(CarData cardata) {

		try {
			factoryInitializationSetUp();

			transaction.begin();

			int car_id = cardata.getCarId();

			CarInfo info = manager.find(CarInfo.class, car_id);

			manager.remove(info);

			CarInfo carInfo = new CarInfo();

			carInfo.setCar_id(cardata.getCarId());
			carInfo.setName(cardata.getCarName());
			carInfo.setCompany(cardata.getCarCompany());
			carInfo.setFuel_type(cardata.getFuelType());
			carInfo.setBreak_system(cardata.getBreakSystem());
			carInfo.setEngine_capacity(cardata.getEngine());
			carInfo.setShowroom_price(cardata.getShowroomPrice());
			carInfo.setSeating_capacity(cardata.getSeatingCapacity());
			carInfo.setPower_steering(Boolean.parseBoolean(cardata.getSteering()));
			carInfo.setOnroad_price(cardata.getOnroadPrice());
			carInfo.setImage_url(cardata.getImage());
			carInfo.setGear_type(cardata.getGearType());
			carInfo.setMilage(cardata.getMilage());

			manager.persist(carInfo);
			transaction.commit();

			CarInfo found = manager.find(CarInfo.class, carInfo.getCar_id());

			if (found != null) {

				return found;
			}

			return null;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			if (manager != null) {
				manager.close();
			}
			if (factory != null) {
				factory.close();
			}
		}
		return null;
	}
	
	public List<CarInfo> getAllCarData(){

		try {
		
			factoryInitializationSetUp();
			Query query = manager.createQuery("FROM CarInfo") ;
			List<CarInfo> list = query.getResultList() ;

			if(list != null) {
				return list ;
			}
			else {
				return null ;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (manager != null) {
				manager.close();
			}
			if (factory != null) {

				factory.close();
			}
		}
		return null;
	}

	public boolean addCar(CarData cardata) {

		boolean dataAdded = false;
		try {
			factoryInitializationSetUp();

			CarInfo carInfo = new CarInfo();

			carInfo.setCar_id(cardata.getCarId());
			carInfo.setName(cardata.getCarName());
			carInfo.setCompany(cardata.getCarCompany());
			carInfo.setFuel_type(cardata.getFuelType());
			carInfo.setBreak_system(cardata.getBreakSystem());
			carInfo.setEngine_capacity(cardata.getEngine());
			carInfo.setShowroom_price(cardata.getShowroomPrice());
			carInfo.setSeating_capacity(cardata.getSeatingCapacity());
			carInfo.setPower_steering(Boolean.parseBoolean(cardata.getSteering()));
			carInfo.setOnroad_price(cardata.getOnroadPrice());
			carInfo.setImage_url(cardata.getImage());
			carInfo.setGear_type(cardata.getGearType());
			carInfo.setMilage(cardata.getMilage());

			transaction.begin();
			manager.persist(carInfo);
			transaction.commit();

			CarInfo found = manager.find(CarInfo.class, carInfo.getCar_id());

			if (found != null) {

				dataAdded = true;
			}

			return dataAdded;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (transaction != null) {

				transaction.rollback();
			}

		} finally {

			if (manager != null) {
				manager.close();
			}
			if (factory != null) {

				factory.close();
			}
		}
		return dataAdded;
	}

	// =====================Merge with Others================

	public List<CarInfo> validateUserInput(String UserInput) {

		try {
			factoryInitializationSetUp();

			List<CarInfo> carCompany = findByCarCompany(UserInput);
			List<CarInfo> carName = findByCarName(UserInput);
			List<CarInfo> fuelType = findByFuelType(UserInput);
			

			if (carName.size() != 0) {

				return carName;
			} else if (carCompany.size() != 0) {

				return carCompany;
			} else if (fuelType.size() != 0) {

				return fuelType;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (manager != null) {
				manager.close();
			}
			if (factory != null) {
				factory.close();
			}
		}
		return null;
	}

	// ==================================================================================

	public List<CarInfo> findByCarName(String userInput) {

		String findByCarName = "FROM CarInfo where name LIKE '" + userInput + "%'";
		Query query = manager.createQuery(findByCarName);
		List<CarInfo> byCarName = query.getResultList();

		return byCarName;
	}

	public List<CarInfo> findByCarCompany(String userInput) {

		String findByCarCompany = "FROM CarInfo where company LIKE '" + userInput + "%'";
		Query query = manager.createQuery(findByCarCompany);
		List<CarInfo> byCmpName = query.getResultList();

		return byCmpName;
	}

	public List<CarInfo> findByFuelType(String userInput) {

		String findByFuelType = "FROM CarInfo where fuel_type LIKE '" + userInput + "%'";
		Query query = manager.createQuery(findByFuelType);
		List<CarInfo> ByFuelType = query.getResultList();

		return ByFuelType;
	}

	// ==================================================================================

}
