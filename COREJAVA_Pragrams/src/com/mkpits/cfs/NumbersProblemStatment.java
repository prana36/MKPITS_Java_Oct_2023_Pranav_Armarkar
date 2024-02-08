package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import com.mkpits.abstractions.BankRegistration;

public class NumbersProblemStatment {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a  num :- ");
		int num = Integer.parseInt(br.readLine());
		int rem,sum = 0;
		//int n= num,ne,result;
		
		
		while(num!=0|| sum>10) {
			
			if (num==0) 
			{
				num=sum;
				sum=0;
				
			}
			
			
			rem=num%10;
			//System.out.println(rem);
			sum= sum+rem;
			
			num=num/10;
			//			System.out.println(sum);
			//sum=(sum%10)+(sum/10);
			
		}
//		//System.out.println(sum);
//		//System.out.println("sigle num is "+num);
//		while(sum!=0) {
//			ne=ne+(sum%10);
//			sum=sum/10;
//		}
		System.out.println("Remaing sum is :-"+sum);


	}
	
	
	
	

}
