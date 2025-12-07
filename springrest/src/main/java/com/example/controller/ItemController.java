package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ItemRepository;
import com.example.entity.Item;

@RestController
public class ItemController {

	@Autowired
	private ItemRepository repository;
	

	
	// second way
	@GetMapping(path="/getdata",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Item> getBook(){
		Item list=repository.findAll();
		System.out.println("list"+list);
		
		return ResponseEntity.of(Optional.of(list));
		
	}
}

