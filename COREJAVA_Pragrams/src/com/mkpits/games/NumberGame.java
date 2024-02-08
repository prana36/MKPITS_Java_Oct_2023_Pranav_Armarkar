package com.mkpits.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {

	public static void main(String[] args) throws IOException {
		int randomNo ;
		
		
		randomNo = (int)Math.floor(Math.random()*100);
		System.out.println("Random No. Is  "+randomNo);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		

        
		
        for(int i=1 ; i<=10 ; i++) {
        	

    		System.out.println("Enter a num. ");
    		 int num = Integer.parseInt(br.readLine());
    		 
    		 
    		  if(num==randomNo) {
    			  System.out.println("You are Win");
    			  System.out.println("Your is Attempt"+i);
    			  break;
    			  
    			  
    		  }else {
    			  
    			  if (num>randomNo) {
    				  System.out.println("No. is greater");
					
				}
    			  if (num<randomNo) {
    				  System.out.println("No. is lesser");
    				  
    			  }System.out.print("Again  ");
    		  }
    		  
    		  
    		  
      }
    	  
	

	
		
	}

}
