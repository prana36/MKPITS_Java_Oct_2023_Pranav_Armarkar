package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayIdentification {
//    int num;
//	int str;
//	//int array[];


	public static void main(String[] args) throws IOException {
		ArrayIdentification ai=new ArrayIdentification();
		ai.arrayDeclearation();
		//ai.check(str, num);

	}
	static void check(int arrray[],int num) {
		
		
	}
	
	 
	void arrayDeclearation() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Range Of Array:- ");
		int range=Integer.parseInt(br.readLine());
		int array[]=new int[range];
		for (int i = 0; i < array.length; i++) {
			array[i]=Integer.parseInt(br.readLine());
			
		}
		for (int i = 0; i < array.length; i++) {
			int  str = array[i];
			System.out.print(" "+str+"\n");
			

		}
		
		System.out.println("Enter Element ");
		while(true) 
		{
		//int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < array.length; i++) {
			int num = Integer.parseInt(br.readLine());
			 if (array[i] == num) 
			 {
					System.out.println("Element is present "+i+" index and possition is "+(i+1));
					break;
				 }else 
				 {
					 System.out.println("element is not present please enter valide num.  ");
					 continue;
				 }
			
		} break;
				}
			
		}
		
		
}		
		
		
		
		
		
		
		
		
		
		
//		while (true) {
//			
//		
//		 num=Integer.parseInt(br.readLine());
//		
//		
//		 this.num=num;
//		
//		 int i = 0;
//		 if (array[i] == num) {
//			System.out.println("Element is present ");
//			break;
//		 }
//		}
//		
		
		
		
		
//		
//		for (int j = 0; j < num.length; j++) {
//			num[j]=Integer.parseInt(br.readLine());
//			
//				
//			} 
//			
//			
//			
//
//		}
		
		
		//System.out.println("Enter num for check ");
		//int num =Integer.parseInt(br.readLine());
//		int i=0;
//		int str = array[i];
		
	
			
			
		//	int j=0;
//			int i=0;
//			if (num[j] ==array[i]) {
//				System.out.println("Element is Present ");
//				//break;
//				
//			} else {
//				System.out.println("Element is not Present \n Enter Different Element ");
//				
//			}
////			
//		
//		
//	}
	


