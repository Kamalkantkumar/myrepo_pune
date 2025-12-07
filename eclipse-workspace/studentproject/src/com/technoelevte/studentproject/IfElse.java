package com.technoelevte.studentproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(315, "venkatesh balla", 709, 25, 7799313094L));
		list.add(new Student(312, "balla", 808, 21, 9799313094L));
		list.add(new Student(325, "chowdary balla", 900, 27, 8799313094L));
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.err.println(
				"press values from 1 to 5\n 1.sort using id\n 2.sort using name\n "
				+ "3.sort using marks\n 4.sort using age\n 5.sort using mobile number");
		int a = scan.nextInt();

		if (a == 1) {
			System.out.println("sort using student id");
			Comparator<Student> comparator = (Student o1, Student o2) -> {
				return o2.id - o1.id;
			};
			Collections.sort(list, comparator);

			for (Student student : list) {
				System.out.println(student);
			}
		} else if (a == 2) {
			System.out.println("sort using student name");
			Comparator<Student> comparator = (Student o1, Student o2) -> {
				return o2.getName().compareTo(o1.getName());
			};
			Collections.sort(list, comparator);

			for (Student student : list) {
				System.out.println(student);
			}
		} else if (a == 3) {
			System.out.println("sort using student marks");
			Comparator<Student> comparator = (Student o1, Student o2) -> {
				return o2.getMarks() - o1.getMarks();
			};
			Collections.sort(list, comparator);

			for (Student student : list) {
				System.out.println(student);
			}
		} else if (a == 4) {
			System.out.println("sort using student age");

			Comparator<Student> comparator = (Student o1, Student o2) -> {
				return o2.age - o1.age;
			};
			Collections.sort(list, comparator);
			for (Student student : list) {
				System.out.println(student);

			}	
		} else if (a == 5) {
			System.out.println("sort using student number");
			Comparator<Student> comparator = (Student o1, Student o2) -> {
				return (int) (o2.getNum() - o1.getNum());
			};
			Collections.sort(list, comparator);

			for (Student student : list) {
				System.out.println(student);

			}

		}
	}
}

//			