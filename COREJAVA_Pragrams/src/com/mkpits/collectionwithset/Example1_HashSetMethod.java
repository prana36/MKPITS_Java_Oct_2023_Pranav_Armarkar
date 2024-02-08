package com.mkpits.collectionwithset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Example1_HashSetMethod {

	public static void main(String[] args) 
	{
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("range");
			int num = Integer.parseInt(br.readLine());
			
		Set<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < num; i++) 
		{
			hs.add(Integer.parseInt(br.readLine()));
			
		}
	
		hs.forEach(System.out::println);
		
		
		System.out.println("Enter No. To check ");
		int num1 = Integer.parseInt(br.readLine());
		if (hs.contains(num)) 
		{
		 System.out.println("Element is present");	
		} else 
		{
			System.out.println("Element is Not present");

		}
		
	
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
