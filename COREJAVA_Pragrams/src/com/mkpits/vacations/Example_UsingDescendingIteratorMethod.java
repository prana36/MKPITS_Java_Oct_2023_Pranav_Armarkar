package com.mkpits.vacations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class Example_UsingDescendingIteratorMethod {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Range Of List :- ");
		try {
			
		
		int range = Integer.parseInt(br.readLine());
		LinkedList<String> lt = new LinkedList<String>();
		
		
		for(int i = 0; i < range ; i++) 
		{
			lt.add(br.readLine());
		}
		
		 // Display the initial elements in List
		System.out.println(" List Is :- "+lt);
		System.out.println("Size Of List is "+lt.size());
		
//		System.out.println("Enter Value To Check ");
//		String check = br.readLine();
		
		 // set Iterator as descending 
        // using descendingIterator() method 
        Iterator<String> x = lt.descendingIterator(); 

        // print list with descending order 
        while (x.hasNext()) { 
            System.out.println("Value is : "+ x.next()); 
        } 
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
