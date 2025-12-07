package com.technoelevate.java8;

public abstract class Singer {
	abstract void sing();
	void sum() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Singer singer=new Singer() {
			
			@Override
			void sing() {
				System.out.println("singer sings");
				
			}
		};
		singer.sing();
		singer.sum();
	}

}
