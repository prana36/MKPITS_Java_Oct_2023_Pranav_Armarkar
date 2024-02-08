package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

public class ProblemStatment2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Range :- ");
		int range = Integer.parseInt(br.readLine());
		
		int num[]= new int[range];
		
		
		for (int i = 0; i < num.length; i++) 
		{
			num[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(num);
		for (int p : num) 
		{
			System.out.print(" "+p);
			
		}
		int larg = num[0];
		
		for (int i = 0; i < num.length; i++) 
		{
			if ( larg < num[i]) {
				
				larg=num[i];
			}
		}
		
		int secLarg=0;
		for (int i = 0; i < num.length; i++) {
			
			if (larg>num[i]) {
				secLarg=num[i];
				
			}
			
		}
		System.out.println("\nSecond larg no. is :- "+secLarg);
	
		
		
	// by using below line we can print directly 2nd largest no. 
		//System.out.println(""+num[num.length-2]);
		

	}

}
