package com.mkpits.lambda;

import java.util.ArrayList;

public class SingleParametr {
	// single parameter - (n) -> System.out.println(n);

	public static void main(String[] args) {

		// Creating instance of array list
		ArrayList<String> list = new ArrayList<String>();
		// adding elements
		list.add("Karan");
		list.add("Ananta");
		list.add("Mohod");
		// print by single parameter lambda expression
		list.forEach(s -> System.out.println(s));
		
	}

}
