package com.mkpits.vacations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Example_UsingElementMethod {

	public static void main(String[] args) throws IOException 
	{
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
		 // getting the head of list 
        // using element() method 
          String value= lt.element();

        // print the head of list 
        System.out.println("Head of list : " + value);
		

	}

}
