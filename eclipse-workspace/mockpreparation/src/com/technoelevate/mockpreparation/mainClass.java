package com.technoelevate.mockpreparation;

public class mainClass {

	public static void main(String[] args) {
		CastingProgram castingProgram=new ChildProgram(10, 5);
		ChildProgram childProgram=(ChildProgram) new CastingProgram(10, 5);
				
	}

}
