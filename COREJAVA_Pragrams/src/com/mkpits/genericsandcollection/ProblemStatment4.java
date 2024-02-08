package com.mkpits.genericsandcollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProblemStatment4 {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter Range :- ");
//		int range = Integer.parseInt(br.readLine());
//		
//		
//		List<String> obj = new ArrayList<String>();
//		System.out.println("Enter Flower Name ");
//		for (int i = 0; i < range; i++) 
//		{
//			obj.add(br.readLine());
//		}
//		for (String str : obj) {
//			System.out.println("Flowers  are "+str);
//		}
//		
//		for (int i = range; i < range; i++) {
//			
//		}
//		
//		
//		
//		
//		System.out.print("Size of list is :- "+obj.size());
		
		List<String> obj = new ArrayList<String>();
		obj.add("Pranav");
		obj.add("Ashik");
		obj.add("Kaustubh");
		obj.add("raj");
		
		for (String str : obj) {
			System.out.println(str);
		}
		
		for (int i = 3; i >= 0; i--) {
			System.out.println(obj.get(i));
			
		}
		

	}

}
