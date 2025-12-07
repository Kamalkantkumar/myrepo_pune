package com.example.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.example.entity.Item;

@Repository
public class ItemRepository {


	
	public Item findAll(){
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("mvc");
		EntityManager manager=factory.createEntityManager();
		Item item=manager.find(Item.class, 1);
		return item;
	}
}
