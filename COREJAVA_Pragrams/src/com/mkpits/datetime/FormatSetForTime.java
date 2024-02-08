package com.mkpits.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatSetForTime {

	public static void main(String[] args) {
		LocalDateTime obj = LocalDateTime.now();
		System.out.println("Befor Formate set of  Date "+obj);
		
		// Formate to set date 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH::mm::ss");
		String st = obj.format(dtf);
		System.out.println("After Formatte set date :- "+st);

	}

}
