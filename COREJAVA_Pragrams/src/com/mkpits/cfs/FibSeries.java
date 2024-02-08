package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class FibSeries {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Num. :- ");
		//int n =Integer.parseInt(br.readLine());
		//System.out.println("Enter Table No. :- ");
		long num = Long.parseLong(br.readLine());
		//long tab=1;
		int fib,n1=0,n2=1;
		 
		for (int i = 0; i <= num; i++) {
			 fib=n1+n2;
			System.out.println(fib);
			n1=n2;
			n2=fib;
			
			
		}
		
	}

}
