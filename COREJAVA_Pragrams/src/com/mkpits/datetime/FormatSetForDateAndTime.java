package com.mkpits.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatSetForDateAndTime {

	public static void main(String[] args) {
		LocalDateTime obj = LocalDateTime.now();
		System.out.println("Befor Formate set of  Date "+obj);
		
		// Formate to set date 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\n dd-MM-yyyy \nHH::mm::ss");
		String st = obj.format(dtf);
		System.out.println("After Formatte set date :- "+st);

	}

}
