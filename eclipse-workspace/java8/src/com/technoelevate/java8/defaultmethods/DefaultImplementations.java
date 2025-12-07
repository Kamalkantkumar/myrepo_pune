package com.technoelevate.java8.defaultmethods;

public class DefaultImplementations implements DefaultMethod {

	public static void main(String[] args) {
		DefaultMethod defaultMethod=new DefaultImplementations();
			defaultMethod.sum();
		    DefaultMethod.sub();
		    defaultMethod.add();
		}

	@Override
	public void add() {
		System.out.println("add");
		
	};

   

	}


