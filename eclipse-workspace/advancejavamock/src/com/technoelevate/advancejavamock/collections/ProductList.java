package com.technoelevate.advancejavamock.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ProductList {
	public static void main(String[] args) {
		Stack<Product>set=new Stack<Product>();
		TreeSet<Product> list = new TreeSet<Product>();
		set.push(new Product("turmaric", 10, 1.5));
		set.push(new Product("chilli", 54, 2));
		set.push(new Product("masala", 9, 3));
		//List<Product>list2=new ArrayList<Product>(list);
		
//			System.out.println("using comparator :descending order");
//			Comparator<Product> comparator = (Product o1, Product o2) -> {
//				return (o2.price - o1.price);
//			};
		for (Product product : set) {
			System.out.println(product);
			
		}
//			

			}
		}
	


