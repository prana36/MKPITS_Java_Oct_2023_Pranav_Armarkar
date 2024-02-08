package com.mkpits.genericsandcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Boolean> booleanAL = new ArrayList<>();
		booleanAL.add(true);
        booleanAL.add(false);
        booleanAL.add(true);
        booleanAL.add(false);
        booleanAL.add(true);
        booleanAL.add(false);
        booleanAL.add(true);
        booleanAL.add(false);
        booleanAL.add(false);
        booleanAL.add(true);
        booleanAL.add(false);
        booleanAL.add(true);

		

		System.out.println(booleanAL.size());// this method is use to Print Size Of List

		System.out.println("==========++++++++===========");
		System.out.println("++Using For Each++\n");

		// using for each to print the data of ArrayList 'integerAL'

		for (Boolean booleaN : booleanAL) {

			System.out.println(booleaN);

		}

		

		System.out.println("-----------");

		// using for iterate over an index.
		System.out.println("==========++++++++===========");
	       System.out.println("++Using For loop++");
		for (int i = 0; i < booleanAL.size(); i++) {

			System.out.println(booleanAL.get(i));

		}
		 System.out.println("==========++++++++===========");
	       System.out.println("++Using Pre-Define Object Class Iterator++");
		
		Iterator<Boolean> itr = booleanAL.iterator();
		while (itr.hasNext()) {
			Boolean bool = (Boolean) itr.next();
			System.out.println(bool);
			
		}
		

	}

}
