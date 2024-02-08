package com.mkpits.datetime;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;



public class FormateSetForDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Befor Formate set of  Date "+date);
		
		// Formate to set date 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String st = date.format(dtf);
		System.out.println("After Formatte set date :- "+st);

	}

}
