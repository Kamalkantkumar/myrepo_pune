package com.technoelevate.arrays.basics;
import java.util.Arrays;
import java.util.Scanner;
public class ScannerArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
	        arr[i]=scan.nextInt();
		}
      for(int i=0;i<arr.length;i++) {
    	//  System.out.println("before sorting");
    	//  System.out.println(arr[i]);
    	 // System.out.println("after sorting");
    	 // temp=arr[i];
    	  Arrays.sort(arr);
    	  System.out.println(arr[i]);
      }
	}

}
