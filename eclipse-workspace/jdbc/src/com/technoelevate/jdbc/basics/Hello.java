package com.technoelevate.jdbc.basics;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Hello {

	public static void main(String[] args) throws IOException {
		
		FileReader reader=new FileReader("db_info.properties");
		
		Properties properties=new Properties();
		properties.load(reader);
		System.out.println(properties.getProperty("eid"));

		
             reader.close();		
	}

}
