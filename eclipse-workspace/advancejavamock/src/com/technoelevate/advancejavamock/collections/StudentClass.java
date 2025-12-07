package com.technoelevate.advancejavamock.collections;

import java.util.Comparator;

public class StudentClass {
	public StudentClass(int id, int ename) {
		this.id = id;
		this.ename = ename;
	}
	int id;
	int ename;
	@Override
	public String toString() {
		return "StudentClass [id=" + id + ", ename=" + ename + "]";
	}
//	@Override
//	public int compare(StudentClass o1, StudentClass o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	

}
