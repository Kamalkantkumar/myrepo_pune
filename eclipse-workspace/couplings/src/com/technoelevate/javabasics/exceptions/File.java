package com.technoelevate.javabasics.exceptions;

import java.io.IOException;

public class File {
	public static void main(String[] args) {
		java.io.File file =new java.io.File("D://newfile.java.txt");
		try {
			file.createNewFile();
			System.out.println("file created please chech this D://newfile.java.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
