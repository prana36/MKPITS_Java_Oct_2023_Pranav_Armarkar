package com.mkpits.collectionwithlinkedlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Spliterator;

public class Example_UsingSpliteratorMethod {

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
		System.out.println("List Is :- "+lt);
		System.out.println("Size Of List is "+lt.size());
		
		Spliterator<String> spl = lt.spliterator();
		
		//System.out.println(spl);
		
		spl.forEachRemaining((output) -> System.out.println("list is : " + output));
		
//		lt.spliterator();
//		System.out.println(lt);
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

}
