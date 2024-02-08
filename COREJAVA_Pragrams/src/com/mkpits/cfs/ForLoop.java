package com.mkpits.cfs;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoop {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Hello");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Num. :- ");
		//int n =Integer.parseInt(br.readLine());
		//System.out.println("Enter Table No. :- ");
		long num = Long.parseLong(br.readLine());
		//long tab=1;
		long fact=1;
		long fib = 0 ,n1=0,n2=1;
		 long sum=0;
		
		
//		for(long i=num ;i>=1 ; i--) {
//			
//			 fact = fact*i;
//			 System.out.print(i+"*");
//			}
//		
//		System.out.println("Factorial is "+fact);
//		
//		System.out.println("TABLE : - ");
//		
//		 for(long j=1 ; j<=10 ; j++) {
//			// tab= num*j;
//			 
//			 System.out.println(""+num+"*"+j+"="+(num*j));
//		 }
//		 for (long k=0;k<=num;k++)
//		 {
//			 fib= (n1+n2)+k;
//		 }
//		 System.out.println(fib);
			
		
		for (long p=1;p<=num;p++) {
			sum=sum+p;
			
		}
		System.out.println("the sum of natural no. is  "+sum);
		}

}
  


