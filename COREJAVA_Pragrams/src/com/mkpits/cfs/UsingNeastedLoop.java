package com.mkpits.cfs;

public class UsingNeastedLoop {

	public static void main(String[] args) {
		
		
		
		
		
		//Triangle program
		
		
		for (int i = 0; i <  5 ; i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
				
			}
			System.out.println("+");
		}
	   
		
		
		//Weeks and Days
		int weeks=4, days=7;
		for (int i = 1; i <= weeks; i++) 
		{
			for (int j = 1; j <= days; j++) 
			{
				System.out.println("day "+j);
				
			}
			System.out.println("Week "+i);
			
		}
		//
		 
		for (int i =1; i<= 5 ; i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		
		for (int i =5; i>= 1 ; i--) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
	

	
	
		int  k = 0;

	    for (int i = 1; i <= 5; ++i,k=0) {
	    	
	    	
	      for (int j = 1; j <= 5 - i; ++j) {
	        System.out.print("  +");
	      }

//	      while (k != 2 * i - 1) {
//	        System.out.print("* ");
//	        ++k;
//          }
	      

	      System.out.println();
	    }
	    
	    
	    for (int i=1; i<10; i += 2)
	    {
	        for (int j=0; j<i; j++)
	        {
	            System.out.print("*");
	        }
	        System.out.println("");
	    }
	   
    }
}
