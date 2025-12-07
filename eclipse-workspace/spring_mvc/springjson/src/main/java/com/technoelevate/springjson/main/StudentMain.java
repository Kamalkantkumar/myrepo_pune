package com.technoelevate.springjson.main;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import com.technoelevate.springjson.bean.Student;


public class StudentMain {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
       
	Student student=new Student();
	student.setId(100);
	student.setName("venkatesh");
	student.setDept("mech");
	student.setLoc("ap");
		System.out.println(student);
		System.out.println("-------------");
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("student.json"), student);
		Student readValue = mapper.readValue(new File("student.json"),Student.class);
		System.out.println(readValue);
	}

}
