package com.mkpits.collectionwithlinkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Example_UsingRemoveMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Range Of List :- ");
		int range = Integer.parseInt(br.readLine());
		LinkedList<String> lt = new LinkedList<String>();
		
		
		for(int i = 0; i < range ; i++) 
		{
			lt.add(br.readLine());
		}
		
		 // Display the initial elements in List
		System.out.println(" List Is :- "+lt);
		System.out.println("Size Of List is "+lt.size());
		
		lt.remove(3);
		System.out.println("update list Is "+lt);
		lt.removeFirstOccurrence(lt);
		

	}

}
