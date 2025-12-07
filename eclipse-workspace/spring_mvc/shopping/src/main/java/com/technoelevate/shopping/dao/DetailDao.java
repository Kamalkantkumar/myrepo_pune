package com.technoelevate.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.mysql.cj.Query;
import com.technoelevate.shopping.dto.CarClass;
import com.technoelevate.shopping.dto.DetailsDto;
import com.technoelevate.shopping.exception.CustomException;
import com.technoelevate.shopping.exception.MyException;

@Repository
public class DetailDao implements DetailsDaoInterface {
	static EntityManagerFactory fact = null;
	static EntityManager manager = null;
	static EntityTransaction transaction = null;
	boolean isadded = false;
	boolean isupdated = false;
	static String s11 = null;

	public static void hibernate() {
		fact = Persistence.createEntityManagerFactory("web");
		manager = fact.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		// Query createQuery = manager.createQuery("");

	}

	@Override
	public boolean newregister(DetailsDto dto) {
		hibernate();
		DetailsDto find = manager.find(DetailsDto.class, dto.getNumber());
		if (find == null) {
			manager.persist(dto);
			transaction.commit();
			isadded = true;
			return isadded;
		}

		return isadded;
	}

	@Override
	public DetailsDto login(String number, String password, String name) {
		hibernate();
		DetailsDto dto = manager.find(DetailsDto.class, number);
		s11 = dto.getNumber();
		if (dto != null) {
			String s1 = dto.getPassword();
			String s2 = password;
			if (s2.equals(s1)) {
				return dto;
			} else {
				throw new MyException("Invalid Password !!!!!");
			}
		} else {
			throw new MyException("user not found!!!!!!");
		}

	}

	@Override
	public DetailsDto update(String number, String password, String name, String gender, String email, String dob) {
		hibernate();
		DetailsDto dto = manager.find(DetailsDto.class, number);
		System.out.println(gender);
//		String s1=s11;
//		String s2=number;
//		if (s2.equals(s1)) {

		if (password != null) {
			dto.setPassword(password);
		} else {
			dto.setPassword(dto.getPassword());
		}

		if (name != null) {
			dto.setName(name);
		} else {
			dto.setName(dto.getName());
		}

		if (email == null) {
			dto.setEmail(email);
		} else {
			dto.setEmail(dto.getEmail());
		}

		if (dob == null) {
			dto.setDob(dto.getDob());
		} else {
			dto.setDob(dto.getDob());
		}

		manager.persist(dto);
		transaction.commit();
		return dto;

	}

	@Override

	public boolean Delete(String id) {
		boolean deleted = false;
		hibernate();
		CarClass find = manager.find(CarClass.class, id);
		manager.remove(find);
		transaction.commit();
		deleted = true;

		return deleted;
	}

	@Override
	public DetailsDto Search(String number) {
		hibernate();
		DetailsDto find = manager.find(DetailsDto.class, number);
		return find;
	}

	@Override
	public DetailsDto password(String number, String password, String password1) {// 7799
		hibernate();
		DetailsDto dto = manager.find(DetailsDto.class, number);// 7799
		if (dto != null) {
			String s1 = dto.getPassword();
			String s2 = password;
			if (s1.equals(s2)) {
				throw new CustomException("password is same as previous password");
			} else {
				if (password.equals(password1)) {
					dto.setPassword(password);
					manager.persist(dto);
					transaction.commit();
					return dto;
				} else {
					throw new CustomException("password not matched");
				}
			}
		} else {
			throw new MyException("user not found!!!!!!");

		}
	}

	@Override
	public boolean enter(CarClass car) {
		hibernate();
		CarClass find = manager.find(CarClass.class, car.getId());
		if (find == null) {
			manager.persist(car);
			CarClass find1 = manager.find(CarClass.class, car.getId());		
			if (find1.getShowroom_price() < 500000) {
				find1.setOnroad_price(car.getShowroom_price() + (find1.getShowroom_price() * (0.13)));
			} else if (find1.getShowroom_price() >= 500000 && find1.getShowroom_price() <= 1000000) {
				find1.setOnroad_price(car.getShowroom_price() + (find1.getShowroom_price() * (0.14)));
			} else if (find1.getShowroom_price() >= 1000000 && find1.getShowroom_price() <= 2000000) {
				find1.setOnroad_price(car.getShowroom_price() + (find1.getShowroom_price() * (0.17)));
			} else if (find1.getShowroom_price() >= 2000000) {
				find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.18)));
			} else if (find1.getFuel_type().equalsIgnoreCase("electric")) {
				find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.04)));
			}
			manager.persist(find1);
			transaction.commit();
			isadded = true;
			return isadded;
		}
		
		return isadded;
	}

	@Override
	public List<CarClass> name(String fue1_type) {
		hibernate();

		javax.persistence.Query query = manager
				.createQuery("from CarClass where fuel_type like '%" + fue1_type + "%' or name like '%" + fue1_type
						+ "%' or company like '%" + fue1_type + "%' or engine_capacity like '%" + fue1_type + "%' ");

		List resultList = query.getResultList();
		return resultList;

	}

	public DetailsDto profile(String number) {
		hibernate();
		DetailsDto find = manager.find(DetailsDto.class, s11);
		System.out.println(find.getNumber());

		return find;

	}

	@Override
	public CarClass updateShow(String id) {
		hibernate();
		CarClass find = manager.find(CarClass.class, id);
		// javax.persistence.Query query= manager.createQuery("from CarClass where id="
		// +id);
		// Object singleResult = query.getSingleResult();
		// System.err.println(singleResult);
		System.out.println(find);
		return find;
	}

	@Override
	public boolean update(CarClass car) {
		hibernate();
		CarClass find = manager.find(CarClass.class, car.getId());
		if (find != null) {
//			if (car.getName() != null) {
//				find.setName(car.getName());
//			} else {
//				find.setName(find.getName());
//			}
//			if (car.getCompany() != null) {
//				find.setCompany(car.getCompany());
//			}
//			else {
//				find.setCompany(find.getCompany());
//			}
//			if (car.getFuel_type() != null) {
//				find.setFuel_type(car.getFuel_type());
//			}else {
//				find.setFuel_type(find.getFuel_type());
//			}
//			if (car.getBreak_system() != null) {
//				find.setBreak_system(car.getBreak_system());
//			}else {
//				find.setBreak_system(find.getBreak_system());
//			}
//			if (car.getShowroom_price() != 0.0) {
//
//			}else {
//				find.setShowroom_price(find.getShowroom_price());
//			}
//			if (car.getImage_url() != null) {
//
//			}else {
//				find.setImage_url(find.getImage_url());
//			}
//			if (car.getMilage() != null) {
//
//			}else {
//				find.setMilage(find.getMilage());
//			}
//			if (car.getSeating_capacity() != null) {
//
//			}else {
//				find.setSeating_capacity(find.getSeating_capacity());
//			}
//			if (car.getEngine_capacity() != null) {
//
//			}else {
//				find.setEngine_capacity(find.getEngine_capacity());
//			}
//			if (car.getGear_type() != null) {
//
//			}else {
//				find.setGear_type(find.getGear_type());
//			}
//			if (car.getPower_steering() != null) {
//
//			}else {
//				find.setPower_steering(find.getPower_steering());
//			}
//			
//			
//			
////			find.setShowroom_price(car.getShowroom_price());
////			find.setImage_url(car.getImage_url());
////			find.setMilage(car.getMilage());
////			find.setSeating_capacity(car.getSeating_capacity());
////			find.setEngine_capacity(car.getEngine_capacity());
////			find.setGear_type(car.getGear_type());
////			find.setPower_steering(car.getPower_steering());
			manager.persist(find.getName());
			manager.persist(find.getCompany());
			manager.persist(find.getEngine_capacity());
			manager.persist(find.getFuel_type());
			manager.persist(find.getImage_url());
			manager.persist(find.getGear_type());
			manager.persist(find.getMilage());
			manager.persist(find.getPower_steering());
			manager.persist(find.getSeating_capacity());
			
			CarClass find1 = manager.find(CarClass.class, find.getId());
			if (find1.getShowroom_price() < 500000) {
				find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.13)));
			} else if (find1.getShowroom_price() >= 500000 && find1.getShowroom_price() <= 1000000) {
				find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.14)));
			} else if (find1.getShowroom_price() >= 1000000 && find1.getShowroom_price() <= 2000000) {
				find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.17)));
			} else if (find1.getShowroom_price() >= 2000000) {
				find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.18)));
			} else if (find1.getFuel_type().equalsIgnoreCase("electric")) {
				find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.04)));
			}
			manager.persist(find1);
			transaction.commit();
			isupdated = true;
			return isupdated;
		}

		return isadded;
	}

	@Override
	public CarClass updateShowf(CarClass cls) {
	hibernate();
	System.out.println("===========================================================");
	System.out.println(cls);
	System.out.println("===========================================================");
	CarClass find = manager.find(CarClass.class,cls.getId() );


	find.setBreak_system(cls.getBreak_system());
	find.setCompany(cls.getCompany());
	find.setEngine_capacity(cls.getEngine_capacity());
	find.setFuel_type(cls.getFuel_type());
	find.setGear_type(cls.getGear_type());
	find.setImage_url(cls.getImage_url());
	find.setMilage(cls.getMilage());
	find.setName(cls.getName());
	/* find.setOnroad_price(cls.getOnroad_price()); */
	find.setPower_steering(cls.getPower_steering());
	find.setSeating_capacity(cls.getSeating_capacity());
	find.setShowroom_price(cls.getShowroom_price());
	manager.persist(find);
	//transaction.commit();
	CarClass find1 = manager.find(CarClass.class, find.getId());
	if (find1.getShowroom_price() < 500000) {
		find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.13)));
	} else if (find1.getShowroom_price() >= 500000 && find1.getShowroom_price() <= 1000000) {
		find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.14)));
	} else if (find1.getShowroom_price() >= 1000000 && find1.getShowroom_price() <= 2000000) {
		find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.17)));
	} else if (find1.getShowroom_price() >= 2000000) {
		find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.18)));
	} else if (find1.getFuel_type().equalsIgnoreCase("electric")) {
		find1.setOnroad_price(find1.getShowroom_price() + (find1.getShowroom_price() * (0.04)));
	}
	manager.persist(find1);
	transaction.commit();
	
	
		return find;
	}

}
