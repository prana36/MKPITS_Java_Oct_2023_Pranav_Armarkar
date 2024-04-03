package com.mkpits.collectionwithlinkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Example_UsingSetMethod {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Range Of List :- ");
		int range = Integer.parseInt(br.readLine());
		List<String> lt = new LinkedList<String>();
		
		
		for (int i = 0; i < range ; i++) 
		{
			lt.add(br.readLine());
		}
      // Display the initial elements in List
		System.out.println(" List Is :- "+lt);
		System.out.println("Size Of List is "+lt.size());
		
		// set method to replace particular element in list
		System.out.println("Enter position to replace :- ");
		int po = Integer.parseInt(br.readLine());
		System.out.println("Enter Value to replace:- ");
		String replace = br.readLine();
		lt.set(po-1, replace); // it use to replace
		System.out.println("Update  List Is :- "+lt);
		System.out.println("Update Size Of List is "+lt.size());

	}

}
