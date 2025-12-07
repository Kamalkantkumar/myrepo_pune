package com.technoelevate.singleton;

public abstract class TemplateClass {
	public abstract void install() ;
		
	public void download() {
		System.out.println("download succesful");
		install();
	}

}
