package com.technoelevte.builderdesignpattern;

public class PhoneClass {
	
	private String m_name;
	private int battery;
	private int ram;
	private String processor;
	private String yom;
	
	
	public PhoneClass(String m_name, int battery, int ram, String processor, String yom) {
		this.m_name = m_name;
		this.battery = battery;
		this.ram = ram;
		this.processor = processor;
		this.yom = yom;
	}


	@Override
	public String toString() {
		return "PhoneClass [m_name=" + m_name + ", battery=" + battery + ", ram=" + ram + ", processor=" + processor
				+ ", yom=" + yom + "]";
	}
	
	

}
