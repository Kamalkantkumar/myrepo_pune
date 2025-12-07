package com.technoelevate.java8.methodreference;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
          ArrayList arrayList=new ArrayList();
          arrayList.add(10);
          arrayList.add(10);
          arrayList.add(10);
          arrayList.add(10);
          arrayList.add(10);
          arrayList.add(10);
          for (Object object : arrayList) {
			System.out.println(object);
		}
          arrayList.forEach(l->{System.out.println(l);});
	}

}
