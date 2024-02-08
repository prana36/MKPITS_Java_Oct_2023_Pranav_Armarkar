package com.mkpits.genericsandcollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProblemStatment2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Range :- ");
		int range = Integer.parseInt(br.readLine());
		
		
		List<String> obj = new ArrayList<String>();
		System.out.println("Enter Car Name ");
		for (int i = 0; i < range; i++) 
		{
			obj.add(br.readLine());
		}
		for (String str : obj) {
			System.out.println("Cars are "+str);
		}
		System.out.print("Size of list is :- "+obj.size());
 
		System.out.println("\nEnter position to Replace ");
		int po=Integer.parseInt(br.readLine());
		System.out.println("enter car name to Replace ");
		String c=br.readLine();
		
		obj.set(po-1,c );
		
		for (String str : obj) {
			System.out.println("Cars are "+str);
		}
	}

}
