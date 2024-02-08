 package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class SortingOfArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 6 No. ");
		
		int num[]= new int[6];
		
		for (int i = 0; i < num.length; i++) {
			 num[i]=Integer.parseInt(br.readLine());
			
		}
		
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 1+i ; j < num.length; j++) {
				
				
				if (num[i]>num[j]) 
				{
					int change=num[i];
					num[i]=num[j];
					num[j]=change;
					
				}
				
				
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		
	}

}
