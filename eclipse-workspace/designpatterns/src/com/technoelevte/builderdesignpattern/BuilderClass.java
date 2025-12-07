package com.technoelevte.builderdesignpattern;

public class BuilderClass{
	
	private String m_name;
	private int battery;
	private int ram;
	private String processor;
	private String yom;
	public BuilderClass setM_name(String m_name) {
		this.m_name = m_name;
		return this;
	}
	public BuilderClass setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public BuilderClass setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public BuilderClass setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public BuilderClass setYom(String yom) {
		this.yom = yom;
		return this;
	}
	public PhoneClass get() {
		return new PhoneClass(m_name, battery, battery, m_name, m_name);
		
	}
	
	
	
	

}
