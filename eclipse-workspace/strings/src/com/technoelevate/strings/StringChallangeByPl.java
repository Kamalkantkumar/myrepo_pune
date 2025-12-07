package com.technoelevate.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StringChallangeByPl {

	public static void main(String[] args) {
       //Scanner sc=new Scanner(System.in);
       String str1="my name is balla venkatesh";
       String str2="my friend name is bugger";
       String str3=" ";
 
       System.out.println("enter two strings each string having five words!!!@!");    
       String str4=str1.concat(" "+str2);
      System.out.println(str4);
      
      String[] strSplit = str4.split(" ");
      ArrayList<String>arrayList=new ArrayList<>();
      Arrays.asList(strSplit);
      for (String string : arrayList) {
    	  System.out.println(string);
		
	}
     
      
      
//      for (int i = 0; i <str4.length() ; i++) {
//		str3=str4.charAt(i)+str3;
//		
//      }
//      
//      System.out.println("array  list");
//      arrayList.forEach(System.out::println);
//      
      }
      
      
      
      
      
	}


