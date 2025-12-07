package com.technoelevate.practice.list;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerilizationClass {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		String path="E:\\venkatesh.txt";
		try {
			FileInputStream fos= new FileInputStream(path);
			System.out.println("path found");
			ObjectInputStream os=new ObjectInputStream(fos);
			System.out.println("io");
			StudentClass class1 =(StudentClass) os.readObject();
			System.out.println("deserilization succesful");
			System.out.println(class1);
						
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		
		} catch (IOException e) {
			System.out.println("dxfhbj");
			
		
		}
		
	}

}
