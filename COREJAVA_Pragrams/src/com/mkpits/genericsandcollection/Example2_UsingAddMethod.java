package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Example2_UsingAddMethod {

	public static void main(String[] args) {
		// Creating an object of List interface,
	   // implemented by ArrayList class
							
		  List<String> lt = new ArrayList<String>();
			lt.add("Pranav");
			lt.add("kaustubh");
			lt.add("Ashik");
			lt.add("Pranav");
			lt.add("kaustubh");
		// Display the initial elements in List
		 System.out.println("Initial Elements is :- "+lt);
		 
		 StringJoiner sj = new StringJoiner("*&^%&^");
		 sj.add(lt.get(0)).add(lt.get(1));
		 
		 System.out.println(sj);
			

	}

}
