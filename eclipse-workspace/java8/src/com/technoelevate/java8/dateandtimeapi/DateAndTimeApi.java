package com.technoelevate.java8.dateandtimeapi;

import java.time.LocalDate;
import java.time.Period;

public class DateAndTimeApi {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalDate date2=LocalDate.of(2015,07,10);
		System.out.println(date);
		Period period=Period.between(date, date2);
		System.out.println(period.toTotalMonths());
		
		

	}

}
