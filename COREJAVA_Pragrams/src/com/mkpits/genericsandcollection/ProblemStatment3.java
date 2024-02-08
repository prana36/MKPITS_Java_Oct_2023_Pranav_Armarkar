package com.mkpits.genericsandcollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProblemStatment3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Range :- ");
		int range = Integer.parseInt(br.readLine());
		
		
		List<String> obj = new ArrayList<String>();
		System.out.println("Enter Flower Name ");
		for (int i = 0; i < range; i++) 
		{
			obj.add(br.readLine());
		}
		for (String str : obj) {
			System.out.println("Flowers  are "+str);
		}
		System.out.print("Size of list is :- "+obj.size());
		
		System.out.println("\nEnter Element To Check Position");
		int pos = Integer.parseInt(br.readLine());
		String flower;
		System.out.println("Enter Element to check ");
		while (true) {
			 flower = br.readLine();
			if (flower.isEmpty()) 
			{
				System.out.println("Enter Vaild Choice \n Choice Should not be Blank ");
				continue;
			}
			break;
		}
		if (obj.contains(flower)) {
			System.out.println("Element is present");
			
		}
		else {
			System.out.println("Element is Not present");
			
		}
		

	}

}
