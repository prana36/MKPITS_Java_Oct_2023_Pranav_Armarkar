package com.mkpits.vacations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Example1_HashMap {

	public static void main(String[] args) {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Range:- ");
		int range = Integer.parseInt(br.readLine());
		 HashMap<Integer, String> map = new HashMap<Integer, String>();
		 
		 System.out.println("Enter Elements :- ");
 		for (int i = 0; i < range; i++) 
 		{
			map.put(Integer.parseInt(br.readLine()), br.readLine());
		}
 		System.out.println("Map is :- "+map);
 		
 		System.out.print("Enter key :- ");
 		int key = Integer.parseInt(br.readLine());
 		
 		if (map.containsKey(key)) 
 		{
 			System.out.println("value is "+map.get(key));
			
		} else {
			System.out.println("Element is present");

		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
