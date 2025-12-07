package com.technoelevate.singleton;

public class SingletonClass {
	 static SingletonClass class1;
	 
	 public SingletonClass sum(int a,int b) {
		 if(class1==null) {
			 class1=new SingletonClass();
		 }
		 int c=a+b;
		 System.out.println(c);
		return class1;
		
	}

}
