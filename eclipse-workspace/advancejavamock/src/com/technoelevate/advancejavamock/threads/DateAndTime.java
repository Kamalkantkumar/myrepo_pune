package com.technoelevate.advancejavamock.threads;

import java.time.LocalDate;
import java.time.Period;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate date=LocalDate.of(1999, 07, 25);
		LocalDate date2=LocalDate.now();
		
		//System.out.println(LocalDate.);
		System.out.println(LocalDate.EPOCH);
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.MIN);
		System.out.println(LocalDate.from(date));
		//System.out.println(LocalDate.now(null)));
		Period period=Period.between(date, date2);
		System.out.println(period.getYears());
		System.out.println(period.getDays());
		//System.out.println(per
		
	}

}
