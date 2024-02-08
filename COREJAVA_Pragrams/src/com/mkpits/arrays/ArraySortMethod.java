package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class ArraySortMethod {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		ArraySortMethod asm = new ArraySortMethod();
		asm.sorting();
		
		
	}

	

	private void sorting() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter range :- ");
		int r=Integer.parseInt(br.readLine());
		
		
		String num[]=new String[r];
		
		for (int i = 0; i < num.length; i++) {
			 num[i]=br.readLine();
			
		}
		for (int i = 0; i < num.length; i++) {
			String string = num[i];
			System.out.println(num[i]);
			
		}
		
		
		System.out.println("After sorting \n");
		
		
		
		System.out.println("Acending Order ");
        // these is using for sorting to acending order
		Arrays.sort(num);
		
		for (String number:num ) {
			System.out.println( number);
		}
		
	
		
		System.out.println("Decending order \n");
		Arrays.sort(num, Collections.reverseOrder());
		for (String reverse : num) {
			System.out.println(reverse);
			
		}
		
	}
	

}
