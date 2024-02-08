package com.mkpits.vacations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Example_UsingGetMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Range Of List :- ");
		int range = Integer.parseInt(br.readLine());
		LinkedList<String> lt = new LinkedList<String>();
		
		
		for (int i = 0; i < range ; i++) 
		{
			lt.add(br.readLine());
		}
      // Display the initial elements in List
		System.out.println("Array List Is :- "+lt);
		System.out.println("Size Of List is "+lt.size());
		
		System.out.println("Enter position to get value :- ");
		int po = Integer.parseInt(br.readLine());
		 // get method is use get value of particular value 
		
		System.out.println("Value of index "+(po-1)+"  is  "+lt.get(po-1));

	}

}
