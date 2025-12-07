package com.technoelevate.linkedlist.studentsdetails;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentDetailsMain {

	public static void main(String[] args) throws  Exception{
          List<StudentsDetails>details=new LinkedList<StudentsDetails>();
          details.add(new StudentsDetails("venkatesh", "17709A0312", 73, "mech"));
          details.add(new StudentsDetails("srikanth", "17701A0363", 70, "mech"));
          details.add(new StudentsDetails("srikanth reddy", "17701A0363", 64, "mech"));
          details.add(new StudentsDetails("samara", "17701A0363", 71, "mech"));
          details.add(new StudentsDetails("bhargav prasad reddy", "17701A0363", 66, "mech"));
          //try {
          details.remove(6);
         // }catch (Exception e) {
			//System.out.println("out");
		//}
          Collections.sort(details);
          details.forEach(System.out::println);
	}
	
}
