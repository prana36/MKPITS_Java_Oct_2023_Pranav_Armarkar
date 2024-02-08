package com.mkpits.vacations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Example_UsingIndexOfMethod {

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
		
		System.out.println("Enter Value To Check ");
		String check = br.readLine();
		
		
		System.out.println(lt.indexOf(check));// it Print index value First Occurrence
		System.out.println(lt.lastIndexOf(check));// it print index value last Occurrence
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
