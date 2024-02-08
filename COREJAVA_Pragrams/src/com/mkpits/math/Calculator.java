package com.mkpits.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	// Requirment :- Creat Calculator
	//
	// 
	
	
	
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	double num1,num2;
	
	public static void main (String[] args ) throws NumberFormatException, IOException
	{
		
	Calculator ca = new Calculator();
	
		
	}


		Calculator() throws NumberFormatException, IOException
	     {
			System.out.println("Calculator");

	    	 System.out.print("Enter 1st No. :- ");
	    	 while (true) {
	    		  String a1= br.readLine();
	    		 if (a1.isEmpty()|| !a1.matches("\\d+")) {
	    			 System.out.print("Please Enter 1st No. :- ");
	    			 continue;
				}
				 num1=Double.parseDouble(a1);
	    		 break;
	    		   
			}
	    	 
	    	 System.out.print("Enter 2nd No. :- ");
	    	 
	    	 while (true) {
	    		 String a2= br.readLine();
	    		 if (a2.isEmpty()|| !a2.matches("\\d+")) {
	    			 System.out.print("Please Enter 2nd No. :- ");
	    			 continue;
				}
	    		 num2 = Double.parseDouble(a2);
				
	    		 break;
	    		   
			}
	    	 
	    	
	    	 char ch = 'y';
	 		while (ch == 'y' || ch == 'Y') 
	 		{		
	 		System.out.println("1.Addition \n2.Substraction");
	         System.out.print("Enter choice :- ");
	         int  choice = Integer.parseInt(br.readLine()); 
	        
	        switch (choice) {
	 	case 1: addition();
	 		break;
	 	case 2: substraction();
 		break;
	 		
	 	default:
			System.err.println("Enter Valid Choice");
			break;
	 		
	 	 }
	    	System.out.println("\n Do You Wish to Continue Y|N");
			ch = (char) br.read();
			br.readLine();
	 		 
	  }
	 	
   }
		


		void addition()throws NumberFormatException, IOException 
		  {
             
		 			
		 				double sum = num1+num2;
				 		
			 			System.out.println(+sum);
				 		
				 		char p = 'y';
				 		while (true) 
				 		{
				 			System.out.print("\n Do You Wish to Add no. Y|N :- ");
							 p =  (char) br.read();
								br.readLine();
							 
				 			if (p=='y'||p=='Y') 
				 			{
				 				System.out.println("Enter no . please ");
				                  
				                   String n2 = br.readLine();
									
									if(n2.isEmpty()|| !n2.matches(n2))
									{
									
										System.err.print("please   ");
									   continue;
									}
									 double n1 = Double.parseDouble(n2);
									sum+=n1;
									
									break;
								
							}
				 			break;
				 		}
				 		System.out.print("Addition is :- "+sum);
				 			
				
			}

		   void substraction() throws IOException {
			   

				double tot= num1-num2;
		 		
	 			System.out.println(+tot);
		 		
		 		char p = 'y';
		 		while (true) 
		 		{
		 			System.out.print("\n Do You Wish to sub no. Y|N :- ");
					 p =  (char) br.read();
						br.readLine();
					 
		 			if (p=='y'||p=='Y') 
		 			{
		 				System.out.println("Enter no . please ");
		                  
		                   String n2 = br.readLine();
							
							if(n2.isEmpty()|| !n2.matches(n2))
							{
							
								System.err.print("please   ");
							   continue;
							}
							 double n1 = Double.parseDouble(n2);
							tot-=n1;
							
							break;
						
					}
		 			break;
		 		}
		 		System.out.print("Addition is :- "+tot);
			
			
		}
}