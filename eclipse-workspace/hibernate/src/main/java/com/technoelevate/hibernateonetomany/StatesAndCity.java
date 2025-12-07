package com.technoelevate.hibernateonetomany;

import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StatesAndCity {

	public static void main(String[] args) {
		
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("hibernate");
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
//		StateDto dto=new StateDto();
//		dto.setName("karnataka");
//		dto.setCapital("banglore");
//		dto.setStateCm("basavaraj");
//		
//		CityDto city=new CityDto();
//		city.setCityname("BTM");
//		
//		CityDto city1=new CityDto();
//		city1.setCityname("kollar");
//		
//		CityDto city2=new CityDto();
//		city2.setCityname("white field");
//		
//		CityDto city3=new CityDto();
//		city3.setCityname("marthalli");
//		
//		List<CityDto> list=Arrays.asList(city,city1,city2,city3);
//		
//		dto.setCity(list);
//        
//		manager.persist(dto);
//		transaction.commit();
		
		
		StateDto find = manager.find(StateDto.class, 15);
		manager.remove(find);
		transaction.commit();
		System.out.println("query ok");


	}

}
