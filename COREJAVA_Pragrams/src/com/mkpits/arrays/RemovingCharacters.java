package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class RemovingCharacters {

	public static void main(String[] args) throws IOException {
		  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name :- ");
		String name = br.readLine(); 
		
		
		char ch[] = new char[name.length()];
		
		for (int i = ch.length; i <ch.length-1; i++) {
			
			
			for (int j = 0; j < ch.length-1; j++) {
				System.out.println(ch[i]);
				
			}
		}
		System.out.println("length"+ch.length);
	}

}
