package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class AmstrongNumber {
	int module;

	public static void main(String[] args) throws NumberFormatException, IOException {
		AmstrongNumber an = new AmstrongNumber();
		
		an.amstrongOperation();
		
	}

	public void amstrongOperation() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter num. ");
		int n=Integer.parseInt(br.readLine());
		int num=n;
		int result=0;
		
		while(num!=0) {
		  
			  module =num%10;
			  
			  result=result+(module*module*module);
			  
			 num =num/10;
		}
			  
			  if (result==n) {
				  System.out.println("Number is Amstrong No. ");
				
			}else 
			{
				System.out.println("Number is not Amstrong No.");
			}
			 
		//}	  
			  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		aCube=a*a*a;
//		System.out.print("Enter 2nd num. ");
//		b=Integer.parseInt(br.readLine());
//		bCube=b*b*b;
//		System.out.print("Enter 3rd num. ");
//		c=Integer.parseInt(br.readLine());
//		cCube=c*c*c;
		
		
//			
//			if ((aCube+bCube+cCube)==abc) {
//				System.out.println("it is an Amstrong No. ");
//				break;
//				
//			}else 
//			{
//			System.out.println("Invalide Please Enter Different No.s ");
//			}
//			
//			
//		
//			
//	}
	}
}
